package assignDay5CompetitionLog;

import java.util.Scanner;

 class CompetitionLog {

	 		private int playerNumber;
			private String completeSets="";
			private String incompleteSets="";
			private int piecesBuilt;
			
		    
		  
		    
			CompetitionLog(){}
			
			public CompetitionLog(int playerNumber, String completeSets, String incompleteSets, int piecesBuilt)
			{
				this.playerNumber = playerNumber;
				this.completeSets = completeSets;
				this.incompleteSets = incompleteSets;
				this.piecesBuilt = piecesBuilt;
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

			public int getPlayerNumber() {
				return playerNumber;
			}
			
			public String toString()
			{
				return "Player "+playerNumber+" completed the following sets: "+completeSets+
						"\n"+"Player "+playerNumber+" did not completed the following sets: "+incompleteSets+
						"\n"+"Player "+playerNumber+" built total of "+piecesBuilt+" pieces \n";
			}
 
 }

 public class CompetitionLogLegoGame {
 	public static void main(String[] args) {
 				Scanner sc=new Scanner(System.in);

 				CompetitionLog player1=null,player2=null;
 				
 				outer:do {
 				System.out.println("Welcome to the legoset Competition");
 				System.out.println("Enter the name of the legoset1");
 				String legoname1=sc.nextLine();
 				System.out.println("Enter the number of legos");
 				int number1=sc.nextInt();
 				
 				System.out.println("Enter the name of the legoset2");
 				sc.nextLine();
 				String legoname2=sc.nextLine();
 				System.out.println("Enter the number of legos");
 				int number2=sc.nextInt();
 				
 				System.out.println("Enter the name of the legoset3");
 				sc.nextLine();
 				String legoname3=sc.nextLine();
 				System.out.println("Enter the number of legos");
 				int number3=sc.nextInt();
 				sc.nextLine();
 				
 				int total=number1+number2+number3;
 				int d=1;
 				
 				if(player1!=null) {
 					player1=new CompetitionLog(1, player1.getCompleteSets(), legoname1+ " " + legoname2 + " " + legoname3, player1.getPiecesBuilt());
 					player2=new CompetitionLog(2, player2.getCompleteSets(), legoname1+ " " + legoname2 + " " + legoname3, player2.getPiecesBuilt());	
 				} else {
 					player1=new CompetitionLog(1, "", legoname1+" "+legoname2+" "+legoname3, 0);
 					player2=new CompetitionLog(2, "", legoname1+" "+legoname2+" "+legoname3, 0);
 				}
 					
 				boolean winner1=false,winner2=false;
 				
 				while(!(winner1 || winner2)) {
 				System.out.println("Enter the number of pieces in day"+ d);
 				int p1=sc.nextInt();
 				System.out.println("Enter the number of pieces in day"+ d);
 				int p2=sc.nextInt();
 				
 				d++;
 				
 				if(player1.getPiecesBuilt()+p1>=total)
 					p1=total-player1.getPiecesBuilt();
 				
 				if(player2.getPiecesBuilt()+p2>=total)
 					p2=total-player2.getPiecesBuilt();
 				
 				player1.setPiecesBuilt(player1.getPiecesBuilt()+p1);
 				player2.setPiecesBuilt(player2.getPiecesBuilt()+p2);
 				if(player1.getPiecesBuilt()>=number1) {
 					player1.setCompleteSets(legoname1);
 					player1.setIncompleteSets(legoname2+" "+legoname3);
 				}
 				
 				if(player2.getPiecesBuilt()>=number1) {
 					player2.setCompleteSets(legoname1);
 					player1.setIncompleteSets(legoname2+" "+legoname3);
 				}
 				
 				if(player1.getPiecesBuilt()-number1>=number2)
 					player1.setCompleteSets(legoname1+ " "+ legoname1);
 				    player1.setIncompleteSets(legoname3);
 				
 				if(player2.getPiecesBuilt()-number1>=number2) {
 					player2.setCompleteSets(legoname1+" "+legoname2);
 					player2.setIncompleteSets(legoname3);
 				}
 				
 				if(player1.getPiecesBuilt()-number1-number2>=number2) { 					
 					player1.setCompleteSets(legoname1+ " "+ legoname1+ " "+legoname3);
 					player1.setIncompleteSets("");
 				}
 				
 				if(player2.getPiecesBuilt()-number1-number2>=number3) {
 					player2.setCompleteSets(legoname1+" "+legoname2+ " "+legoname3);
 					player2.setIncompleteSets("");
 				}
 				
 				if(player1.getPiecesBuilt()==total) {
 					winner1=true;
 				}
 				
 				if(player2.getPiecesBuilt()==total) {
 					winner2=true;
 				}
 				
 				if(winner1&&winner2) {
 					System.out.println("Tie");
 					winner1=false; winner2=false;
 					continue outer;
 				}
 				
 			}
 				if(winner1 || winner2) {
	 				if(winner1) {
	 					System.out.println("Winner is Player1");
	 				}
	 				
	 				if(winner2) {
	 					System.out.println("Winner is Player2");	
	 				}
	 				
	 				System.out.println(player1 + "\n"+player2);
	 				
	 				break;
	 			}
 				
 		} while (true);				
 	
 	}
 }