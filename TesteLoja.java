
public class TesteLoja {

	public static void main(String[] args) {
		
		Loja motorDeath = new Loja();
		
		motorDeath.setCaixa(894521.4);
		motorDeath.getCaixa();
		motorDeath.setVenda(12000);
		motorDeath.isConfirmaVenda();
		
		Veiculo carro = new Veiculo();
		carro.setAno(2018);
		carro.setChassi(123456789);
		carro.setAro(18);
		carro.setMarca("Hyundai");
		carro.setModelo("HB20");
		carro.setPotencia(100);
		
		
		Cliente fernando = new Cliente("Fernando", "222.222.222-22", "A ");
		fernando.setHabilitacao("B");
		System.out.println(fernando.getHabilitacao());
		
	}
}
