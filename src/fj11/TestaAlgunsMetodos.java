package fj11;

public class TestaAlgunsMetodos {

	public static void main(String[] args) {
		//criando conta
		Conta minhaConta = new Conta();
		
		//alterando os valores da minha conta
		minhaConta.dono = "Duke";
		minhaConta.saldo = 1000.0;
		
		//saca 200 reais
		minhaConta.saca(200);
		
		//deposita 500 reais
		minhaConta.deposita(500);
		
		//resultado
		
		System.out.println(minhaConta.saldo);
		
		//com retorno
		minhaConta.saldo = 1000;
		boolean consegui = minhaConta.saca(2000);
			if (consegui) {
				System.out.println("Consegui sacar");
			} 
			else {
					System.out.println("N�o consegui sacar");
			}
	}

}
