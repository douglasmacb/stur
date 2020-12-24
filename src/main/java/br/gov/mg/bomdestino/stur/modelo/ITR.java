package br.gov.mg.bomdestino.stur.modelo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class ITR {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;

	@ManyToOne
	private Contribuinte contribuinte;

	@ManyToOne
	private Imovel imovel;
	
	private Integer exercicio;
	
	private String valorTerraNuaTributavel;
	private String impostoDevido;
	private String impostoCalculado;
	private Boolean declaracaoRetificadora;
	private String valorQuota;
	private Integer quantidadeQuotas;

	public Contribuinte getContribuinte() {
		return contribuinte;
	}

	public void setContribuinte(Contribuinte contribuinte) {
		this.contribuinte = contribuinte;
	}

	public Imovel getImovel() {
		return imovel;
	}

	public void setImovel(Imovel imovel) {
		this.imovel = imovel;
	}

	public String getValorTerraNuaTributavel() {
		return valorTerraNuaTributavel;
	}

	public void setValorTerraNuaTributavel(String valorTerraNuaTributavel) {
		this.valorTerraNuaTributavel = valorTerraNuaTributavel;
	}

	public String getImpostoDevido() {
		return impostoDevido;
	}

	public void setImpostoDevido(String impostoDevido) {
		this.impostoDevido = impostoDevido;
	}

	public String getImpostoCalculado() {
		return impostoCalculado;
	}

	public void setImpostoCalculado(String impostoCalculado) {
		this.impostoCalculado = impostoCalculado;
	}

	public Boolean getDeclaracaoRetificadora() {
		return declaracaoRetificadora;
	}

	public void setDeclaracaoRetificadora(Boolean declaracaoRetificadora) {
		this.declaracaoRetificadora = declaracaoRetificadora;
	}

	public String getValorQuota() {
		return valorQuota;
	}

	public void setValorQuota(String valorQuota) {
		this.valorQuota = valorQuota;
	}

	public Integer getQuantidadeQuotas() {
		return quantidadeQuotas;
	}

	public void setQuantidadeQuotas(Integer quantidadeQuotas) {
		this.quantidadeQuotas = quantidadeQuotas;
	}

	public Integer getExercicio() {
		return exercicio;
	}

	public void setExercicio(Integer exercicio) {
		this.exercicio = exercicio;
	}

}
