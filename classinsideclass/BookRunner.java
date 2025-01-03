package classinsideclass;

public class BookRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Reviews review1 = new Reviews(1, "good book",4);
		Book book1 = new Book(123, "OOPS book", "Somya");
		book1.setReview(review1);
		System.out.println(book1.id);
		System.out.println(book1.name);
		System.out.println(book1.author);
		System.out.println(book1.review.id);
		System.out.println(book1.review.desc);
	}

}
