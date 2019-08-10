package fatec_ipi_paoo_revisao_oo;

public abstract class  Empregado {
		private double salario;
		private double percentualComissao;
		private double bonus;
		private double valorareceber;
		
		public abstract void Calcular();
		
		
		public double getSalario() {
			return salario;
		}


		public void setSalario(double salario) {
			this.salario = salario;
		}


		public double getPercentualComissao() {
			return percentualComissao;
		}


		public void setPercentualComissao(double percentualComissao) {
			this.percentualComissao = percentualComissao;
		}


		public double getBonus() {
			return bonus;
		}


		public void setBonus(double bonus) {
			this.bonus = bonus;
		}


		public double getValorareceber() {
			return valorareceber;
		}


		public void setValorareceber(double valorareceber) {
			this.valorareceber = valorareceber;
		}


		
}
