package oportunidade_emprego;

public class Cargo {
	private String nome_cargo;
	private String area_cargo;
	private int salario_base_cargo;
	
	public Cargo(String nome_cargo, String area_cargo, int salario_base_cargo) {
		super();
		this.nome_cargo = nome_cargo;
		this.area_cargo = area_cargo;
		this.salario_base_cargo = salario_base_cargo;
	}
	public String getNome_cargo() {
		return nome_cargo;
	}
	public void setNome_cargo(String nome_cargo) {
		this.nome_cargo = nome_cargo;
	}
	public String getArea_cargo() {
		return area_cargo;
	}
	public void setArea_cargo(String area_cargo) {
		this.area_cargo = area_cargo;
	}
	public int getSalario_base_cargo() {
		return salario_base_cargo;
	}
	public void setSalario_base_cargo(int salario_base_cargo) {
		this.salario_base_cargo = salario_base_cargo;
	}
	public void adicionar_cargo() {
		
	}
	public void listar_cargos() {
		
	}
	
}
