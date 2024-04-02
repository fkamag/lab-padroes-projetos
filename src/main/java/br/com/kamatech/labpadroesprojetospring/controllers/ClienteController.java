package br.com.kamatech.labpadroesprojetospring.controllers;

import br.com.kamatech.labpadroesprojetospring.models.Cliente;
import br.com.kamatech.labpadroesprojetospring.services.ClienteService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cliente")
public class ClienteController {

  @Autowired
  private ClienteService service;

  @GetMapping
  public ResponseEntity<List<Cliente>> getAll() {
    List<Cliente> clientes = service.getAll();

    return ResponseEntity.status(HttpStatus.OK).body(clientes);
  }

  @PostMapping
  public ResponseEntity<Cliente> create(@RequestBody Cliente cliente) {
    Cliente saved = service.save(cliente);
    return ResponseEntity.status(HttpStatus.CREATED).body(cliente);
  }

}
