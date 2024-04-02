package br.com.kamatech.labpadroesprojetospring.services;

import br.com.kamatech.labpadroesprojetospring.models.Endereco;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "viacep", url = "https://viacep.com.br/ws")
public interface EnderecoService {

  @GetMapping("/{cep}/json")
  Endereco buscarEndereco(@PathVariable String cep);

}
