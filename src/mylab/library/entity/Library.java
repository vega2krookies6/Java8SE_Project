package mylab.library.entity;
import java.util.ArrayList;
import java.util.List;

/**
 * 도서관 클래스
 * Book 객체들을 관리하고 기능을 제공
 */
public class Library {
    private List<Book> books;
    private String name;

    /**
     * 생성자
     */
    public Library(String name) {
        this.name = name;
        this.books = new ArrayList<>();
    }

    /**
     * 도서관 이름 반환
     */
    public String getName() {
        return name;
    }

    /**
     * 도서 추가 메소드
     */
    public void addBook(Book book) {
        books.add(book);
        System.out.println("도서가 추가되었습니다: " + book.getTitle());
    }

    /**
     * 제목으로 도서 검색
     * @return 첫 번째로 일치하는 Book 객체
     */
    public Book findBookByTitle(String title) {
        for (Book book : books) {
            if (book.getTitle().equals(title)) {
                return book;
            }
        }
        return null;
    }

    /**
     * 저자명으로 도서 검색
     * @return 저자가 일치하는 Book 객체 배열
     */
    public List<Book> findBooksByAuthor(String author) {
        List<Book> result = new ArrayList<>();
        for (Book book : books) {
            if (book.getAuthor().equals(author)) {
                result.add(book);
            }
        }
        return result;
    }

    /**
     * ISBN으로 도서 검색
     */
    public Book findBookByISBN(String isbn) {
        for (Book book : books) {
            if (book.getIsbn().equals(isbn)) {
                return book;
            }
        }
        return null;
    }

    /**
     * ISBN으로 도서 대출
     * @return 대출 성공 여부
     */
    public boolean checkOutBook(String isbn) {
        Book book = findBookByISBN(isbn);
        if (book != null) {
            return book.checkOut();
        }
        return false;
    }

    /**
     * ISBN으로 도서 반납
     * @return 반납 성공 여부
     */
    public boolean returnBook(String isbn) {
        Book book = findBookByISBN(isbn);
        if (book != null) {
            book.returnBook();
            return true;
        }
        return false;
    }

    /**
     * 대출 가능한 도서 목록 반환
     */
    public List<Book> getAvailableBooks() {
        List<Book> availableBooks = new ArrayList<>();
        for (Book book : books) {
            if (book.isAvailable()) {
                availableBooks.add(book);
            }
        }
        return availableBooks;
    }

    /**
     * 모든 도서 목록 반환
     */
    public List<Book> getAllBooks() {
        return new ArrayList<>(books);
    }

    /**
     * 도서관의 전체 도서 수 반환
     */
    public int getTotalBooks() {
        return books.size();
    }

    /**
     * 대출 가능한 도서 수 반환
     */
    public int getAvailableBooksCount() {
        return getAvailableBooks().size();
    }

    /**
     * 대출 중인 도서 수 반환
     */
    public int getBorrowedBooksCount() {
        return getTotalBooks() - getAvailableBooksCount();
    }
}