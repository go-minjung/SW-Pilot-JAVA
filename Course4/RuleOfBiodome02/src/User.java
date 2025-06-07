import java.util.ArrayList;
import java.util.List;

// 도서관 사용자 공통 기능 정의(추상클래스)
public abstract class User {
    protected String id;
    protected String name;
    protected List<Book> borrowedBooks = new ArrayList<>();

    public User(String id, String name) {
        this.id = id;
        this.name = name;
    }

    // 책 대출 메서드
    public void borrowBook(Book book) {
        if (book.isAvailable()) {
            book.setAvailable(false);
            borrowedBooks.add(book);
            System.out.println("이용자 '" + name + "'가 '" + book.getTitle() + "' 대출합니다.");
        } else {
            System.out.println("'" + book.getTitle() + "'은(는) 대출 중입니다.");
        }
    }

    // 책 반납 메서드
    public void returnBook(Book book) {
        if (borrowedBooks.contains(book)) {
            book.setAvailable(true);
            borrowedBooks.remove(book);
            System.out.println("이용자 '" + name + "'가 '" + book.getTitle() + "' 반납합니다.");
        } else {
            System.out.println("이용자 '" + name + "'는 '" + book.getTitle() + "'을(를) 대출한 적이 없습니다.");
        }
    }

    public String getName() {
        return name;
    }
}
