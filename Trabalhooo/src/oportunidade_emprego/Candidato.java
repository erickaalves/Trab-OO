package oportunidade_emprego;

public class Candidato extends Pessoa{
	private int numero_contato;
	private String email_contato;
	private String curriculo;
	

	public Candidato(String nome, int idade, int cpf, String estado_civil, int numero_contato, String email_contato,
			String curriculo) {
		super(nome, idade, cpf, estado_civil);
		this.numero_contato = numero_contato;
		this.email_contato = email_contato;
		this.curriculo = curriculo;
	}
	
	public int getNumero_contato() {
		return numero_contato;
	}
	public void setNumero_contato(int numero_contato) {
		this.numero_contato = numero_contato;
	}
	public String getEmail_contato() {
		return email_contato;
	}
	public void setEmail_contato(String email_contato) {
		this.email_contato = email_contato;
	}
	public String getCurriculo() {
		return curriculo;
	}
	public void setCurriculo(String curriculo) {
		this.curriculo = curriculo;
	}
	public void avaliar_empresa() {
		
	}
	public void adicionar_cv() {
		
	}
	public void candidatar_vaga() {
		
	}

}
