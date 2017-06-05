package br.com.caelum.jdbc.modelo;

import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;

@Entity
public class Logradouros {
	private Long id;
	private String cep;
	private String nome;
	private TipoLogradouros tipologradouros;
	private Bairros bairros;

	@Id
	@GeneratedValue
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	@ManyToOne
	@JoinColumn(name = "id_tipo_logradouro", nullable = false)
	public TipoLogradouros getTipologradouros() {
		return tipologradouros;
	}

	public void setTipologradouros(TipoLogradouros tipologradouros) {
		this.tipologradouros = tipologradouros;
	}

	@ManyToOne
	@JoinColumn(name = "id_bairro", nullable = false)
	public Bairros getBairros() {
		return bairros;
	}

	public void setBairros(Bairros bairros) {
		this.bairros = bairros;
	}
}
