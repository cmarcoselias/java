package treino;

import java.util.Scanner;

public class treino5 {
	public static void main(String[] args) {
		int l1, l2, l3;
		Scanner ler = new Scanner(System.in);
		System.out.println("informe os três lados do triângulo");
		l1 = ler.nextInt();
		l2 = ler.nextInt();
		l3 = ler.nextInt();
		extracted(l1, l2, l3);
	}

	public static void extracted(int l1, int l2, int l3) {
		String resultado;
		if(l1 + l2 > l3 && l2 + l3 > l1 && l1 + l3 > l2) {
			if(l1 == l2 && l2 == l3) {
				resultado ="o triângulo é Equilátero";
			}else if(l1 == l2 || l2 == l3 || l1 == l3) {
				resultado = "o triângulo é Isoceles";
			}else {
				resultado ="o triângulo é Escaleno";
			}
		}else {
			resultado ="os lados não formam um triângulo";
		}
		System.out.println(resultado);
	}
}
