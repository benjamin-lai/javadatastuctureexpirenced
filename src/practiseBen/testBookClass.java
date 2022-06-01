package practiseBen;

public class testBookClass {
    public static void main(String[] args) {
        bookClass book = new bookClass();
        book.setAuthorName("Ben");
        book.setBookName("Book");
        book.setId(1);
        System.out.println(book);
    }
}
