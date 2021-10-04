public class ControleDeBonificacao {
	private double soma;

	//Para saber e controlar a bonificacao do funcionario instanciado
	public void registra(Funcionario funcionarios) {
		double boni = funcionarios.getBonificacao();
		this.soma = this.soma + boni;
	}
	
	public double getBonificacao() {
		return this.soma;

	}
}
