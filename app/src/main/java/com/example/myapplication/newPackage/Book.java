package com.example.myapplication.newPackage;

public class Book {
    private String title;
    private String type;
    private int pages;

    public Book(String title, String type, int pages) {
        this.title = title;
        this.type = type;
        this.pages = pages;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }
}


