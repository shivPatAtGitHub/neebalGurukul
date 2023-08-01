package assignDay5CompetitionLog;

import java.util.Scanner;

class compLog {
    private int playerNumber;
    private String completeSets;
    private String incompleteSets;
    private int piecesBuilt;
    static int days = 1;
    static int totalPieces;
    String previousSet;
    static String set1;
    static String set2;
    static String set3;
    static int num1;
    static int num2;
    static int num3;

    compLog(int playerName, String completeSets, String incompleteSets, int piecesBuilt) {
	this.playerNumber = playerName;
	this.completeSets = completeSets;
	this.incompleteSets = incompleteSets;
	this.piecesBuilt = piecesBuilt;
    }

    public int getPlayerNumber() {
	return playerNumber;
    }

    public String getCompleteSets() {
	return completeSets;
    }

    public void setCompleteSets(String completeSets) {
	this.completeSets = completeSets;
    }

    public String getIncompleteSets() {
	return incompleteSets;
    }

    public void setIncompleteSets(String incompleteSets) {
	this.incompleteSets = incompleteSets;
    }

    public int getPiecesBuilt() {
	return piecesBuilt;
    }

    public void setPiecesBuilt(int piecesBuilt) {
	this.piecesBuilt = piecesBuilt;
    }

    public void calc() {
	int remPieces = this.getPiecesBuilt();
	if (remPieces >= num1) {
	    this.setCompleteSets(set1);
	    this.setIncompleteSets(set2 + ", " + set3);
	}
	remPieces -= num1;
	if (remPieces >= num2) {
	    this.setCompleteSets(set1 + ", " + set2);
	    this.setIncompleteSets(set3);

	}
	remPieces -= num2;
	if (remPieces >= num3) {
	    this.setCompleteSets(set1 + ", " + set2 + ", " + set3);
	    this.setIncompleteSets(" none");

	}

    }

    public String toString() {
	return "Player " + playerNumber + " completed the following sets: " + completeSets + "\n" + "Player "
		+ playerNumber + " did not completed the following sets: " + incompleteSets + "\n" + "Player "
		+ playerNumber + " built total of " + piecesBuilt + " pieces";

    }

    public String printResult(compLog t) {
	// TODO Auto-generated method stub
	String s = "Congratulations to player " + this.playerNumber + " for winning the Lego Set Competition!" + "\n"
		+ "Additional information about the competition results is below" + "\n" + "Player " + this.playerNumber
		+ " completed the following sets: " + this.completeSets + "\n" + "Player " + this.playerNumber
		+ " did not complet the following sets :" + this.incompleteSets + "\n" + "Player " + this.playerNumber
		+ " built a total of " + this.piecesBuilt + " pieces." + "\n" + "Player " + t.playerNumber
		+ " completed the following sets :" + t.completeSets + "\n" + "Player " + t.playerNumber
		+ " did not complete the following sets : " + t.incompleteSets + "\n" + "Player " + t.playerNumber
		+ " built a total of " + t.piecesBuilt + " pieces." + "\n" + "The competiton lasted " + days + " days.";
	return s;

    }

}

public class CompLegoDemo {

    public static void main(String[] args) {
	// TODO Auto-generated method stub
	boolean flag = true;

	while (flag) {
	    Scanner sc = new Scanner(System.in);
	    System.out.println("Welcome to the Lego Set Competition!");
	    System.out.println("Enter the name of Lego Set 1");
	    String legoSet1 = sc.nextLine();
	    System.out.println("Enter the number of pieces in Lego Set 1");
	    int legoPieces1 = sc.nextInt();
	    sc.nextLine();
	    System.out.println("Enter the name of Lego Set 2");
	    String legoSet2 = sc.nextLine();
	    System.out.println("Enter the number of pieces in Lego Set 2");
	    int legoPieces2 = sc.nextInt();
	    sc.nextLine();
	    System.out.println("Enter the name of Lego Set 3");
	    String legoSet3 = sc.nextLine();
	    System.out.println("Enter the number of pieces in Lego Set 3");
	    int legoPieces3 = sc.nextInt();

	    compLog.totalPieces = legoPieces1 + legoPieces2 + legoPieces3;

	    compLog x = new compLog(1, " none", legoSet1 + ", " + legoSet2 + ", " + legoSet3, 0);
	    compLog y = new compLog(2, " none", legoSet1 + ", " + legoSet2 + ", " + legoSet3, 0);

	    compLog.set1 = legoSet1;
	    compLog.set2 = legoSet2;
	    compLog.set3 = legoSet3;

	    compLog.num1 = legoPieces1;
	    compLog.num2 = legoPieces2;
	    compLog.num3 = legoPieces3;

	    while (x.getPiecesBuilt() < compLog.totalPieces && y.getPiecesBuilt() < compLog.totalPieces) {
		System.out
			.println("Enter the number of pieces player 1 used for building on day " + compLog.days);
		int a = sc.nextInt();
		System.out
			.println("Enter the number of pieces player 2 used for building on day " + compLog.days);
		int b = sc.nextInt();

		x.setPiecesBuilt(x.getPiecesBuilt() + a);
		y.setPiecesBuilt(y.getPiecesBuilt() + b);
		x.calc();
		y.calc();

		if (x.getPiecesBuilt() >= compLog.totalPieces
			&& y.getPiecesBuilt() >= compLog.totalPieces) {
		    x.setPiecesBuilt(0);
		    y.setPiecesBuilt(0);
		    System.out.println("The competition ended in a tie! There will be a tiebreaker round");
		    break;
		}
		if (x.getPiecesBuilt() >= compLog.totalPieces) {
		    System.out.println(x.printResult(y));
		    flag = false;
		} else if (y.getPiecesBuilt() >= compLog.totalPieces) {
		    flag = false;
		    System.out.println(y.printResult(x));
		}
		compLog.days++;
	    }
	}
    }

}