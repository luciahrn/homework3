package model;
public class ForeignBook extends Book {
    private String language="English";

    public ForeignBook(String name, String author, Integer pages) {
        super(name, author, pages);
    }
    public ForeignBook(String name, String author, Integer pages,String language) {
        super(name, author, pages);
        this.language=language;
    }
    @Override
    public String toString() {
        return  this.getName();
    }
}
