package treino;

import java.util.Scanner;

public class treino4 {
	public static void main(String[] args) {
		String resultado;
		int num;
		Scanner leia = new Scanner(System.in);
		System.out.println("informe um valor");
		num = leia.nextInt();
		if(num <= 0){
			System.err.println("valor inválido ");
			return;
		}
		else {
		if(num % 2 ==0) {
			resultado = "o valor é par";
	
		}else{
			resultado ="o valor é impar";
		}
	}
		System.out.println(resultado);
	}
}
