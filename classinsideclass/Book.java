package classinsideclass;

public class Book {
	// Reviews class is used inside Book class
	int id;
	String name;
	String author;
	Reviews review;  // Reviews is a separate class with some fields
	
	// in constructor just include the fields which are fixed and required fields to define the object state
	public Book(int id, String name, String author) {
		super();
		this.id = id;
		this.name = name;
		this.author = author;
	}
   // include getters and setters only for fields which are subjected to change
	public Reviews getReview() {
		return review;
	}

	public void setReview(Reviews review) {
		this.review = review;
	}

}
