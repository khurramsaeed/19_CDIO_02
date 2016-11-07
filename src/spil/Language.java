package spil;

import java.util.Scanner;

public class Language {
	
	GameController game = new GameController();
	static Scanner sc = new Scanner(System.in); 
	
	public Language(){
		
	}

	public static void tellPlayerWon(Player p) {
		System.out.println(p.PlayerName+" WON!!");
		
	}

	public static void tellPlayer1toRoll(Player p1) {
		System.out.println("\n"+p1.PlayerName+", press 1 to roll");
		
	}
	public static void tellPlayer2toRoll(Player p2) {
		System.out.println("\n"+p2.PlayerName+", press 2 to roll");
		
	}

	public static void tellPlayer1toEntername() {
		System.out.println("Enter your name Player 1: ");
		
	}
	public static void tellPlayer2toEntername() {
		System.out.println("Enter your name Player 2: ");
	}

	public static void sayWelcome(Player p1, Player p2) {
		System.out.println("Welcome " + p1 + " and " + p2);
		
	}
	
	public static void tellPlayer1Rolled(Player p1, Cup c2){
		System.out.println(p1 + " rolled " + c2.sum());
	
	}
		
	public static void tellPlayer2Rolled(Player p2, Cup c3){
		System.out.println(p2 + " rolled " + c3.sum());
	
	}
	
	public static void landedOn(String n, String d, int e, Bank bank){
		
		System.out.println("You landed on: "+n);
		System.out.println(d);
		System.out.println("Effect on bank: "+ e);
		System.out.println("Your bank balance is now: " + bank.Balance);
	}
	public static void Extraturnp(){
		System.out.println("You get a extra turn");
		System.out.println(" ");
	}
	
}