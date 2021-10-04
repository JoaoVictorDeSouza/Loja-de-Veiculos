
public abstract class Funcionario {

	private String nome;
	private String nis;
	private double salario;
	private double bonificacao;
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getNis() {
		return nis;
	}
	
	public void setNis(String nis) {
		this.nis = nis;
	}
	
	public double getSalario() {
		return salario;
	}
	
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	public double getBonificacao() {
		return this.bonificacao = this.salario * 0.10;
	}
}
