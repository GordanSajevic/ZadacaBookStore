
public class Test {

	public static void main(String[] args) {
		
		Author asimov = new Author("Isaac", "Asimov", 123345, "iasimov@gmail.com", "isaacasimov");
		Author tolkien = new Author("John Robert", "Tolkien", 145678, "jrrtolkien@hotmail.com", "johnrobertreueltolkien");
		Publisher svjetlost = new Publisher("svjetlost", 345123, "svjetlost@hotmail.comm");
		Book end = new Book("End of Eternity", asimov, 1955, svjetlost, 53);
		Book cav = new Book("Caves of Steel", asimov, 1957, svjetlost, 67);
		Book fell = new Book("Fellowship of the Ring", tolkien, 1956, svjetlost, 45);
		Book twt = new Book("Two Towers", tolkien, 1957, svjetlost, 47);
		Book retr = new Book("Return of the King", tolkien, 1958, svjetlost, 75);
		fell.setNext(twt);
		twt.setPrevious(fell);
		twt.setNext(retr);
		retr.setPrevious(twt);
		BookStore knjizara = new BookStore("Knjigožderi");
		knjizara.addBook(end);
		knjizara.addBook(cav);
		knjizara.addBook(fell);
		knjizara.addBook(twt);
		knjizara.addBook(retr);
		Buyer gordan = new Buyer("Gordan", "Sajeviæ", "nekipassword", 0644016034, "gsajevic@hotmail.com");
		gordan.buyBook(end);
		gordan.buyBook(twt);
		knjizara.recommendation(gordan, twt);
	}

}
