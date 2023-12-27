package dev.webservices.Service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dev.webservices.Entity.Books;
import dev.webservices.Repository.BookRepository;

@Service
public class BookServiceImpl implements BookService {

    @Autowired
    private BookRepository bookRepository;

    @Override
    public Books save(Books books) {
        return bookRepository.save(books);
    }

    @Override
    public Optional<Books> findById(Long id) {
        return bookRepository.findById(id);
    }

}
