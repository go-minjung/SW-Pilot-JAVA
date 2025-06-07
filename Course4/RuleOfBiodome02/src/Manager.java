// 도서관 관리자 Manager 클래스(책/사용자 관리)
public class Manager extends User {
    public Manager(String id, String name) {
        super(id, name);
    }

    // 책 추가
    public void addBook(Library library, String title, String author, String isbn) {
        Book book = new Book(title, author, isbn);
        library.getBooks().add(book);
        System.out.println("관리자 '" + name + "'가 책을 추가합니다: '" + title + "' - '" + author + "'");
    }

    // 책 삭제(대출 중이면 불가)
    public void removeBook(Library library, Book book) {
        if (!library.getBooks().contains(book)) {
            System.out.println("등록되지 않은 책입니다.");
            return;
        }
        if (!book.isAvailable()) {
            System.out.println("'" + book.getTitle() + "'은(는) 대출 중인 책입니다. 삭제할 수 없습니다.");
            return;
        }
        library.getBooks().remove(book);
        System.out.println("'" + book.getTitle() + "'을(를) 도서관에서 삭제합니다.");
    }

    // 이용자 등록
    public void registerMember(Library library, Member member) {
        library.getMembers().add(member);
        System.out.println("새로운 이용자 '" + member.getName() + "'를 등록합니다.");
    }

    // 관리자 등록
    public void registerManager(Library library, Manager manager) {
        library.getManagers().add(manager);
        System.out.println("새로운 관리자 '" + manager.getName() + "'를 등록합니다.");
    }
}
