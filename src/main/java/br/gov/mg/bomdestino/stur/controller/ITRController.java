package br.gov.mg.bomdestino.stur.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.gov.mg.bomdestino.stur.enums.ImpostoType;
import br.gov.mg.bomdestino.stur.modelo.Imposto;
import br.gov.mg.bomdestino.stur.repository.ImpostoRepository;

@RestController
@RequestMapping("/itr")
@CrossOrigin
public class ITRController {

	@Autowired
	private ImpostoRepository impostoRepository;

	@GetMapping("/cnpj/{cnpj}")
	public List<Imposto> findByCnpj(@PathVariable String cnpj) {
		return impostoRepository.findByContribuinteCnpjAndTipo(cnpj, ImpostoType.ITR.toString());
	}
}
