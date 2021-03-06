package curso_programaçao;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class BancoDeHoras {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		char resposta;
		double soma = 0;

		Funcionario f1;

		f1 = new Funcionario();
		List<Ponto> pontos = new ArrayList<Ponto>();

		
			System.out.println("Escreva os dados do funcionario: ");
			System.out.print("Digite nome do funcionario: ");
			f1.setNome(sc.next());
		do {
			Ponto ponto = new Ponto();
			System.out.print("Digite hora de entrada: ");
			ponto.setEntrada(sc.nextInt());
			System.out.print("Digite hora de descanco: ");
			ponto.setDescanco(sc.nextInt());
			System.out.print("Digite hora de saida: ");
			ponto.setSaida(sc.nextInt());
			System.out.println("Digite o dia da semana: ");
			ponto.setDia(sc.nextInt());
			
			double horaTotal = (ponto.getSaida() - ponto.getEntrada()) - ponto.getDescanco();
			ponto.setTotal(horaTotal);
			
			soma = soma + horaTotal;
			System.out.println("Hora total= " + horaTotal);
			
			pontos.add(ponto); // acumula os pontos o array principal que sera setado no funcionario
			
			System.out.println("Digite N para sair?");
			resposta = sc.next().charAt(0);
			
			
		} while (resposta != 'n');
		
		f1.setRegistroHoras(pontos);
		f1.setHoraTotal(soma);
		
		System.out.println("Funcionario = " + f1.getNome());
		System.out.println("Quantidade de horas registradas = " + f1.getRegistroHoras().size());
		System.out.println("Hora total= " + soma);
		sc.close();
				
	}
}
