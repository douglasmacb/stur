package br.gov.mg.bomdestino.stur.modelo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class IPTU {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	@ManyToOne
	private Contribuinte contribuinte;
	@ManyToOne
	private Endereco enderecoEntrega;
	@ManyToOne
	private Imovel imovel;
	
	private Integer exercicio;

	private Double impostoTerritorial;
	private Double impostoPredial;
	private Double valorVenalTerreno;
	private Double valorVenal;
	private Double conservacaoCalcamento;
	private Integer inscricaoImobiliaria;
	private Double limpezaPublica;

	public Contribuinte getContribuinte() {
		return contribuinte;
	}

	public void setContribuinte(Contribuinte contribuinte) {
		this.contribuinte = contribuinte;
	}

	public Endereco getEnderecoEntrega() {
		return enderecoEntrega;
	}

	public void setEnderecoEntrega(Endereco enderecoEntrega) {
		this.enderecoEntrega = enderecoEntrega;
	}

	public Imovel getImovel() {
		return imovel;
	}

	public void setImovel(Imovel imovel) {
		this.imovel = imovel;
	}

	public Double getImpostoTerritorial() {
		return impostoTerritorial;
	}

	public void setImpostoTerritorial(Double impostoTerritorial) {
		this.impostoTerritorial = impostoTerritorial;
	}

	public Double getImpostoPredial() {
		return impostoPredial;
	}

	public void setImpostoPredial(Double impostoPredial) {
		this.impostoPredial = impostoPredial;
	}

	public Double getValorVenalTerreno() {
		return valorVenalTerreno;
	}

	public void setValorVenalTerreno(Double valorVenalTerreno) {
		this.valorVenalTerreno = valorVenalTerreno;
	}

	public Double getValorVenal() {
		return valorVenal;
	}

	public void setValorVenal(Double valorVenal) {
		this.valorVenal = valorVenal;
	}

	public Double getConservacaoCalcamento() {
		return conservacaoCalcamento;
	}

	public void setConservacaoCalcamento(Double conservacaoCalcamento) {
		this.conservacaoCalcamento = conservacaoCalcamento;
	}

	public Integer getInscricaoImobiliaria() {
		return inscricaoImobiliaria;
	}

	public void setInscricaoImobiliaria(Integer inscricaoImobiliaria) {
		this.inscricaoImobiliaria = inscricaoImobiliaria;
	}

	public Double getLimpezaPublica() {
		return limpezaPublica;
	}

	public void setLimpezaPublica(Double limpezaPublica) {
		this.limpezaPublica = limpezaPublica;
	}

	public Integer getExercicio() {
		return exercicio;
	}

	public void setExercicio(Integer exercicio) {
		this.exercicio = exercicio;
	}

}
