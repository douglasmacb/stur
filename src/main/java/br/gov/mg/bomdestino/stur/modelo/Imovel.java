package br.gov.mg.bomdestino.stur.modelo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Imovel {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	private String nome;
	private String numeroReceitaFederal;
	@OneToOne
	private Endereco endereco;
	private Integer loteamento;
	private String areaTotal;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNumeroReceitaFederal() {
		return numeroReceitaFederal;
	}

	public void setNumeroReceitaFederal(String numeroReceitaFederal) {
		this.numeroReceitaFederal = numeroReceitaFederal;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public Integer getLoteamento() {
		return loteamento;
	}

	public void setLoteamento(Integer loteamento) {
		this.loteamento = loteamento;
	}

	public String getAreaTotal() {
		return areaTotal;
	}

	public void setAreaTotal(String areaTotal) {
		this.areaTotal = areaTotal;
	}

}
