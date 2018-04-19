package models;

import java.util.HashSet;
import java.util.Set;

public class Book {

    private Integer id;
    private String title;
    private Integer price;
    private String author;

    public Integer getId(){
        return id;
    }

    public void setId(Integer id){
        this.id = id;
    }

    public String getTitle(){
        return title;
    }

    public void setTitle(String title){
        this.title = title;
    }

    public Integer getPrice(){
        return price;
    }

    public void setPrice(Integer price){
        this.price = price;
    }

    public String getAuthor(){
        return author;
    }

    public void setAuthor(String author){
        this.author = author;
    }

    public Book(Integer id, String title, Integer price, String author){
        this.id = id;
        this.title = title;
        this.price = price;
        this.author = author;
    }

    public Book(){}

    private static Set<Book> books;

    static {
        books = new HashSet<>();
        books.add(new Book(1, "C++", 20, "ABC"));
        books.add(new Book(2, "Java", 30, "XYZ"));
    }

    public static Set<Book> allBooks(){
        return books;
    }

    public static Book findById(Integer id){
        for (Book book : books){
            if (id.equals(book.id)){
                return book;
            }
        }
        return null;
    }

    public static void add(Book book){
        books.add(book);
    }

    public static boolean remove(Book book){
        return books.remove(book);
    }

}
