package practiseBen;

import lists.classes.Employee;

import java.util.ArrayList;
import java.util.List;

public class bookClass {
    private Integer id;
    private String bookName;
    private String authorName;

    public Integer getId() {
        return id;
    }

    public String getBookName() {
        return this.bookName;
    }

    public String getAuthorName() {
        return this.authorName;
    }

    public void setId(Integer bookId) {
        id = bookId;
    }

    public void setBookName(String Name) {
        bookName = Name;
    }

    public void setAuthorName(String Name) {
        authorName = Name;
    }

    @Override
    public String toString() {
        return "Book name is " + bookName + " with author " + authorName + " with id " + id;
    }
}
