package github;
import java.util.*;
import java.util.Random;
public class rate {

	
	public static void ratespiel() {
		
		Scanner input = new Scanner(System.in);
		
		Random rand = new Random();
		
		int zufallszahl = rand.nextInt(100)+1;
		
		
		System.out.println("Ich habe mir eine Zahl zwischen 1 und 100 ausgedacht:)");
		System.out.println("Kannst du sie erraten? Gib deine erste Zahl ein: ");
		int zahl =input.nextInt();
		
		int rateversuch =1;
		
		
		
		while(zahl != zufallszahl) {
			
			if(zahl>zufallszahl) {
				System.out.println("Dein Tipp ist zu groß! Versuch es mit einer kleineren Zahl: ");
				}
				else {
						System.out.println("Dein Tipp ist zu klein! Versuch es mit einer größeren Zahl:");
						
				}
		
	
			rateversuch++;
		
			zahl = input.nextInt();}
			
			System.out.println("Herzlichen Glückwunsch! Du hast die Zahl erraten!");
			System.out.println("Du hast insgesamt " + rateversuch + " Versuche gebraucht.");

		
			
		
		}}

		
	
	

