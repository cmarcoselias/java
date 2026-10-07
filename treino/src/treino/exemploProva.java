package treino;

import java.util.Scanner;

public class exemploProva {
	public static void main(String[] args) {
	  String codigoProduto, local, tipoEmbalagem, adicional;
		double quantidade, valorProduto = 0, frete = 0, valorEmbalagem = 0, total, valorAd;
		Scanner ler =  new Scanner(System.in);
		exibir("informe qual o produto quer escolher");
		exibir("001 – Mouse Óptico USB");
		exibir("002 – SSD 240G");
		exibir("003 – Adaptador wireless USB");
		exibir("004 – Pen Drive 16GB");
		exibir("005 – Webcam");
		codigoProduto = ler.nextLine();
		exibir("informe a quantidade");
		quantidade = ler.nextDouble();
		exibir("informe sua região de destino (Sul,Suldeste, Centro-Oeste, Norte ou Nordeste) ");
		local = ler.next();
		
		exibir("informe o tipo de embalgem");
		exibir("1-Caixa de papelão grande comum");
		exibir("2-Caixa de papelão grande triplex ");
		exibir("3-Plástico bolha");
		exibir("4-Saco plástico ");
		tipoEmbalagem = ler.next();
		
		exibir("informe os adicionais(opcional)");
		exibir("Seguro");
		exibir("Rastreamento");
		exibir("Escolta armada");
		exibir("Nenhum");
		adicional = ler.next();
		
		if(quantidade > 10) {
			exibir("quantidade invalida");
		}else {
		if(codigoProduto.equals("001")) {
			valorProduto = quantidade * 35;
			System.out.println(valorProduto + " R$");
		}else if(codigoProduto.equals("002")){
			valorProduto = quantidade * 200;
			System.out.println(valorProduto + " R$");
		}else if(codigoProduto.equals("003")) {
			valorProduto = quantidade * 75;
			System.out.println(valorProduto + " R$");
		}else if (codigoProduto.equals("004")) {
			valorProduto = quantidade * 20;
			System.out.println(valorProduto + " R$");
		}else if(codigoProduto.equals("005")) {
			valorProduto = quantidade * 159;
			System.out.println(valorProduto + " R$");;
	
		}
		}
		switch(local) {
		case"Sul":
			frete =  valorProduto* 1.07;
			System.out.printf("%.2f R$ com o frete", frete);
			break;
		case"Suldeste":
			frete = valorProduto * 1.05;
			System.out.printf("%.2f R$ com o frete", frete);
			break;
		case"Centro-Oeste":
			frete = valorProduto * 1.09;
			System.out.printf("%.2f R$ com o frete", frete);
			break;
		case"Norte":
			frete = valorProduto * 1.15;
			System.out.printf("%.2f R$ com o frete", frete);
			break;
		case"Nordeste":
			frete = valorProduto * 1.12;
			System.out.printf("%.2f R$ com o frete", frete);
			break;
			default:
				exibir("erro");
		}
		valorEmbalagem = verificador(tipoEmbalagem, valorProduto, valorEmbalagem);
		if(adicional.equals("Seguro")) {
			valorAd = frete *1.05; 
			total =  valorProduto + valorAd + valorEmbalagem;
			
			System.out.printf(" %.2f R$ com o add  de 5%%  e %.2f R$ a pagar", valorAd, total); 
		}else if (adicional.equals("Rastreamento ")) {
			valorAd = frete *1.03;
					total =  valorProduto + valorAd + valorEmbalagem;
					System.out.printf(" %.2f R$ com o add  de 3%%  e %.2f R$ a pagar", valorAd,total);
		}else if(adicional.equals("Escolta armada")) {
			valorAd = frete *1.10;
			total =  valorProduto + valorAd + valorEmbalagem;
			System.out.printf(" %.2f R$ com o add  de 10%%  e %.2f R$ a pagar", valorAd,total);
		}else if(adicional.equals("Nenhum")) {
			total =  valorProduto + frete + valorEmbalagem;
			exibir(total + " sem valor adicional");
		}
		
	}
	public static double verificador(String tipoEmbalagem, double valorProduto, double valorEmbalagem) {
		switch(tipoEmbalagem) {
		case"1":
			valorEmbalagem = valorProduto + 10;
			System.out.printf("  %.2f R$ com o valor da embalagem", valorEmbalagem);
			break;
		case"2":
			valorEmbalagem = valorProduto + 20;
			System.out.printf("  %.2f R$ com o valor da embalagem", valorEmbalagem);
			break;
		case"3":
			valorEmbalagem = valorProduto + 12;
			System.out.printf("	%.2f R$ com o valor da embalagem", valorEmbalagem);
			break;
		case"4":
			valorEmbalagem = valorProduto + 5;
			System.out.printf("	%.2f  R$ com o valor da embalagem", valorEmbalagem);
			break;
			default:		
		}
		return valorEmbalagem;
	}
	public static void exibir(String texto) {
		System.out.println(texto);
	}

				
	}

