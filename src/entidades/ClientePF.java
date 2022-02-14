package entidades;

public class ClientePF extends Pessoa {

	private String dataNascimento;
	private String cpf;
	
	
	public ClientePF() {
		
	}
	
	public ClientePF(String nome, String celular, String dataNascimento, String cpf) {
		super(nome, celular);
		this.dataNascimento = dataNascimento;
		this.cpf = cpf;
	}

	public String getDataNascimento() {
		return dataNascimento;
	}


	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}


	public String getCpf() {
		return cpf;
	}


	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	
	
	
	
	
	
}
