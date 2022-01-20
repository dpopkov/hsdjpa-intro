package learn.hsdjpa.hsdjpaintro.bootstrap;

import learn.hsdjpa.hsdjpaintro.domain.Book;
import learn.hsdjpa.hsdjpaintro.repositories.BookRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataInitializer implements CommandLineRunner {
    private final BookRepository bookRepository;

    public DataInitializer(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @Override
    public void run(String... args) {
        Book bookDdd = new Book("Domain Driven Design", "123", "RandomHouse");
        System.out.println("ID: " + bookDdd.getId());
        Book savedDdd = bookRepository.save(bookDdd);
        System.out.println("ID: " + savedDdd.getId());

        Book bookSia = new Book("Spring in Action", "234", "Manning");
        Book savedSia = bookRepository.save(bookSia);

        bookRepository.findAll().forEach(book -> {
            System.out.print("Book Id: " + book.getId());
            System.out.print(", Book Title: " + book.getTitle());
            System.out.println(", Book ISBN: " + book.getIsbn());
        });
    }
}
