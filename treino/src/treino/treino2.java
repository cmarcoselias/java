package treino;

import java.util.Scanner;

public class treino2 {
	public static void Treino2() {
		double salario, novoSalario;
		Scanner ler =  new Scanner(System.in);
		exibir("informe seu salario");
		salario = ler.nextDouble();
		if (salario <= 1500) {
			novoSalario = salario * 1.20;
			exibir("o novo salario com o aumento de 20 % é" + novoSalario);
		}else if (salario > 1500 && salario <= 3000){
			novoSalario = salario * 1.15;
			exibir("o novo salario com o aumento de 15% é " + novoSalario);
		}else if(salario > 3000){
			novoSalario =  salario * 1.10;
			exibir("o novo salario com o aumento de 10% é" +  novoSalario);
		}else{
			exibir("valores inválidos");
	}
}
	public static void main(String[] args) {
		Treino2();
		}
		public static void exibir (String texto) {
			System.out.println(texto);
	}
}
