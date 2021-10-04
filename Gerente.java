
public class Gerente extends Funcionario{
	private int senha = 7311;
	
	// Senha exclusiva ao gerente
	public boolean permitirAcesso(int senha) {
		if (this.senha == senha) {
			System.out.println("Acesso permitido!!!");
			return true;
		} else {
			System.out.println("Senha invalida!!!");
			return false;
		}
	}

}
