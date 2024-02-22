package ru.job4j.pojo;

public class Libary {
    public static void main(String[] args) {
        Book book1 = new Book("Clean code", 464);
        Book book2 = new Book("1984", 352);
        Book book3 = new Book("Pride and Prejudice", 360);
        Book book4 = new Book("The catcher in the rye", 224);
        Book[] books = new Book[4];
        books[0] = book1;
        books[1] = book2;
        books[2] = book3;
        books[3] = book4;
        for (int i = 0; i < books.length; i++) {
            Book book = books[i];
            System.out.println("Length book " + book.getName() + " - " + book.getNumber());
        }
        System.out.println("Show only \"Clean code\"");
        for (int i = 0; i < books.length; i++) {
            Book book = books[i];
            if ("Clean code".equals(book.getName())) {
                System.out.println("Length book " + book.getName() + " - " + book.getNumber());
            }
        }
        System.out.println("Swap");
        Book temp = books[0];
        books[0] = books[3];
        books[3] = temp;
        for (Book book : books) {
            System.out.println("Length of the book " + book.getName() + " - " + book.getNumber());
        }
    }
}
