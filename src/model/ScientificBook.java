package model;

import model.Book;

public class ScientificBook extends Book {
    private String scientificArea;

    public String getScientificArea() {
        return scientificArea;
    }

    public void setScientificArea(String scientificArea) {
        this.scientificArea = scientificArea;
    }

    public ScientificBook(String name, String author, Integer pages, String scientificArea) {
        super(name, author, pages);
        this.scientificArea=scientificArea;
    }

    @Override
    public String toString() {
        return this.getName() ;
    }
}
