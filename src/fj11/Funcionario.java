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
	
	public void mostra(){
		System.out.println("Nome: "+ nome);
		System.out.println("Departamento: "+ departamento);
		System.out.println("Salario: "+ salario);
		System.out.println("Data entrada: "+ dataDeEntrada);
		System.out.println("RG: "+ rg);
		System.out.println("Está na empresa: "+ estaNaEmpresa);		
	}
		
}
