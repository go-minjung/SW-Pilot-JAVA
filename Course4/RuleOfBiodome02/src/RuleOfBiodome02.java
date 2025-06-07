public class RuleOfBiodome02 {
    public static void main(String[] args) {
        Library library = new Library();    // 도서관 시스템 생성

        // 관리자 등록
        Manager manager = new Manager("M01", "세이코");
        manager.registerManager(library, manager);

        // 이용자 등록
        Member member1 = new Member("U01", "메리");
        Member member2 = new Member("U02", "만옥");
        manager.registerMember(library, member1);
        manager.registerMember(library, member2);

        // 책 등록 5권
        manager.addBook(library, "자바의 구름", "제임스밥", "ISBN001");
        manager.addBook(library, "파이썬 마스터", "한송희", "ISBN002");
        manager.addBook(library, "에너지 플로우", "키네틱스", "ISBN003");
        manager.addBook(library, "화성에서의 기억", "한송희", "ISBN004");
        manager.addBook(library, "야채의 비밀", "송은정", "ISBN005");

        // 메리가 책 대출
        Book borrowedBook = library.getBooks().get(0); // 자바의 구름
        member1.borrowBook(borrowedBook);

        // 책 2권 추가
        manager.addBook(library, "자료구조의 언덕", "황수", "ISBN006");
        manager.addBook(library, "그곳에 가면", "한송희", "ISBN007");

        // 다른 사람이 같은 책 대출 시도
        member2.borrowBook(borrowedBook);

        // 반납
        member1.returnBook(borrowedBook);

        // 관리자가 책 대출
        for (Book book : library.getBooks()) {
            if (book.getTitle().equals("화성에서의 기억")) {
                manager.borrowBook(book);
                break;
            }
        }

        // 저자 검색
        library.searchByAuthor("한송희");
    }
}
