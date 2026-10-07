package treino;

import java.util.Scanner;

public class treino3 {
	public static void Treino3(){
		int  n1, n2;
		Scanner ler = new Scanner(System.in);
		System.out.println("digite dois valores direntes");
		n1 = ler.nextInt();
		n2 = ler.nextInt();
		if (n1 == n2) {
			System.err.println("é obrigatório ter dois valores diferentes");
			return;
		}else {
			if(n1 > n2) {
			System.out.printf("%d < %d", n2, n1);
			}else {
				System.out.printf("%d < %d", n1, n2);
			}
		}
	}
	public static void main(String[] args) {
		Treino3();
	}

}
