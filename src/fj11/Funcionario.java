package fj11;

public class Funcionario {

	String nome;
	String departamento;
	double salario;
	String dataDeEntrada;
	String rg;
	boolean estaNaEmpresa;
	
	public void recebeAumento(double aumento){
		this.salario += aumento;
		
	}
	
		public double calculaGanhoAnual(){
		this.salario = salario * 12;
		return salario;
	}
}
