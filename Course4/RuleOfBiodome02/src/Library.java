import java.util.ArrayList;
import java.util.List;

// 전체 도서관 관리 Library 클래스
public class Library {
    private List<Book> books = new ArrayList<>();           // 책 목록
    private List<Member> members = new ArrayList<>();       // 이용자 목록
    private List<Manager> managers = new ArrayList<>();     // 관리자 목록

    public List<Book> getBooks() {
        return books;
    }

    public List<Member> getMembers() {
        return members;
    }

    public List<Manager> getManagers() {
        return managers;
    }

    // 저자 이름으로 책 검색
    public void searchByAuthor(String author) {
        boolean found = false;
        System.out.println("\n저자 '" + author + "'의 책 목록:");
        for (Book book : books) {
            if (book.getAuthor().equals(author)) {
                book.printInfo();
                found = true;
            }
        }
        if (!found) {
            System.out.println("해당 저자의 책이 존재하지 않습니다.");
        }
    }
}
