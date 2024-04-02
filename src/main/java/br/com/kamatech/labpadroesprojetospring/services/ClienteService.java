package br.com.kamatech.labpadroesprojetospring.services;

import br.com.kamatech.labpadroesprojetospring.models.Cliente;
import br.com.kamatech.labpadroesprojetospring.models.Endereco;
import br.com.kamatech.labpadroesprojetospring.repositories.ClienteRepository;
import br.com.kamatech.labpadroesprojetospring.repositories.EnderecoRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClienteService {

  @Autowired
  private ClienteRepository repository;
  @Autowired
  private EnderecoRepository enderecoRepository;
  @Autowired
  private EnderecoService enderecoService;

  public List<Cliente> getAll() {
    return repository.findAll();
  }

  public Cliente save(Cliente cliente) {
    String cep = cliente.getEndereco().getCep();
    Endereco endereco = enderecoRepository.findById(cep)
        .orElseGet(() -> {
          Endereco novoEndereco = enderecoService.buscarEndereco(cep);
          return enderecoRepository.save(novoEndereco);
        });
    cliente.setEndereco(endereco);

    return repository.save(cliente);
  }
}
