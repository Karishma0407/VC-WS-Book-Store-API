package dev.webservices.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import dev.webservices.Entity.Books;

@Repository
public interface BookRepository extends CrudRepository<Books, Long> {

}
