package fj11;

public class Funcionario {

	String nome;
	String departamento;
	double salario;
	Data dataDeEntrada;
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
		System.out.println("Nome: "+ this.nome);
		System.out.println("Departamento: "+ this.departamento);
		System.out.println("Salario: "+ this.salario);		
		System.out.println("RG: "+ this.rg);
		System.out.println("Está na empresa: "+ this.estaNaEmpresa);
		System.out.println("Data de entrada: "+ dataDeEntrada.Formatada());
	}	
		
}
