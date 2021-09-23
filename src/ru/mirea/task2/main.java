package ru.mirea.task2;

public class main {
    public static void main(String[] arg) {
        System.out.println("\nTesting class Book");
        book book1 = new book("", "Lev Tolstoy", 1869);
        book book2 = new book("Oblomov", "Ivan Goncharov");
        book book3 = new book("Fathers and Sons");
        System.out.println(book1);
        System.out.println(book2);
        System.out.println(book3);
        book1.setName("War and Peace");
        book2.setPublishingYear(1857);
        book3.setAuthor("Ivan Turgenev");
        book3.setPublishingYear(1861);
        System.out.println(book1);
        System.out.println(book2);
        System.out.println(book3);

    }
}
