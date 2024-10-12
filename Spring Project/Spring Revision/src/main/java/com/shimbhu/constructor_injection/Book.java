package com.shimbhu.constructor_injection;

public class Book {

    private Integer id;
    private String name;
    private String author;

    public Book(Integer id, String name, String author) {
        System.out.println("called parameterized constructor.");
        this.id = id;
        this.name = name;
        this.author = author;
    }

    public Book() {
        System.out.println("called zero argument constructor.");
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", author='" + author + '\'' +
                '}';
    }
}
