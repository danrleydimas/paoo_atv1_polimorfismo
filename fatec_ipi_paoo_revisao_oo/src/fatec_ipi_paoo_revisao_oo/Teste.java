package fatec_ipi_paoo_revisao_oo;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Teste {
	public static void main(String[] args) {
		Random gerador = new Random();
		 List <Empregado> empregados = new ArrayList <> ();  
		 for (int i=1;i<=10;i++) {
			 int tipo = gerador.nextInt(4) +1;
		  
		  if(tipo == 1) {
			  Tipo1 aux = new Tipo1();
			  aux.setSalario(2500+gerador.nextDouble()*700);
			  
		   
		  }
		  else if (tipo == 2) {
			  Tipo2 aux = new Tipo2();
			  aux.setSalario(1500+gerador.nextDouble()*500);
			  aux.setPercentualComissao(gerador.nextDouble());
			  
		  
		   
		  }
		  else if(tipo == 3) {
			  Tipo3 aux = new Tipo3();
			  aux.setSalario(1200+gerador.nextDouble()*500);
			  aux.setPercentualComissao(gerador.nextDouble());
			  aux.setBonus(500 + gerador.nextDouble()*500);
			  

		   
		  }
		  else {
			  Tipo4 aux = new Tipo4();
			  aux.setBonus(2000 + gerador.nextDouble()*2000);
			  
		  }
		
		  aux.Calcular();
		  empregados.add(aux);
		 }
		 for (Empregado e : empregados){
			 	System.out.println("Valor a receber: " + e.getValorareceber());
		 }
	}

}
