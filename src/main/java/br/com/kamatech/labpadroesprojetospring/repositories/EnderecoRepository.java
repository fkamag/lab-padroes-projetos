package br.com.kamatech.labpadroesprojetospring.repositories;

import br.com.kamatech.labpadroesprojetospring.models.Endereco;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EnderecoRepository extends JpaRepository<Endereco, String> {

}
