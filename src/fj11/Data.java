package fj11;

public class Data {
	int dia;
	int mes;
	int ano;
	
	public Data(){		
	}
	
	public Data(int dia, int mes, int ano){
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}
	
	public String Formatada(){
		
		return (this.dia+"/"+this.mes+"/"+this.ano) ;
	}

}
