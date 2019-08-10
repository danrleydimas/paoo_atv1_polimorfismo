package fatec_ipi_paoo_revisao_oo;

public class Tipo3 extends Empregado {
	
	public Tipo3(){
		
		
	}
	
	
	@Override
	public void Calcular() {
		setValorareceber(getSalario()
			     + getSalario()
			     *getPercentualComissao()
			     +getBonus());
		
	}
}
