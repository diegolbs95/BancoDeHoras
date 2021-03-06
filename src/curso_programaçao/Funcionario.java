package curso_programaçao;

import java.util.ArrayList;
import java.util.List;

public class Funcionario {

	private String nome;
	private double horaTotal;
	private List<Ponto> registroHoras = new ArrayList<>();
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getHoraTotal() {
		return horaTotal;
	}
	public void setHoraTotal(double horaTotal) {
		this.horaTotal = horaTotal;
	}
	public List<Ponto> getRegistroHoras() {
		return registroHoras;
	}
	public void setRegistroHoras(List<Ponto> registroHoras) {
		this.registroHoras = registroHoras;
	}
	
	
	
}
