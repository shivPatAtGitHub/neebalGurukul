package com.neebal.collegemgmt.repository;

import com.neebal.collegemgmt.entities.Book;
import com.neebal.collegemgmt.repository.projections.BookTitlePrice;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BookRepository extends JpaRepository<Book, Long> , BookRepositoryCustom{
    //dynamic finders
    //<<do-something>><<entity-class-name>>By<Attribute-name>><<Operator>><<Conjunction>>.......

    List<Book> findBookByPrice(Double price);
    List<Book> findBookByPriceGreaterThan(Double price);
    List<Book> findBookByPriceGreaterThanAndPagesLessThan(Double price, Integer pages);
    Long countBookByPagesGreaterThan(Integer pages);
    List<Book> findBookByTitleContainingOrderByPriceDesc(String keyword);
    boolean existsBookByTitleStartingWith(String string);
    List<BookTitlePrice> findBookByPagesGreaterThan(Integer pages);
    List<Book> queryBookByPriceLessThanEqual(Double price);

}
