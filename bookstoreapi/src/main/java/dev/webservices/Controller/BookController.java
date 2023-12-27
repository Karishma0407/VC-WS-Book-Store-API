package dev.webservices.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import dev.webservices.Entity.Books;
import dev.webservices.Service.BookService;

@RestController
@RequestMapping("/book")
public class BookController {

    @Autowired
    private BookService bookService;

    @PostMapping("/save")
    public void save(@RequestBody Books book) {

        bookService.save(book);

        System.out.println("BOOK SAVED");
    }

    @GetMapping("/find")
    public Books getBook(@RequestParam Long id) {
        return bookService.findById(id).get();
    }

}
