package br.gov.mg.bomdestino.stur.repository;

import java.util.List;

import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;

import br.gov.mg.bomdestino.stur.modelo.ITR;

public interface ITRRepository extends CrudRepository<ITR, Integer> {
	List<ITR> findByContribuinte_Cnpj(String cnpj);

	Iterable<ITR> findAll(Pageable paginacao);
}
