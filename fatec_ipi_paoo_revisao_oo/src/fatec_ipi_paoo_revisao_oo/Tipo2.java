package fatec_ipi_paoo_revisao_oo;

public class Tipo2 extends Empregado {
	
	public Tipo2(){
		
	}
	
	@Override
	public void Calcular() {
		setValorareceber(getSalario()+getSalario()
	    *getPercentualComissao());
		
	}
	

}
