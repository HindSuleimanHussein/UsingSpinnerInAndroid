package com.example.myapplication.newPackage;

import java.util.ArrayList;
import java.util.List;

 public class BookDs {
    private List<Book> books;

    public BookDs() {
        books = new ArrayList<Book>();
        books.add(new Book("Core Java", "Programming", 350));
        books.add(new Book("Data Structure", "Programming", 540));
        books.add(new Book("Database", "Database", 230));
    }

     public List<Book> getBooksByTypes(String types){
        List<Book> lstBooks=new ArrayList<>();
        for(Book b:books){
            if(b.getType().equals(types)){
                lstBooks.add(b);
            }
        }
        return lstBooks;
    }
}
