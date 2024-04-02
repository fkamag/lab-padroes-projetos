package br.com.kamatech.labpadroesprojetospring.services;

import br.com.kamatech.labpadroesprojetospring.models.Cliente;
import br.com.kamatech.labpadroesprojetospring.repositories.ClienteRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClienteService {

  @Autowired
  ClienteRepository repository;

  public List<Cliente> getAll() {
    return repository.findAll();
  }

}
