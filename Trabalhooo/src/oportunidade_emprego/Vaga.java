package oportunidade_emprego;

public class Vaga {
	private Empresa nome_empresa;
	private Empresa local_empresa;
	private String modalidade;
	private Cargo cargo_da_vaga;
	private int número_inscritos;
	
	
	public Vaga(Empresa nome_empresa, Empresa local_empresa, String modalidade, Cargo cargo_da_vaga,
			int número_inscritos) {
		super();
		this.nome_empresa = nome_empresa;
		this.local_empresa = local_empresa;
		this.modalidade = modalidade;
		this.cargo_da_vaga = cargo_da_vaga;
		this.número_inscritos = número_inscritos;
	}
	public Empresa getNome_empresa() {
		return nome_empresa;
	}
	public void setNome_empresa(Empresa nome_empresa) {
		this.nome_empresa = nome_empresa;
	}
	public Empresa getLocal_empresa() {
		return local_empresa;
	}
	public void setLocal_empresa(Empresa local_empresa) {
		this.local_empresa = local_empresa;
	}
	public String getModalidade() {
		return modalidade;
	}
	public void setModalidade(String modalidade) {
		this.modalidade = modalidade;
	}
	public Cargo getCargo_da_vaga() {
		return cargo_da_vaga;
	}
	public void setCargo_da_vaga(Cargo cargo_da_vaga) {
		this.cargo_da_vaga = cargo_da_vaga;
	}
	public int getNúmero_inscritos() {
		return número_inscritos;
	}
	public void setNúmero_inscritos(int número_inscritos) {
		this.número_inscritos = número_inscritos;
	}
	
	public void listar_candidatos() {
		 
	}
	public void abrir_vaga() {
		
	}
	public void fechar_vagas () {
		
	}
	public void listar_vagas () {
		
	}
	public void buscar_vagas() {}
}
