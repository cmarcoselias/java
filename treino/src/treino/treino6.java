package treino;

import java.util.Scanner;

public class treino6 {
	public static void main(String[] args) {
		int ano;
		String resultado;
		Scanner ler = new Scanner(System.in);
		System.out.println("informe o  ano");
		ano = ler.nextInt();
		if((ano % 4 == 0 && ano % 100 != 0)|| ano % 400 ==0) {
			resultado = "o ano é bissesto";
		}else {
			resultado ="o  ano não é bissesto";
		}
		System.out.println(resultado);
	}
}
