package br.com.caelum.jdbc.modelo;

import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;

@Entity
public class Pessoas {
	private Long id;
	private String cpf;
	private String nome;
	private String email;
	private String celular;
	private TipoLogradouros tipologradouros;
	private String numero;
	private String complemento;

	@Id
	@GeneratedValue
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCelular() {
		return celular;
	}

	public void setCelular(String celular) {
		this.celular = celular;
	}
	@ManyToOne
	@JoinColumn(name = "id_tipo_logradouro", nullable = false)
	public TipoLogradouros getTipologradouros() {
		return tipologradouros;
	}

	public void setTipologradouros(TipoLogradouros tipologradouros) {
		this.tipologradouros = tipologradouros;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getComplemento() {
		return complemento;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}
}
