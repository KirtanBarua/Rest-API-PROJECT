package org.Training.Rest_API_Project.Service;

import org.Training.Rest_API_Project.Entities.Book;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class BookServicImpl implements BookService{

    List<Book> li = new ArrayList<>();
    @Override
    public Book addBook(Book book) {
    li.add(book);
    return book;
    }

    @Override
    public Book getBook(int id) {
        for(Book bok :li){
            if(bok.getId()==id){
                return bok;
            }
        }
        return null;

    }

    @Override
    public Book deleteBookById(int id) {
        Book remove = li.remove(id);
        return remove;
    }

    @Override
    public List<Book> bookByYear(int year) {
        List<Book> b = new ArrayList<>();
        for(Book x :li){
            if(x.getYear() == year){
                b.add(x);
            }

        }
        return b;
    }
}
