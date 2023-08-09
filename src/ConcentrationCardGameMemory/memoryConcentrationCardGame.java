package ConcentrationCardGameMemory;


import java.util.Random;
import java.util.Scanner;

class Card {
    private String face;
    private String suit;

    public Card(String face, String suit) {
	super();
	this.face = face;
	this.suit = suit;
    }

    public String getFace() {
	return face;
    }

    public void setFace(String face) {
	this.face = face;
    }

    public String getSuit() {
	return suit;
    }

    public void setSuit(String suit) {
	this.suit = suit;
    }

    @Override
    public String toString() {
	return face + " of " + suit;
    }
}


public class memoryConcentrationCardGame {

    public static void main(String[] args) {
	// TODO Auto-generated method stub
	System.out.println("Welcome to Memory!\r\n"
		+ "Your goal is to match two cards, using either the same face (i.e. King) or the\r\n"
		+ "same suit (i.e. Clubs).\r\n" + "If you get an exact match, you get 2 points!\r\n" + "");
	String face[] = { "A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K" };
	String suit[] = { "Spades", "Hearts", "Diamonds", "Clubs" };

	Card arr[] = new Card[10];
	Random rand = new Random();
	for (int i = 0; i < 10; i++) {
	    arr[i] = new Card(face[rand.nextInt(13)], suit[rand.nextInt(4)]);
	}
	Scanner sc = new Scanner(System.in);
	int totalGuesses = 0;
	int correctGuesses = 0;
	int currentScore = 0;
	outer: do {
	    System.out.println("How many points do you want to shoot for?");
	    int goal = sc.nextInt();
	    System.out.println("The round will end after you get " + goal + " points.");
	    while (currentScore < goal) {

		System.out.println("Pick two cards:");
		System.out.println("| 0 | 1 | 2 | 3 | 4 | 5 | 6 | 7 | 8 | 9 |");
		System.out.println("Select first card (or 'q' to quit this round):");
		int c = sc.nextInt();
		System.out.println("First card is: " + arr[c].getFace() + " of " + arr[c].getSuit());
		System.out.println("Select second card: ");
		int c2 = sc.nextInt();
		if (c == c2) {
		    do {
			System.out.println("Select second card (different from the first card): ");
			c2 = sc.nextInt();
		    } while (c2 == c);
		}
		System.out.println("Second card is: " + arr[c2].getFace() + " of " + arr[c2].getSuit());

		for (int i = 0; i < arr.length; i++) {
		    if (i == c) {
			System.out.print("| " + arr[c]);
		    } else if (i == c2) {
			System.out.print("| " + arr[c2]);

		    } else {
			System.out.print("| " + i);
		    }
		}
		System.out.println();
		if (arr[c].getFace() == arr[c2].getFace() && arr[c].getSuit() == arr[c2].getSuit()) {
		    currentScore += 2;
		    correctGuesses++;
		    System.out.println("* Found an EXACT match!! " + arr[c] + " and " + arr[c2] + " *");
		    System.out.println();
		    System.out.println("Replacing those with two new cards.");
		    arr[c].setFace(face[rand.nextInt(13)]);
		    arr[c].setSuit(suit[rand.nextInt(4)]);
		    arr[c2].setFace(face[rand.nextInt(13)]);
		    arr[c2].setSuit(suit[rand.nextInt(4)]);

		} else if (arr[c].getFace() == arr[c2].getFace()) {
		    currentScore++;
		    correctGuesses++;
		    System.out.println("* Found a match!! " + arr[c] + " and " + arr[c2] + " *");
		    System.out.println();
		    System.out.println("Replacing those with two new cards.");
		    arr[c].setFace(face[rand.nextInt(13)]);
		    arr[c].setSuit(suit[rand.nextInt(4)]);
		    arr[c2].setFace(face[rand.nextInt(13)]);
		    arr[c2].setSuit(suit[rand.nextInt(4)]);

		} else if (arr[c].getSuit() == arr[c2].getSuit()) {
		    System.out.println("* Found a match!! " + arr[c] + " and " + arr[c2] + " *");
		    System.out.println();
		    System.out.println("Replacing those with two new cards.");
		    System.out.println();
		    arr[c].setFace(face[rand.nextInt(13)]);
		    arr[c].setSuit(suit[rand.nextInt(4)]);
		    arr[c2].setFace(face[rand.nextInt(13)]);
		    arr[c2].setSuit(suit[rand.nextInt(4)]);
		    currentScore++;
		    correctGuesses++;
		} else {
		    System.out.println("Sorry, no match! :( Try again.");
		}
		System.out.println("Current score is " + currentScore);
		System.out.println();
		totalGuesses++;
	    }

	    System.out.println("Congrats, you won!! Your guess score is "
		    + getPercent((double) correctGuesses, (double) totalGuesses));
	    System.out.println("Wow, that was fun! You want to play again?");
	    char ch = sc.next().charAt(0);
	    if (ch == 'n' || ch == 'N') {
		System.out.println("That was fun, come back if you want practice more!");
		break outer;
	    } else if (!(ch == 'y') && !(ch == 'Y')) {
		System.out.println("Enter a valid input!");
	    }
	    currentScore = 0;
	} while (true);
    }

    public static double getPercent(double x, double y) {
	return (double) (x / y) * 100;
    }

}
