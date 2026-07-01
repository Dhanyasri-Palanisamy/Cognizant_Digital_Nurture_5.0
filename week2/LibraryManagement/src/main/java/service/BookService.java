package service;
import repository.BookRepository;

public class BookService {
	private BookRepository br;
	public void setRepository(BookRepository br) {
        this.br = br;
    }
	public void displayBooks() {
		br.showBooks();
	}

}
