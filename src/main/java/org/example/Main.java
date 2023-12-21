package org.example;

import org.example.manager.AuthorManager;
import org.example.model.Author;

import java.util.List;

public class Main {

    private static AuthorManager authorManager = new AuthorManager();

    public static void main(String[] args) {
       Author author = new Author("Karen","Poxosyan","karen@mail.com",12);

       authorManager.add(author);
//        System.out.println(author);

//        List<Author> allAuthors = authorManager.getAllAuthors();
//        for (Author allAuthor : allAuthors) {
//            System.out.println(allAuthor);
//        }

//        System.out.println(authorManager.getAuthorById(3));
//
//        authorManager.deleteAuthorById(3);
//
//        System.out.println(authorManager.getAuthorById(3));

    authorManager.updateAuthor(author);
    }
}
