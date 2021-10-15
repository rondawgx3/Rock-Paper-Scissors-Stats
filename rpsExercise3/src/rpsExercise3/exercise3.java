package rpsExercise3;

import java.util.Scanner;

public class exercise3 {

	public static void main(String[] args) {
		double player1 = player1();
		double player2 = player2();
		String best = betterPlayer(player1, player2);
		System.out.println("\n" + best);
	}
	public static String betterPlayer(double player1, double player2) {
		String best = "";
		if(player1 == 0 && player2 == 0) {
			best = "Stats entered not valid. TRY AGAIN.";
		}else if(player1 == player2 && player1 > 0) {
			best = "Both players have equal performance";
		}else if(player1 > player2) {
			best = "Player 1 has performed better.";
		}else if(player1 < player2) {
			best = "Player 2 has performed better.";
		}
		return best;
	}
	public static double player1() {
		Scanner input = new Scanner(System.in);
		System.out.println("--Player #1--");
		System.out.print("Games played: ");
		int played = input.nextInt();
		System.out.print("Games won: ");
		int won = input.nextInt();
		System.out.print("Moves made: ");
		int moves = input.nextInt();
		double player1 = 0;
		if(moves >= played && moves >= won && won <= played) {
			player1 = (won+0.0/played);
		}else if(moves < played && moves < won){
			System.out.println("Cannot have less moves than games won/played.");
		}else if(won > played) {
			System.out.println("Cannot have more games won than played.");
		}
		return player1;
	}
	public static double player2() {
		Scanner input = new Scanner(System.in);
		System.out.println("\n--Player #2--");
		System.out.print("Games played: ");
		int played = input.nextInt();
		System.out.print("Games won: ");
		int won = input.nextInt();
		System.out.print("Moves made: ");
		int moves = input.nextInt();
		double player2 = 0;
		if(moves >= played && moves >= won && won <= played) {
			player2 = (won+0.0/played);
		}else if(moves < played && moves < won){
			System.out.println("Cannot have less moves than games won/played.");
		}else if(won > played) {
			System.out.println("Cannot have more games won than played.");
		}	
		return player2;
	}
}

