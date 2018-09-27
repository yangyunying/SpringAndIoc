package com.spring01.ioc01;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by admin on 2018/9/25.
 */
public class BookServiceTest {
    @Test
    public void storeBook() throws Exception {
        BookService bookservice=new BookService();
        String message = bookservice.bookDAO.addBook("图书上货33");
        System.out.print(message);
    }

}