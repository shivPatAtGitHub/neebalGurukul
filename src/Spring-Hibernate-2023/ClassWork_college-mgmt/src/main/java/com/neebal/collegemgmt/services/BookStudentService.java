package com.neebal.collegemgmt.services;

import com.neebal.collegemgmt.entities.Book;
import com.neebal.collegemgmt.entities.BookStudent;
import com.neebal.collegemgmt.entities.Student;
import com.neebal.collegemgmt.exceptions.BookAlreadyIssuedException;
import com.neebal.collegemgmt.exceptions.BookNotIssuedException;
import com.neebal.collegemgmt.exceptions.ResourceNotFoundException;
import com.neebal.collegemgmt.repository.BookRepository;
import com.neebal.collegemgmt.repository.BookStudentRepository;
import com.neebal.collegemgmt.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.Set;

@Service
public class BookStudentService {

    private BookRepository bookRepository;

    private StudentRepository studentRepository;

    private BookStudentRepository bookStudentRepository;

    public BookStudentService(BookRepository bookRepository,
                              StudentRepository studentRepository,
                              BookStudentRepository bookStudentRepository) {
            this.bookRepository = bookRepository;
            this.studentRepository = studentRepository;
            this.bookStudentRepository = bookStudentRepository;
    }

    @Autowired // self injection to call business methods within the same service class
    @Lazy //to avoid circular dependency error in the case of self injection
    private BookStudentService bookStudentService;

    @Autowired
    private SendEmailService sendEmailService;

    @Transactional
    public BookStudent issueBook(Long bookId, Long studentId) {

        Book book = bookRepository
                .findById(bookId)
                .orElseThrow(() -> new ResourceNotFoundException(
                        String.format("Book with id %s not found", bookId)
                ));

//        Optional<Book> o1 = bookRepository.findById(bookId);
//        if(o1.isEmpty()) {
//            throw new ResourceNotFoundException(
//              String.format("Book with id %s not found", bookId)
//            );
//        }

        Student student = studentRepository
                .findById(studentId)
                .orElseThrow(() -> new ResourceNotFoundException(
                        String.format("Student with id %s not found", studentId)
                ));

//        Optional<Student> o2 = studentRepository.findById(studentId);
//        if(o2.isEmpty()) {
//            throw new ResourceNotFoundException(
//                    String.format("Student with id %s not found", studentId)
//            );
//        }

//        Book book = o1.get();
//        Student student = o2.get();

        Set<BookStudent> bookStudents = student.getBooksIssued();
        long c = bookStudents
                .stream()
                .filter(
                        bookStudent -> bookStudent.getBook() == book &&
                                bookStudent.getReturnDate() == null).count();

        if(c > 0) {
            throw new BookAlreadyIssuedException(
                    String.format("Book id %s already issued to student %s", bookId ,studentId)
            );
        }

        BookStudent bs = new BookStudent(student, book, new Date());

        this.bookStudentRepository.save(bs);

        //send a confirmation email to the student
        String email = "shivaldo7@gmail.com";
        sendEmailService.sendMail(email,"Book Issued Successfully");
        return bs;
    }

    @Transactional
    public BookStudent returnBook(Long bookId, Long studentId) {
        Book book = bookRepository
                .findById(bookId)
                .orElseThrow(() -> new ResourceNotFoundException(
                        String.format("Book with id %s not found", bookId)
                ));

        Student student = studentRepository
                .findById(studentId)
                .orElseThrow(() -> new ResourceNotFoundException(
                        String.format("Student with id %s not found", studentId)
                ));

        Set<BookStudent> bookStudents = student.getBooksIssued();

        long c = bookStudents
                .stream()
                .filter(
                        bookStudent -> bookStudent.getBook() == book &&
                                bookStudent.getReturnDate() == null).count();

        if(c == 0) {
            throw new BookNotIssuedException(
                    String.format("Book id %s is not yet issued to student %s", bookId ,studentId)
            );
        }


        BookStudent bookStudent = bookStudentRepository.findBookStudentByBookAndStudentAndReturnDateIsNull(book, student);
        bookStudent.setReturnDate(new Date());

        this.bookStudentRepository.save(bookStudent);

        return null;
    }


    @Transactional
    public void transferBook(Long bookId, Long fromStudentId, Long toStudentId) {

        Book book = bookRepository
                .findById(bookId)
                .orElseThrow(() -> new ResourceNotFoundException(
                        String.format("Book with id %s not found", bookId)
                ));


//        returnBook(bookId, fromStudentId);
//        issueBook(bookId, toStudentId);


        // Returned book fromStudent
        Student fromStudent = studentRepository
                .findById(fromStudentId)
                .orElseThrow(() -> new ResourceNotFoundException(
                        String.format("Student with id %s not found", fromStudentId)
                ));

        Set<BookStudent> bookStudents1 = fromStudent.getBooksIssued();

        long c = bookStudents1
                .stream()
                .filter(
                        bookStudent -> bookStudent.getBook() == book &&
                                bookStudent.getReturnDate() == null).count();

        if(c == 0) {
            throw new BookAlreadyIssuedException(
                    String.format("Book id %s already returned by student %s", bookId ,fromStudentId)
            );
        }


        BookStudent bookStudent = bookStudentRepository.findBookStudentByBookAndStudentAndReturnDateIsNull(book, fromStudent);
        bookStudent.setReturnDate(new Date());

        this.bookStudentRepository.save(bookStudent);



        // Issue book to  toStudent
        Student toStudent = studentRepository
                .findById(toStudentId)
                .orElseThrow(() -> new ResourceNotFoundException(
                        String.format("Student with id %s not found", toStudentId)
                ));

        Set<BookStudent> bookStudents2 = toStudent.getBooksIssued();
        long d = bookStudents2
                .stream()
                .filter(
                        bookStudents -> bookStudents.getBook() == book &&
                                bookStudents.getReturnDate() == null).count();

        if(d > 0) {
            throw new BookAlreadyIssuedException(
                    String.format("Book id %s already issued to student %s", bookId , toStudentId)
            );
        }

        BookStudent bs = new BookStudent(toStudent, book, new Date());

        this.bookStudentRepository.save(bs);


    }

    @Transactional
    public void transferBookAlternative(Long bookId, Long fromStudentId, Long toStudentId) {
        bookStudentService.returnBook(bookId, fromStudentId);

//        some exception
//        dummy scenario for the exception
//        String x = null;
//        System.out.println(x.toUpperCase());

        bookStudentService.issueBook(bookId, toStudentId);
    }



}
