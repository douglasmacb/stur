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

import br.gov.mg.bomdestino.stur.modelo.IPTU;
import br.gov.mg.bomdestino.stur.repository.IPTURepository;

@RestController
@RequestMapping("/iptu" )
public class IPTUController {

	@Autowired
	private IPTURepository iptuRepository;
	
	@GetMapping("/cpf/{cpf}")
	public List<IPTU> findByCpf(@PathVariable String cpf) {
		return iptuRepository.findByContribuinte_Cpf(cpf);
	}
	
	@GetMapping("/cnpj/{cnpj}")
	public List<IPTU> findByCnpj(@PathVariable String cnpj) {
		return iptuRepository.findByContribuinte_Cnpj(cnpj);
	}
	
	@GetMapping
	@Cacheable(value = "findAllIptu")
	public @ResponseBody Iterable<IPTU> findAll(@PageableDefault(direction = Direction.ASC, sort = "id") Pageable pageable) {
		return iptuRepository.findAll(pageable);
	}
}
