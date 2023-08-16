package com.neebal.collegemgmt;

import com.neebal.collegemgmt.repository.BookStudentRepository;
import com.neebal.collegemgmt.repository.StudentRepository;
import com.neebal.collegemgmt.services.BookStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CollegeMgmtSystemApplication implements CommandLineRunner {

//	@Autowired
//	private BookRepository bookRepository;
//
//	@Autowired
//	private StudentRepository studentRepository;
//
//	@Autowired
//	private BookStudentRepository bookStudentRepository;
//
	@Autowired
	private BookStudentService bookStudentService;

	public static void main(String[] args) {
		SpringApplication.run(CollegeMgmtSystemApplication.class, args);

	}

	@Override
	public void run(String... args) throws Exception {
//		// save a book
//		Book book = new Book("prog in java", 900, 1500.0);
//		book = this.bookRepository.save(book);
//		System.out.println(book.getId());


//		// save multiple books
//		Book b1 = new Book("prog in python", 1000, 3400.0);
//		Book b2 = new Book("prog in python", 450, 1004.0);
//		Book b3 = new Book("prog in C++", 450, 1500.0);
//		List<Book> books = Arrays.asList(b3);
//		this.bookRepository.saveAll(books);


//		Student s1 = new Student("Shiv", "Shiv@123", 'm');
//		Student s2 = new Student("Rajshree", "Rajshree@123", 'f');
//		Student s3 = new Student("Miroy", "Miroy@123", 'm');
//		List<Student> students = Arrays.asList(s1, s2, s3);
//		this.studentRepository.saveAll(students);



		//query for the book by id
//		this.bookRepository.findById(2l)
//				.ifPresentOrElse(
//						book -> System.out.println(book),
//						() -> System.out.println("book not found")
//		);


//		// update a book whose id is 2;
//		this.bookRepository.findById(2l)
//				.ifPresentOrElse(
//						book -> {book.setPages(2000);
//						this.bookRepository.save(book);
//						},
//						() -> System.out.println("book not found")
//				);


		// delete a book whose id is 2;
//		this.bookRepository.deleteById(2l);


		// query for all the books
//		this.bookRepository.findAll().
//				forEach(book -> System.out.println(book));


//		count for all book
//		System.out.println(	this.bookRepository.count());


//		whether a book with id 1 exists or not in the db
//		System.out.println(this.bookRepository.existsById(1l));
//		System.out.println(this.bookRepository.existsById(7l));


//		find all books by price 3400
//		this.bookRepository.findBookByPrice(3400.0)
//				.forEach(book -> System.out.println(book));


//		find all books by price greater than 500
//		this.bookRepository.findBookByPriceGreaterThan(500.0)
//				.forEach(book -> System.out.println(book));


//		find all books by price greater than 1000 and page less than 900
//		this.bookRepository.findBookByPriceGreaterThanAndPagesLessThan(500.0, 900)
//				forEach(book -> System.out.println(book));
//		.forEach(System.out::println); //Alternative


//		count all books where pages is more than 200
//		System.out.println(this.bookRepository.countBookByPagesGreaterThan(200));


//      find all books that have word "prog" in their title sorted in the descending order of price
//		this.bookRepository.findBookByTitleContainingOrderByPriceDesc("prog")
//				.forEach(book -> System.out.println(book));


// 		check whether a book exists whose title starts with the word prog
//		System.out.println(bookRepository.existsBookByTitleStartingWith("prog"));


//		query title and price of all books whose pages are greater than 200
//		bookRepository.findBookByPagesGreaterThan(300).forEach(bookTitlePrice->
//						System.out.println(bookTitlePrice.getTitle() + " " + bookTitlePrice.getPrice())
//				);

//		group the books by price and find the count of the groups
//		bookRepository.groupByPriceCountBooks()
//				.forEach(objectArray -> System.out.println(
//						objectArray[0] + " " + objectArray[1]
//				));


		//using NamedQuery
//		this.bookRepository
//				.queryBookByPriceLessThanEqual(2200.0)
//				.forEach(book -> System.out.println(book));


//		this.bookStudentService.issueBook(5l, 2l);
//		this.bookStudentService.issueBook(5l, 1l);
//		this.bookStudentService.returnBook(1l,1l);
//		this.bookStudentService.transferBook(1l,2l, 3l);
		this.bookStudentService.transferBookAlternative(5l, 1l, 3l);






	}
}
