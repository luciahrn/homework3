package model;

public class Book {
    private String name;
    private String author;
    private Integer pages;

    public Book(String name,String author,Integer pages) {
        this.name = name;
        this.author=author;
        this.pages=pages;

    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name;
    }
}
