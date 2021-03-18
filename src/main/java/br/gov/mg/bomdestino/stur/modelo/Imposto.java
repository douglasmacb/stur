package br.gov.mg.bomdestino.stur.modelo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Imposto {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	@ManyToOne
	private Contribuinte contribuinte;
	@ManyToOne
	private Endereco enderecoEntrega;
	@ManyToOne
	private Imovel imovel;
	
	private Double impostoDevido;
	private Double impostoCalculado;
	private String tipoImposto;
	private Integer exercicio; 
}
