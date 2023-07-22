package com.gurukul.day5;

class publication {
	protected String title;
	protected int price;
	
	publication() {
		
	}
	
	publication(String title, int price) {
		this.title = title;
		this.price = price;
	}
	
	String getTitle() {
		return title;
	}
	
	int getPrice() {
		return price;
	}
	
	public String toString() {
		return "Title:" + title + " Price:" + price;
	}
}

class book extends publication {
	private int pages;
	
	book() {
		super();
	}
	book(String title, int price, int pages) {
		super(title, price);
		this.pages = pages;
	}	
	
	public String toString() {
		return super.toString() + " Pages: " + pages;
	}
}

class movie extends publication {
	private String director;
	private String leadActor;
	
	movie() {
		super();
	}
	
	movie(String title, int price, String director, String leadActor) {
		
		super(title, price);
		this.director = director;
		this.leadActor = leadActor;
	}
	
	public String toString() {
		return super.toString() + " Director:" + director + " Lead Actor:" + leadActor;
	}
}



public class InheritancePublicationsBookMovie {

	public static void main(String[] args) {
		book a = new book("abc", 500, 100);
		movie b = new movie("abcd", 500, "xyx", "lmn");
		
		if (a.getPrice() > b.getPrice()) 
			System.out.print(a);
		else 
			System.out.print(b);
		
		
	}

}
