package fj11;

public class TestaFuncionario {

	public static void main(String[] args) {
		Funcionario f1 = new Funcionario();
		//adicionando valores		
		f1.nome = "Hugo";
		f1.salario = 100;
		f1.recebeAumento(50);
		
		//exibindo o resultado
		f1.mostra();
	}

}
