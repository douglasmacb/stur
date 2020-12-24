package br.gov.mg.bomdestino.stur.repository;

import java.util.List;

import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;

import br.gov.mg.bomdestino.stur.modelo.IPTU;

public interface IPTURepository extends CrudRepository<IPTU, Integer> {
	List<IPTU> findByContribuinte_Cpf(String cpf);
	List<IPTU> findByContribuinte_Cnpj(String cnpj);
	Iterable<IPTU> findAll(Pageable pageable);
}
