package br.com.herbertrausch.mongodb;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

@Component
public interface MembroRepository extends MongoRepository<Membro, Long>{
	
	List<Membro> findById(Long id);
	List<Membro> findByNome(String nome);
	List<Membro> findByTelefone(String telefone);
	List<Membro> findByEndereco(String endereco);
	List<Membro> findByBairro(String bairro);
	List<Membro> findByCidade(String cidade);
	List<Membro> findByEstado(String estado);
	List<Membro> findByCep(String cep);
	List<Membro> findByTipo(String tipo);
	List<Membro> findByQtdMembros(String qtdMembros);
	
}

