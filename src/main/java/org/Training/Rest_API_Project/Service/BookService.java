package org.Training.Rest_API_Project.Service;

import org.Training.Rest_API_Project.Entities.Book;

import java.util.List;

public interface BookService {
      Book addBook(Book book);

      Book getBook(int id);

     Book deleteBookById(int id);

     List<Book> bookByYear(int year);
}
