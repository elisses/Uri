package fj11;

public class Conta {
	int numero;
	String dono;
	double saldo;
	double limite;
	
	void saca(double quantidade){
		double novoSaldo = this.saldo - quantidade;
		this.saldo = novoSaldo;
	}
	
	void deposita(double quantidade){
		this.saldo += quantidade;
	}

}
