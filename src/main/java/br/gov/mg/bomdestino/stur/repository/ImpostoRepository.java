package br.gov.mg.bomdestino.stur.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import br.gov.mg.bomdestino.stur.modelo.Imposto;

public interface ImpostoRepository extends CrudRepository<Imposto, Integer> {

    @Query("SELECT i FROM Imposto i JOIN i.contribuinte c WHERE c.cpf = ?1 AND i.tipoImposto = ?2")
    List<Imposto> findByContribuinteCpfAndTipo(String cpf, String tipo);
    
    @Query("SELECT i FROM Imposto i JOIN i.contribuinte c WHERE c.cnpj = ?1 AND i.tipoImposto = ?2")
    List<Imposto> findByContribuinteCnpjAndTipo(String cnpj, String tipo);
}
