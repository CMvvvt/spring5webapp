package guru.springframework.spring5webapp.bootstrap;

import guru.springframework.spring5webapp.domain.Author;
import guru.springframework.spring5webapp.domain.Book;
import guru.springframework.spring5webapp.domain.Publisher;
import guru.springframework.spring5webapp.domain.repositories.AuthorRepository;
import guru.springframework.spring5webapp.domain.repositories.BookRepository;
import guru.springframework.spring5webapp.domain.repositories.PublisherRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 * @author cmchenming13@gmail.com
 * @date 2021/7/28 18:18
 */

@Component
public class BootStrapData implements CommandLineRunner {


    private final AuthorRepository authorRepository;
    private final BookRepository bookRepository;
    private final PublisherRepository publisherRepository;

    public BootStrapData(AuthorRepository authorRepository, BookRepository bookRepository, PublisherRepository publisherRepository) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
        this.publisherRepository = publisherRepository;
    }

    @Override
    public void run(String... args) throws Exception {

        Author eric = new Author("Eric", "Evans");
        Book ddd = new Book("Domain Driven Design", "123123");
        eric.getBooks().add(ddd);
        ddd.getAuthors().add(eric);

        authorRepository.save(eric);
        bookRepository.save(ddd);


        Author rod = new Author("Rod", "Jphnson");
        Book noEJB = new Book("J2EE Development without EJB", "39393939393");
        rod.getBooks().add(noEJB);
        noEJB.getAuthors().add(rod);
        authorRepository.save(rod);


        Publisher mysa = new Publisher("mysa", "401 Terry St.", "Seattle", "Washington", "98109" );
        Publisher epic = new Publisher("epic", "401 Terry St.", "Seattle", "Washington", "98109" );
        publisherRepository.save(mysa);
        publisherRepository.save(epic);


        System.out.println("Started");
        System.out.println("Number of Books: " + bookRepository.count());
        System.out.println("Number of publishers: " + publisherRepository.count());
    }
}

