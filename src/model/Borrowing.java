package model;

import model.Book;
import model.Subscriber;

import java.time.LocalDate;

import static java.time.temporal.ChronoUnit.DAYS;

public class Borrowing  {
    private Book book;
    private Subscriber subscriber;
    private LocalDate borrowDate;
    private LocalDate returnDate;

    public Borrowing(Book book, Subscriber subscriber,LocalDate borrowDate, LocalDate returnDate) {
        this.book = book;
        this.subscriber = subscriber;
        this.borrowDate=borrowDate;
        this.returnDate = returnDate;
    }

    public Borrowing(Book book, Subscriber subscriber,LocalDate borrowDate) {
        this.book = book;
        this.subscriber = subscriber;
        this.borrowDate=borrowDate;

    }

    public LocalDate getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(LocalDate returnDate) {
        this.returnDate = returnDate;
    }

    public long numerOfDays() {
        long daysBetween = DAYS.between(this.borrowDate, this.returnDate);
        return daysBetween;
    }
}
