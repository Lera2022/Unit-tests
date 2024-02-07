import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

class BookServiceTest {

    @Test
    void testFindBookById() {
        // Arrange
        String bookId = "123";
        Book expectedBook = new Book("123", "Mock Book", "Mock Author");
        BookRepository mockRepository = mock(BookRepository.class);
        when(mockRepository.findById(bookId)).thenReturn(expectedBook);
        BookService bookService = new BookService(mockRepository);

        // Act
        Book actualBook = bookService.findBookById(bookId);

        // Assert
        assertEquals(expectedBook, actualBook);
        verify(mockRepository, times(1)).findById(bookId);
    }

    @Test
    void testFindAllBooks() {
        // Arrange
        List<Book> expectedBooks = Arrays.asList(
                new Book("1", "Book1", "Author1"),
                new Book("2", "Book2", "Author2")
        );
        BookRepository mockRepository = mock(BookRepository.class);
        when(mockRepository.findAll()).thenReturn(expectedBooks);
        BookService bookService = new BookService(mockRepository);

        // Act
        List<Book> actualBooks = bookService.findAllBooks();

        // Assert
        assertEquals(expectedBooks, actualBooks);
        verify(mockRepository, times(1)).findAll();
    }
}
