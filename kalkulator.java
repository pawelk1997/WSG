package kalkulator;

import java.util.Random;
import java.util.Scanner;

public class kalkulator {

	public static void main(String[] args) {


		int l1;
		int l2;

		char z;
			System.out.println("Wciśnij ENTER żeby wyjść");

		for(;;){
		System.out.println("Podaj pierwsza liczbę");
		Scanner skan = new Scanner(System.in);

		l1 = skan.nextInt();

		System.out.println("Podaj drugą liczbę");

		l2 = skan.nextInt();

		System.out.println("Jakie działanie chcesz wykonać? Podaj znak");

		z = skan.next().charAt(0);



		switch(z){
		case '+':
			System.out.println("Wynik:" +(l1+l2));
		break;
		case '-':
			System.out.println("Wynik:" +(l1 - l2));
		break;
		case '*':
			System.out.println("Wynik:" +(l1 * l2));
		break;
		case '/':
		if(l2 !=0){
			System.out.println("Wynik:" +(l1 / l2));
		}
		else{
			System.out.println("Pamiętaj cholero, nie dziel przez zero!");
		}
		break;
		default:
		System.out.println("Podałeś błedny znak.");

			}
		}
	}
}
