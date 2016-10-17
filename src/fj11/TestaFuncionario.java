package fj11;

public class TestaFuncionario {

	public static void main(String[] args) {
		
		
		//adicionando Funcionarios	
		Funcionario f1 = new Funcionario();	
		
		//adicionando Data
		Data data = new Data();
		data.dia = 12;
		data.mes = 10;
		data.ano = 2010;
		f1.dataDeEntrada = data;
				
		f1.nome = "Hugo";
		f1.salario = 100;	
		f1.departamento = "TI";
		f1.rg = "11.223.454-6";
		f1.estaNaEmpresa = true;		
		
//		Funcionario f2 = new Funcionario();		
//		f1.nome = "Hugo";
//		f1.salario = 100;		
//		
		//comparando funcionarios
		
//		if(f1 == f2){
//			System.out.println("iguais");
//		}else{
//			System.out.println("diferentes");
//		}		
		
		//exibindo o resultado
		f1.mostra();
	}

}
