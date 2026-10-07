package treino;

import java.util.Scanner;

public class treino8 {
	public static void main(String[] args) {
		String nome;
		double  media, nota1, nota2 , frequencia;
		Scanner ler  = new Scanner(System.in);
		exibir("informe seu nome");
		nome =  ler.nextLine();
		exibir("informe a primeira nota, a segunda nota e sua frequencia");
		nota1 =  ler.nextDouble();
		nota2 = ler.nextDouble();
		frequencia = ler.nextDouble();
		media = extracted(nota1, nota2);
		if(frequencia <= 75 ) {
			exibir("aluno reprovado");
		}
		else if(frequencia > 75 && media <=5) {
			exibir("reprovado por nota");
		}else if(frequencia > 75 && media > 5 && media <= 6.9){
			exibir("recuperação");
		}else if(frequencia >75 && media > 7){
			exibir("aluno aprovado");
		}else {
			exibir("passou com boa nota!!");
		}
	}
	public static double extracted(double nota1, double nota2) {
		double media;
		media = (nota1 + nota2)/2;
		return media;
	}
	public static void exibir(String texto) {
		System.out.println(texto);
	}
}
