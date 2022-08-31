package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.TaxPayer;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
        System.out.print("Quantos contribuintes você vai digitar?");
        int N = sc.nextInt();
        
        List <TaxPayer> payer = new ArrayList<>();
        
        for (int i=0; i< N;i++) {
        	
        	System.out.println();
            System.out.println("Digite os dados do "+(i+1)+" o contribuinte:");
            System.out.print("Renda anual com salário:");
            double salary=sc.nextDouble();
            System.out.print("Renda anual com prestação de serviço:");
            double income=sc.nextDouble();
            System.out.print("Renda anual com ganho de capital:");
            double capital=sc.nextDouble();
            System.out.print("Gastos médicos:");
            double health=sc.nextDouble();
            System.out.print("Gastos educacionais:");
            double education=sc.nextDouble();	
            
            payer.add(new TaxPayer(salary,income,capital,health,education ));
        }
        
        for (int i=0; i< N;i++) {
        	
        	System.out.println();
        	System.out.println("Resumo do "+(i+1)+" contribuinte:");
            System.out.printf("Imposto bruto total: %.2f%n",payer.get(i).grossTax());
            System.out.printf("Abatimento: %.2f%n",payer.get(i).taxRebate());     
            System.out.printf("Imposto devido: %.2f%n",payer.get(i).netTax()); 	
            System.out.println();
        }

		
		
		sc.close();
	}

}
