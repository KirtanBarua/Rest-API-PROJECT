package org.Training.Rest_API_Project.Controller;

import org.Training.Rest_API_Project.Entities.Book;
import org.Training.Rest_API_Project.Service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/books")
public class BookController
{

    public BookService bk;

    public BookController(@Autowired BookService bk) {
        this.bk = bk;
    }

    @PostMapping("/add")
    public Book addBook( @RequestBody Book b){
        return bk.addBook(b);
    }

    @DeleteMapping("/{id}")
    public Book deleteBook(@PathVariable int id){
        return bk.deleteBookById(id);
    }
    @GetMapping("/{id}")
    public Book getBookById(@PathVariable int id){
        return bk.getBook(id);
    }


    @GetMapping("/bby")
    public List<Book> getBookByYear(@RequestParam int year){
        return bk.bookByYear(year);
    }




}
