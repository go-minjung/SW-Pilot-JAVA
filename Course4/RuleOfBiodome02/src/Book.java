// 책 정보와 상태 저장, 관리
public class Book {
    private String title;
    private String author;
    private String isbn;
    private boolean isAvailable = true;     // 대출 가능 여부

    public Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        this.isAvailable = available;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    // 책 정보 출력
    public void printInfo() {
        System.out.println(title + ", " + author + ", " + (isAvailable ? "대출 가능" : "대출 불가"));
    }

}
