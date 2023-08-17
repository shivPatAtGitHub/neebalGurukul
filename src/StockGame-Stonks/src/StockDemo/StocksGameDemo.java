package StockDemo;
import java.io.*;
import java.util.*;

class StockGame extends Thread{
	private static double stockPrice = 100;
	private static int availableShares = 100;
	private static int tradeCount = 1;
    private static final Object lock = new Object();
	private String playerName;
	private String fileName;
	private int numShares;
    private List<String> order = new ArrayList<>();
	
	public StockGame(String name, String fileName) {
		this.playerName = name;
		this.fileName = fileName;
		int count = 0;
		tradeCount = ++count; 
	}

	public static double getStockPrice() {
		return stockPrice;
	}

	public static void setStockPrice(double stockPrice) {
		StockGame.stockPrice = stockPrice;
	}

	public static int getAvailableShares() {
		return availableShares;
	}

	public static void setAvailableShares(int availableShares) {
		StockGame.availableShares = availableShares;
	}

	public static int getTradeCount() {
		return tradeCount;
	}

	public static void setTradeCount(int tradeCount) {
		StockGame.tradeCount = tradeCount;
	}

	public String getplayerName() {
		return playerName;
	}

	public void setplayerName(String name) {
		this.playerName = name;
	}

	public int getNumShares() {
		return numShares;
	}

	public void setNumShares(int numShares) {
		this.numShares = numShares;
	}

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}
	
//    public List<String> getOrder() {
//	return order;
//    }
//
//    public void setOrder(List<String> ord) {
//	this.order = ord;
//    }

	public String toString() {
		return "------\nStock Price: " + stockPrice +"\nAvailable Shares: " + availableShares;
	}
	
//	public void readFile(String fileName) throws FileNotFoundException {
//		File file1 = new File(fileName);
//		Scanner sc = new Scanner(file1);
//		StringBuffer sb = new StringBuffer();
//			
//		while(sc.hasNext()) {
//			sb.append(sc.nextLine() + " ");
//		}
//		String s = sb.toString();
//		String[] split = s.split("[\\W]");
//		order = split[0];
//		numShares = Integer.parseInt(split[1]);
//	}
	

  public void run() {
	readTradeFile();
	StonksAction();
  }
	
	public void readTradeFile() {
		try {
				BufferedReader reader = new BufferedReader(new FileReader(fileName));
				String line;
				while ((line = reader.readLine()) != null) {
					order.add(line);
				}
		} catch (IOException e) {
			
		  }
	}
	
	void StonksAction() {

	for (int i = 0; i < order.size(); i++) {
	    String[] arr = order.get(i).split("[\\W]");
	    String ord = arr[0];
	    int shares = Integer.parseInt(arr[1]);

//	    if (!(ord == "BUY") && !(ord == "SELL") || shares < 0) {
	    synchronized (lock) {
	    if (!ord.equals("BUY") && !ord.equals("SELL") || shares <= 0) {
	    	System.out.println("------");
	    	System.out.println("Error, invalid input!");
	    	continue;
	    } else {
			    if (ord.equals("BUY")) {
			    	if (shares <= availableShares) {
						System.out.println("------");
						System.out.println("Stock Price: " + getStockPrice());
						System.out.println("Available Shares: " + getAvailableShares());
					    System.out.println("Trade number: " + getTradeCount());
					    System.out.println("Name: " + getplayerName());
					    System.out.println("Purchasing " + shares + " shares at " + getStockPrice() + "...");
	
					    setNumShares(getNumShares() + shares);
					    setAvailableShares(getAvailableShares() - shares);
					    setStockPrice(getStockPrice() + (1.5 * shares));
					    tradeCount++;
			    	} else {
			    		//if insufficient shares are available
			    		System.out.println("------");
			    		System.out.println("Insufficient Shares available for Buying, cancelling order...");
			    		System.out.println("Available Shares: " + getAvailableShares());
			    		System.out.println("Purchase order: " + shares);
			    	}
			    } else {
			    	if (shares <= getNumShares()) {
						System.out.println("------");
						System.out.println("Stock Price: " + getStockPrice());
						System.out.println("Available Shares: " + getAvailableShares());
					    System.out.println("Trade number: " + getTradeCount());
					    System.out.println("Name: " + getplayerName());
					    System.out.println("Selling " + shares + " shares at " + getStockPrice() + "...");
					    
					    setNumShares(getNumShares() - shares);
					    setAvailableShares(getAvailableShares() + shares);
					    setStockPrice(getStockPrice() - (2 * shares));
					    tradeCount++;
			    	} else {
			    		//if insufficient shares are available
			    		System.out.println("------");
			    		System.out.println("Insufficient Owned Shares to Sell, cancelling order...");
			    		System.out.println("Available Shares: " + getAvailableShares());
			    		System.out.println("Sell order: " + shares);
			    		
			    	}
			    }
	    	}
	    }
	}
    }
	
}


public class StocksGameDemo {

	public static void main(String[] args) throws Exception {

		StockGame x = new StockGame("Start", "StockInfo.txt");
		System.out.println(x);		
		try {
				StockGame stockTraders[] = {new StockGame("Xander", "XanderStockInfo.txt"),
				new StockGame("Afua", "AfuaStockInfo.txt")};

//				StockGame stockTraders[] = {new StockGame("Xander", "noTradeOrder.txt"),
//				new StockGame("Afua", "noTradeOrder.txt")};
			
				for (int i = 0; i < stockTraders.length; i++) {
				stockTraders[i].start();
				}
				
				for (int i = 0; i < stockTraders.length; i++) {
				stockTraders[i].join();
				}
			
			} catch (Exception ex) {
				ex.printStackTrace();
				return;
			}
		
		      

	}
}

