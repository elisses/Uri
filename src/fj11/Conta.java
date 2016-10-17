package fj11;

public class Conta {
	int numero;
	String dono;
	double saldo;
	double limite;
	
	//saca valor sem retorno
//	void saca(double quantidade){
//		double novoSaldo = this.saldo - quantidade;
//		this.saldo = novoSaldo;
//	}
	
	//deposita valor sem retorno
	void deposita(double quantidade){
		this.saldo += quantidade;
	}
	
	//saca valor com retorno
	
	boolean saca(double valor){
		if(this.saldo < valor){
			return false;
		}
		else{
			this.saldo += valor;
			return true;
		}
	}
}
