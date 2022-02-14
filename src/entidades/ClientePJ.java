package entidades;

public class ClientePJ extends Pessoa {

	
	public String cnpj;
	public String dataCriacao;
	
	public ClientePJ() {
		
	}
	
	public ClientePJ(String cnpj, String dataCriacao) {
		super();
		this.cnpj = cnpj;
		this.dataCriacao = dataCriacao;
	}

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCnpj() {
		return cnpj;
	}
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	public String getCelular() {
		return celular;
	}
	public void setCelular(String celular) {
		this.celular = celular;
	}
	public String getDataCriacao() {
		return dataCriacao;
	}
	public void setDataCriacao(String dataCriacao) {
		this.dataCriacao = dataCriacao;
	}
}
