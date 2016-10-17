package fj11;

public class Programa {

	public static void main(String[] args) {
		//o new - está instânciando a conta. Criando em seguida objeto conta
		Conta minhaConta = new Conta();
		minhaConta.dono = "duke";
		minhaConta.saldo = 1000.0;
		
		System.out.println("Saldo atual: " + minhaConta.saldo);
	}

}
