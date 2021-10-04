
public class Cliente {

	private String nome;
	private String cpf;
	private String habilitacao;
	private static int totalClientes;
	
	//Informações necessarias para Instanciar um Cliente
	public Cliente(String nome, String cpf, String habilitacao) {
		this.nome = nome;
		this.cpf = cpf;
		this.habilitacao = habilitacao;
		this.totalClientes = this.totalClientes + 1;
	}
	
	// Para exibir o Nome
	public String getNome() {
		return nome;
	}
	
	// Para exibir o CPF
	public String getCpf() {
		return cpf;
	}
	
	// Para exibir o tipo da CNH		
	public String getHabilitacao() {
		return habilitacao;
	}
	
	// Caso o cliente queira ter mais de uma habilitacao
	public void setHabilitacao(String habilitacao) {
		this.habilitacao = this.habilitacao + habilitacao;
	}
	
	// Para saber quantos clientes foram instanciados
	public static int getTotalClientes() {
		return totalClientes = totalClientes + 1;
	}

}
