Create database libmgmt_aug2023_db;

-- Library System
select * from books;
select * from authors;
select * from locations;
select * from publication_houses;
select * from authors_books;

-- School Details
select * from questions; 
select * from topics;
select * from opts;
select * from exams;
select * from students;
select * from books_students;
select * from people;
select * from professors;



desc books_students;
desc students;
desc books;
desc exams;
desc topics;
desc opts;
desc questions;

insert into students(
gender, roll, studName) values ('m', 201, 'Rupendra'), ('m', 202, 'Narendra') ;
