package oportunidade_emprego;

public abstract class Pessoa {
	private String nome;
	private int idade;
	private int cpf;
	private String estado_civil;
	
	public Pessoa(String nome, int idade, int cpf, String estado_civil) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.cpf = cpf;
		this.estado_civil = estado_civil;
	}

	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public int getIdade() {
		return idade;
	}


	public void setIdade(int idade) {
		this.idade = idade;
	}


	public int getCpf() {
		return cpf;
	}


	public void setCpf(int cpf) {
		this.cpf = cpf;
	}


	public String getEstado_civil() {
		return estado_civil;
	}


	public void setEstado_civil(String estado_civil) {
		this.estado_civil = estado_civil;
	}

	
	public void adicionar_pessoa() {
	
}
	

}
