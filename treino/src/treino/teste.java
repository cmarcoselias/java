package treino;

import java.util.Scanner;

public class teste {
	public static void main(String[] args) {
		String nome, def, periodo, fimSemana, estudante;
		double altura, idade, totalP = 0, preco = 100, desconto = 0, acrecimo = 0, especial;
		Scanner ler = new Scanner(System.in);
		System.out.println("Digite seu nome\nDigite sua idade\nDigite sua altura");
		nome = ler.nextLine();
		altura = ler.nextDouble();
		idade = ler.nextDouble();
		System.out.println("Voce é estudante?\n1-sim\n2-não");
		estudante = ler.next();
		System.out.println(
				"A visita será em um dia da semana ou no final de semana?\n 1-fim de semana\n2-durante a semana");
		fimSemana = ler.next();
		System.out.println("Voce tem alguma deficiencia?\n1-tenho\n2-não tenho");
		def = ler.next();
		System.out.println("A visita será no período da manhã ou da tarde?\n1-manhã\n2-tarde");
		periodo = ler.next();
		System.out.println(nome);

		  if (def.equals("1")) {

			desconto = preco * 0.5;
			System.out.printf("\n R$  %.2f 50%% off com o desconto de deficiente,", desconto);
		} else {
			System.out.println("  Sem desconto para deficiente,");
		}
		if (estudante.equals("1")) {
			System.out.printf("  R$  %.2f com desconto de estudante,", desconto);
			desconto = preco * 0.65;
		}else{
			System.out.printf("  sem desconto de estudante");
		}
System.out.println(idade <= 12 && altura <= 1.50? "  não pode ir em brinquedos radicais" : "   pode ir em brinquedos radicais");
		
		if (idade >= 11 && idade < 60) {
			
			System.out.printf("  Sem desconto de idade,");
	
		} else if (idade >= 60) {
			System.out.printf("  %.2f R$ com desconto de 35%%,", desconto);
			desconto = preco * 0.65;
		}else if (idade <= 10) {
			desconto = preco * 0.60;
			System.out.printf(" R$ %.2f com desconto de 40%%,", desconto);
		}
		
		switch (fimSemana) {
		case "1":
			acrecimo = desconto * 1.25;
			System.out.printf("  R$  %.2f com acréscimos,", acrecimo);
			break;
		case "2":
			acrecimo = desconto * 1.15;
			System.out.printf("  R$  %.2f com acréscimos,", acrecimo);
			break;

		default:

		}
		totalP = (preco + acrecimo) - desconto ;
		System.out.println("   valor total de R$" + totalP );

		if (estudante.equals("1") && idade >= 14 && idade <= 17 && (fimSemana.equals("2") && periodo.equals("2"))) {
			especial = (desconto * 0.93);
			System.out.printf(" R$ %.2f com o valor especial", especial);
		System.out.println("  Descontos aplicados:");
		}
	}
}


