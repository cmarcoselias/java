package treino;
// validador de datas
// complicado de intender de primeira;
import java.util.Scanner;

public class treino7 {

    public static void main(String[] args) {
    	int dia, mes, ano ,maxDias;
    	Scanner ler = new Scanner(System.in);
    	System.out.println("infome em o dia, mês e o ano");
    	dia =  ler.nextInt();
    	mes = ler.nextInt();
    	ano = ler.nextInt();
    	if(mes == 2) {
    	if((ano %4 == 0 && ano %100 != 0)|| ano %400 ==0) {
    		maxDias = 29;
    	}else {
    		maxDias = 28;
    	}
    	
    	}else if(mes == 1 || mes ==3 || mes == 5 || mes == 7 || mes == 8 || mes ==10 || mes == 12) {
    		maxDias = 31;
    	}else {
    		maxDias = 30;
    	}
    	if(dia >= 1 &&  dia <= maxDias) {
    		System.out.println("data válida");
    	}else {
    		System.out.println("data inválida");
    	}
    }
    
}