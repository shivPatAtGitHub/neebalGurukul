package com.neebal;

import com.neebal.entities.Book;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import java.util.List;
//Hql = Hibernate Query language
//it is similar to sql
public class QueryingBooksHql {

    //select * from book
    private static void findAllBooks(Session session){

        List<Book> books =session.createQuery("from Book b",Book.class).getResultList();
        System.out.println(books);
    }

    //select book.title from book
    private static void findAllBookTitles(Session session){

        List<String> titles =session.createQuery(
                "select b.title from Book b",
                String.class).getResultList();
        System.out.println(titles);
    }

    //select title and price from book
    private static void findAllBookTitlesAndPrice(Session session){
       /* List<Object[]> objects =session.createQuery(
                "select b.title,b.price from Book b",
                Object[].class).getResultList();
        objects.forEach(object -> System.out.println(object[0]+" "+object[1]));*/

        List<Object[]> objects =session.createNamedQuery(
                "Book.findTitlePrice",
                Object[].class).getResultList();
        objects.forEach(object -> System.out.println(object[0]+" "+object[1]));

    }

    //select title and price where pages>500 and descending order by price.
    //Here pages is passed as a parameter and passed during function call.
    private static void findAllBookTitlesAndPriceByPages(Session session,int pages){
        /*List<Object[]> objects =session.createQuery(
                "select b.title,b.price from Book b " +
                        "where b.pages> :pages " +
                        "order by b.price desc",Object[].class)
                .setParameter("pages", pages)
                .getResultList();
        objects.forEach(object -> System.out.println(object[0]+" "+object[1]));*/

        List<Object[]> objects =session.createNamedQuery(
                        "Book.findTitlePriceByPagesOrderByPrice",Object[].class)
                .setParameter("pages", pages)
                .getResultList();
        objects.forEach(object -> System.out.println(object[0]+" "+object[1]));
    }

    //count no of books with pages more than 500
    //Here pages is passed as a parameter
    private static void countBooksByPages(Session session,int pages){
        Long count =session.createQuery(
                        "select count(b.title) from Book b " +
                                "where b.pages> :pages ",
                                Long.class)
                .setParameter("pages", pages)
                .getSingleResult();
        System.out.println(count);
    }

    public static void main(String[] args) {
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        try(Session session = sessionFactory.openSession()){
           //findAllBooks(session);
           //findAllBookTitles(session);
           //findAllBookTitlesAndPrice(session);
            findAllBookTitlesAndPriceByPages(session,500);
            //countBooksByPages(session,500);
        }
    }
}
