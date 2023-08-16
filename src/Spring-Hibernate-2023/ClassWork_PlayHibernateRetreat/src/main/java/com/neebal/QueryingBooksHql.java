package com.neebal;

import com.neebal.entities.Book;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import java.util.List;

public class QueryingBooksHql {
    private static void countBookByPagesUsingNamedQueryAndVariables(Session session, int pages) {
        Long countRows = session.createNamedQuery("Book.bookCountWithPages>500", Long.class)
                .setParameter("pages", pages)
                .getSingleResult();
        System.out.println(countRows);
    }
    private static void findAllBooksTitlesPricePagesOrderByPagesUsingNamedQueryUsingVariables(Session session, int pages) {
        List<Object[]> rows = session.createNamedQuery("Book.TitlePricePages>500OrderByPagesDESCUsingVariables", Object[].class)
                .setParameter("pages", pages)
                .getResultList();
        rows.forEach(row -> System.out.println(row[0] + " -- " + row[1] + " -- " + row[2]));
    }
    private static void findAllBooksTitlesPricePagesOrderByPagesUsingNamedQuery(Session session) {
        List<Object[]> rows = session.createNamedQuery("Book.TitlePricePages>500OrderByPagesDESC", Object[].class)
                .getResultList();
        rows.forEach(row -> System.out.println(row[0] + " -- " + row[1] + " -- " + row[2]));
    }

    private static void findAllBooksTitlesPricePagesByNamedQuery(Session session) {
        List<Object[]> rows = session.createNamedQuery("Book.findTitlePrice", Object[].class).getResultList();
        rows.forEach(row -> System.out.println(row[0] + " -- " + row[1] + " -- " + row[2]));
    }

    private static void countBookByPages(Session session,int pages) {
        Long countRows = session.createQuery("select count(b.pages) " +
                "from Book b " +
                "where b.pages > :pages", Long.class)
                .setParameter("pages", pages)
                .getSingleResult();
        System.out.println(countRows);
    }

    private static void findAllBooksTitlesAndPriceByPagesWithVariables(Session session, int pages) {
        List<Object[]> rows = session.createQuery("select b.title, b.price, b.pages from Book b" +
                "where b.pages > :pages " +
                "order by b.price desc", Object[].class)
                .setParameter("pages", pages)
                .getResultList();
        rows.forEach(row -> System.out.println(row[0] + " -- " + row[1] + " -- " + row[2]));
    }

    private static void findAllBooksTitlesAndPriceByPages(Session session) {
        List<Object[]> rows = session.createQuery("select b.title, b.price, b.pages from Book b " +
                "where b.pages > 500 " +
                "order by b.price desc", Object[].class).getResultList();
        rows.forEach(row -> System.out.println(row[0] + " -- " + row[1] + " -- " + row[2]));
    }

    private static void findAllBooksTitlesAndPrice(Session session) {
        List<Object[]> titlesAndPrice = session.createQuery("select b.title, b.price from Book b", Object[].class).getResultList();
        titlesAndPrice.forEach(tnp -> System.out.println(tnp[0] + " -- " + tnp[1]));
    }

    private static void findAllBooksTitles(Session session) {
        List<String> bookTitles = session.createQuery("select b.title from Book b", String.class).getResultList();
        System.out.println(bookTitles);
    }

    private static void  findAllBooks(Session session) {
        List<Book> books = session.createQuery("from Book b", Book.class).getResultList();
        System.out.println(books);
    }

    public static void main(String[] args) {
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        try(Session session = sessionFactory.openSession()) {
//            findAllBooks(session);
//            findAllBooksTitles(session);
//            findAllBooksTitlesAndPrice(session);
//            findAllBooksTitlesAndPriceByPages(session);
//            findAllBooksTitlesAndPriceByPagesWithVariables(session , 500);
//            countBookByPages(session, 500);
//            findAllBooksTitlesPricePagesByNamedQuery(session);
//            findAllBooksTitlesPricePagesOrderByPagesUsingNamedQuery(session);
//            findAllBooksTitlesPricePagesOrderByPagesUsingNamedQueryUsingVariables(session ,500);
            countBookByPagesUsingNamedQueryAndVariables(session, 500);
        }
    }
}
