package com.neebal.collegemgmt.services;


import com.neebal.collegemgmt.entities.Book;
import com.neebal.collegemgmt.entities.Student;
import com.neebal.collegemgmt.exceptions.BookNotIssuedException;
import com.neebal.collegemgmt.exceptions.ResourceNotFoundException;
import com.neebal.collegemgmt.repository.BookRepository;
import com.neebal.collegemgmt.repository.BookStudentRepository;
import com.neebal.collegemgmt.repository.StudentRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

import org.mockito.Mockito.*;

import java.util.HashSet;
import java.util.Optional;

@ExtendWith(MockitoExtension.class)
class BookStudentServiceTest {
    @InjectMocks
    private BookStudentService bookStudentService;

    @Mock
    private BookRepository bookRepository;

    @Mock
    private StudentRepository studentRepository;

    @Mock
    private BookStudentRepository bookStudentRepository;


    @Test
    void returnBookWhenBookNotFound() {
        Long bookId = 2l;
        Long studentId =1l;

        when(bookRepository.findById(bookId)).thenReturn(Optional.empty());
        ResourceNotFoundException ex = assertThrows(
                ResourceNotFoundException.class,
                () -> this.bookStudentService.returnBook(bookId, studentId)
        );

        assertEquals(ex.getMessage(), "Book with id 2 not found");

    }

    @Test
    void returnBookWhenStudentNotFound() {
        Long bookId = 2l;
        Long studentId =1l;

        when(bookRepository.findById(bookId))
                .thenReturn(Optional.of(
                        new Book()
                ));

        when(studentRepository.findById(studentId)).thenReturn(Optional.empty());
        ResourceNotFoundException ex = assertThrows(
                ResourceNotFoundException.class,
                () -> this.bookStudentService.returnBook(bookId, studentId)
        );

        assertEquals(ex.getMessage(), "Student with id " + studentId + " not found");
    }

    @Test
    void returnBookWhenBookNotIssuedToStudent() {
        Long bookId = 2l;
        Long studentId =1l;
        Student s = new Student();
        s.setBooksIssued(new HashSet<>());

        when(bookRepository.findById(bookId))
                .thenReturn(Optional.of(
                        new Book()
                ));

        when(studentRepository.findById(studentId))
                .thenReturn(Optional.of(s));

        BookNotIssuedException ex = assertThrows(
                BookNotIssuedException.class,
                () -> this.bookStudentService.returnBook(bookId, studentId)
        );
        assertEquals(ex.getMessage(), String.format("Book id %s is not yet issued to student %s", bookId ,studentId));
    }


}