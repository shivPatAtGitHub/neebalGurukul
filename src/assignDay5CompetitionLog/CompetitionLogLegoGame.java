package assignDay5CompetitionLog;

import java.util.Scanner;

class CompetitionLog{
	private int playerNumber;
	private String CompleteSets;
	private String InCompleteSets;
	private int piecesBuilt;
	
	
	CompetitionLog() {
		
	}

	CompetitionLog(int pNum, String cSet, String icSet, int pBuilt) {
		playerNumber = pNum;
		CompleteSets = cSet;
		InCompleteSets = icSet;
		piecesBuilt = pBuilt;
	}

	public int getPlayerNumber() {
		return playerNumber;
	}

	public void setPlayerNumber(int playerNumber) {
		this.playerNumber = playerNumber;
	}

	public String getCompleteSets() {
		return CompleteSets;
	}

	public void setCompleteSets(String completeSets) {
		CompleteSets = completeSets;
	}

	public String getInCompleteSets() {
		return InCompleteSets;
	}

	public void setInCompleteSets(String inCompleteSets) {
		InCompleteSets = inCompleteSets;
	}

	public int getPiecesBuilt() {
		return piecesBuilt;
	}

	public void setPiecesBuilt(int piecesBuilt) {
		this.piecesBuilt = piecesBuilt;
	}
	
	
	public String toString() {
		return "Player " + getPlayerNumber() + " completed the following sets:" + getCompleteSets() + "\n" + "Player " + getPlayerNumber() + " did not completed the following sets:" + getInCompleteSets() + "\n" + "Player " + getPlayerNumber() + " built total of: " + getCompleteSets() +"pieces" ;
	}
	
}

class legoSet{
	
	private String setName; //name of the Lego Set
	private int pReqd; // piece required for lego Set

	
	legoSet() {
		
	}

	legoSet(String sName, int pReqd) {
		setName = sName;
		this.pReqd = pReqd;
	}

	public String getSetName() {
		return setName;
	}

	public void setSetName(String setName) {
		this.setName = setName;
	}

	public int getpReqd() {
		return pReqd;
	}

	public void setpReqd(int pReqd) {
		this.pReqd = pReqd;
	}
	
}





public class CompetitionLogLegoGame {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int p1setCom = 0;	
		int p2setCom = 0;	
		int i=1;
		int totalPR3Set = 0;
		
		AGAIN: do {
		System.out.println("Welcome to the Lego Set Competition 1");
		
		System.out.println("Enter the Name of the Lego Set 1");
		String nameLS1 = sc.next();
		System.out.println("Enter the number of pieces in Lego Set 1");
		int nopLS1 = sc.nextInt();

		System.out.println("Enter the Name of the Lego Set 2");
		String nameLS2 = sc.next();
		System.out.println("Enter the number of pieces in Lego Set 2");
		int nopLS2 = sc.nextInt();

		System.out.println("Enter the Name of the Lego Set 3");
		String nameLS3 = sc.next();
		System.out.println("Enter the number of pieces in Lego Set 3");
		int nopLS3 = sc.nextInt();
		
	
		legoSet one = new legoSet(nameLS1, nopLS1);
		legoSet two = new legoSet(nameLS2, nopLS2);
		legoSet three = new legoSet(nameLS3, nopLS3);
		
		//total Number Of Pieces For 3 Sets
		totalPR3Set = one.getpReqd() + two.getpReqd() + three.getpReqd();
		System.out.println(totalPR3Set);
		
		AGAIN2: do {
			System.out.println("Enter the number of pieces player 1 used for building on day" + i + " :");
			int pUsedP1 = sc.nextInt();
			p1setCom += pUsedP1;
//			System.out.println(p1setCom); 
			
			System.out.println("Enter the number of pieces player 2 used for building on day" + i + " :");
			int pUsedP2 = sc.nextInt();
			p2setCom += pUsedP2;
//			System.out.println(p2setCom);
			
//		Draw handling
			if(((p1setCom > totalPR3Set) || (p1setCom > totalPR3Set)) && (p1setCom == p2setCom)) {
				System.out.println("Draw");
				continue AGAIN2;
			}
			
			i++;
		} while (p1setCom < totalPR3Set && p2setCom < totalPR3Set);
	} while (p1setCom < totalPR3Set && p2setCom < totalPR3Set);
	 
			if(p1setCom >= totalPR3Set)
				System.out.println("Player 1 wins");
			else
				System.out.println("Player 2 wins");			
		
			
		
//		
//		CompetitionLog a = new CompetitionLog();
//		
		
	}	

}
