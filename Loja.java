public class Loja {

	private Funcionario funcionario;
	private Veiculo equipamentos;
	private double caixa;
	private double venda;
	private boolean confirmaVenda;
	
	//Exibe o valor oferecido pelo cliente
	public double getVenda() {
		return venda;
	}
	
	// Valor oferecido pelo cliente
	public void setVenda(double venda) {
		this.venda = venda;
	}
	
	// Exibe se a compra foi feita ou não
	public boolean isConfirmaVenda() {
		if (this.venda > 10000) {
			this.caixa = this.caixa + this.venda;
			System.out.println("Parabéns pela compra!!!");
			return true;
		}
		else {
			System.out.println("Quantidade insuficiente!!!");
			return false;
		}
	}

	//Exibe o caixa da loja
	public double getCaixa() {
		return this.caixa;
	}
	
	//Para colocar ou retirar dinheiro diretamente do caixa
	public void setCaixa(double caixa) {
		this.caixa = caixa;
	}
	
	//exibe os equipamentos a venda
	public Veiculo getEquipamentos() {
		return this.equipamentos;
	}
	
	//Exibe os funcionarios 
	public Funcionario getFuncionario() {
		return this.funcionario;
	}
}
