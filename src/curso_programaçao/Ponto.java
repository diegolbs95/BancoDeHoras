package curso_programaçao;

public class Ponto {
	
	private int entrada;
	private int saida;
	private int descanco;
	private double total;
	private int dia;
	
	public Ponto() {
//		System.out.println("instanciou Ponto no construtor padrao");
	}
	
	public Ponto(int entrada,
			int saida,
			int descanco,
			double total,
			int dia) {
		this.entrada = entrada;
		this.saida = saida;
		this.descanco = descanco;
		this.total = total;
		this.dia = dia;
	}

	public int getEntrada() {
		return entrada;
	}

	public void setEntrada(int entrada) {
		this.entrada = entrada;
	}

	public int getSaida() {
		return saida;
	}

	public void setSaida(int saida) {
		this.saida = saida;
	}

	public int getDescanco() {
		return descanco;
	}

	public void setDescanco(int descanco) {
		this.descanco = descanco;
	}

	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}
	public void setDia(int dia) {
		this.dia = dia;
	}
	public int getDia() {
		return dia;
	}
}
