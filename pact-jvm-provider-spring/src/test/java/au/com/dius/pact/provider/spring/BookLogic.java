package au.com.dius.pact.provider.spring;

import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Component
public class BookLogic {

    private final DateTime DATE_TIME = DateTime.now(DateTimeZone.UTC).withTimeAtStartOfDay();

    public Book getBookById(UUID id) {
        return new Book(id, "Bob Jones", true, DATE_TIME);
    }

    public List<Book> getBooks() {
        return new ArrayList<Book>();
    }

    public List<Book> getBooks(Boolean bestSellers) {
        return new ArrayList<Book>();
    }

    public List<Book> getBooks(BookType bookType) {
      return new ArrayList<Book>();
    }

    public Book createBook(Book book) {
        //some book creation code
        return book;
    }

    public Book updateBook(Book book) {
        //some book update code
        return book;
    }

    public void deleteById(UUID id) {
        //some book deletion code
    }
}
