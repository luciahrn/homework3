package model;


public class ScientificBook extends Book {
    private String scientificArea;

    public ScientificBook(String name, String author, Integer pages, String scientificArea) {
        super(name, author, pages);
        this.scientificArea=scientificArea;
    }

    @Override
    public String toString() {
        return this.getName() ;
    }
}
