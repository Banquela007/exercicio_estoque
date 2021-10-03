package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("------------------------------------------------------------");
		System.out.println(" Enter product data: ");
		System.out.print(" Name: ");
		String name = sc.nextLine();
		System.out.print(" Price: ");
		Double price = sc.nextDouble();
		System.out.print(" Quantity in stock: ");
		int quantity = sc.nextInt();
		System.out.println("------------------------------------------------------------");
		Product product = new Product(name,price,quantity);
		
		product.setName("computer");
		System.out.println("updated Name: " + product.getName());
		product.setPrice(1200.00);
		System.out.println("Updated Price: " + product.getPrice());
		System.out.println("------------------------------------------------------------");
		
		System.out.println(" Product Data: " + product);
		System.out.println("------------------------------------------------------------");
		System.out.print(" Enter the number of products to be added in stock: ");
		quantity = sc.nextInt();
		product.addProducts(quantity);
		System.out.println("------------------------------------------------------------");

		System.out.println(" Updated Data: " + product);
		System.out.println("------------------------------------------------------------");
		System.out.print(" Enter the number of products to be removed from the stock: ");
		quantity = sc.nextInt();
		product.removeProducts(quantity);
		System.out.println("------------------------------------------------------------");

		System.out.println(" Updated Data: " + product);
		System.out.println("------------------------------------------------------------");

		System.out.println();

		sc.close();
	}

}

/// object    possui  os seguintes metodos

// getClass = retorna o tipo do objeto
// equals = compara se o objeto e igual a outro
// hashCode = retorna um codigo hash do objeto
// toString = converte o objeto para string


/// constructor   obriga que seja colocado dados nele


/// this  utilizado para diferencia o atributo de variaveis locais


/// sobrecarga  utilizar a mesma classe so que com outros parametros


/// encapsulamento   

// private  o membro so pode ser acessado na propria classe
// get  
// set  
// (nada)  so funciona no mesmo pacote
// protected  o membro so pode ser acessado no mesmo pacote, como em subclasses de pacotes diferentes
// public  o membro pode ser usado a todos as classes	dentro do mesmo modulo

/// gerar auto.. construtores   source + generate ....

///

