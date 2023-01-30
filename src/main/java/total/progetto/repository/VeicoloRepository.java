package total.progetto.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import total.progetto.model.Veicolo;

@Repository
public interface VeicoloRepository extends JpaRepository<Veicolo, Long>{
	
	/*
	 * siccome nella jparepository non ho i find by prezzo 
	 * devo impostarlo io
	 */
	@Query
	List<Veicolo>findByPrezzo(Long prezzo);
	@Query
	List<Veicolo>findByTarga(String targa);
	@Query
	List<Veicolo>findByNumeroRuote(Long id);

}
