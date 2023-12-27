package dev.webservices.Service;

import java.util.Optional;

import dev.webservices.Entity.Books;

public interface BookService {

    Books save(Books books);

    Optional<Books> findById(Long id);

}
