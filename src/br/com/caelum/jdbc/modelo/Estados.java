package br.com.caelum.jdbc.modelo;

public class Estados {
	private Long id;
	private String uf;
	private String nome;

	public Long getId() {
		return id;
	}

	public void setId(long l) {
		this.id = (long) l;
	}

	public String getUf() {
		return uf;
	}

	public void setUf(String uf) {
		this.uf = uf;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

}
