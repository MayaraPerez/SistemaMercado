package entidades;

public class Pessoa {

	protected String nome;
	protected String celular;
	
	public Pessoa() {
		
	}
	
	public Pessoa(String nome, String celular) {
		this.nome = nome;
		this.celular = celular;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCelular() {
		return celular;
	}

	public void setCelular(String celular) {
		this.celular = celular;
	}
	
	
}
