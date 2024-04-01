package br.com.kamatech.labpadroesprojetospring.repositories;

import br.com.kamatech.labpadroesprojetospring.models.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {

}
