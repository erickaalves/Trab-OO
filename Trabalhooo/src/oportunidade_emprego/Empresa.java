package oportunidade_emprego;

public class Empresa {
	private String nome_empresa;
	private String local_empresa;
	private int numero_func;
	private String site;
	private String faturamento;
	private String setor;
	
	
	public Empresa(String nome_empresa, String local_empresa, int numero_func, String site, String faturamento,
			String setor) {
		super();
		this.nome_empresa = nome_empresa;
		this.local_empresa = local_empresa;
		this.numero_func = numero_func;
		this.site = site;
		this.faturamento = faturamento;
		this.setor = setor;
	}
	public String getNome_empresa() {
		return nome_empresa;
	}
	public void setNome_empresa(String nome_empresa) {
		this.nome_empresa = nome_empresa;
	}
	public String getLocal_empresa() {
		return local_empresa;
	}
	public void setLocal_empresa(String local_empresa) {
		this.local_empresa = local_empresa;
	}
	public int getNumero_func() {
		return numero_func;
	}
	public void setNumero_func(int numero_func) {
		this.numero_func = numero_func;
	}
	public String getSite() {
		return site;
	}
	public void setSite(String site) {
		this.site = site;
	}
	public String getFaturamento() {
		return faturamento;
	}
	public void setFaturamento(String faturamento) {
		this.faturamento = faturamento;
	}
	public String getSetor() {
		return setor;
	}
	public void setSetor(String setor) {
		this.setor = setor;
	}
	
	public void visao_geral() {
	
}

}
