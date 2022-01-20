package learn.hsdjpa.hsdjpaintro.repositories;

import learn.hsdjpa.hsdjpaintro.domain.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {
}
