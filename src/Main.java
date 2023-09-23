import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
	Random random = new Random();
	Scanner scan = new Scanner(System.in);
	
	String jatkapelia = "";
	int nro1, nro2, nro3;
	
	
	System.out.println("Lucky 7");
	System.out.println("Pelataksesi peliä, syötä haluamasi rahamäärä: ");
	int raha = scan.nextInt();
	scan.nextLine();
	
	do {
	
	System.out.println("Saldo " + raha + "€");
	System.out.println("Pelaa painamalla y, lopeta painamalla n");
	
	jatkapelia = scan.nextLine();
	
	if (jatkapelia.equals("y")) {
	
	nro1 = random.nextInt(10) +1;
	nro2 = random.nextInt(10) +1;
	nro3 = random.nextInt(10) +1;
	
	raha -= 1;
	
	System.out.println(nro1 + " " + nro2 + " " + nro3);
	
	if(nro1 == 7 || nro2 == 7 || nro3 == 7) {
		System.out.println("Voitit 3€, ONNEA!");
		raha += 3;
	}
		
		else if (nro1 == 7 && nro2 == 7 && nro3 == 7) {
			System.out.println("Jackpot! Voitit 10€!");
			raha += 10;
		}
		
	
	else {
		System.out.println("Hävisit pelin.");
		
	}
	}

	
	}while(jatkapelia.equals("y") && raha > 0);
	
	System.out.println("Kiitos pelaamisesta");
	scan.close();
	
	
	
	

	}

}
