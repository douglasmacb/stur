package br.gov.mg.bomdestino.stur.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.data.web.PageableDefault;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import br.gov.mg.bomdestino.stur.modelo.ITR;
import br.gov.mg.bomdestino.stur.repository.ITRRepository;

@RestController
@RequestMapping("/itr")
public class ITRController {

	@Autowired
	private ITRRepository itrRepository;

	@GetMapping("/cnpj/{cnpj}")
	public List<ITR> findByCnpj(@PathVariable String cnpj) {
		return itrRepository.findByContribuinte_Cnpj(cnpj);
	}

	@GetMapping()
	@Cacheable(value = "findAllItr")
	public @ResponseBody Iterable<ITR> findAll(@PageableDefault(direction = Direction.ASC, sort = "id") Pageable pageable) {
		return itrRepository.findAll(pageable);
	}
}
