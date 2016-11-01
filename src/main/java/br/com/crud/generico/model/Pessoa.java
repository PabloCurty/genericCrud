package br.com.crud.generico.model;

public class Pessoa extends AbstractEntity_impl{
	

	String nome;
	String sobrenome;

	public Pessoa(String oid) {
		super(oid);
	}

	public Pessoa(String oid, String nome, String sobrenome) {
		super(oid);
		this.nome = nome;
		this.sobrenome = sobrenome;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}


}
