package Language.OOPs;

import java.util.ArrayList;

public class ObjectInClass {

}

class Book{

    private static int numberOfBooks = 0;

    private String name;
    private double price;
    private int noOfPages;
    private String author;
    private boolean readed;

    public Book(String name, double price, int pages, String author, boolean isReaded) {
        numberOfBooks++;
        this.name = name;
        this.price = price;
        this.noOfPages = pages;
        this.author = author;
        this.readed = isReaded;
    }

    public static int getNumberOfBooks() {
        return numberOfBooks;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getNoOfPages() {
        return noOfPages;
    }

    public String getAuthor() {
        return author;
    }

    public boolean isReaded() {
        return readed;
    }

    /* utility methods */


}
