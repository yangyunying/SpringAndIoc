package com.spring01.ioc01;

/**
 * Created by admin on 2018/9/25.
 */
public class Test {

    public void testStoreBook()
    {
        BookService bookservice=new BookService();
        bookservice.storeBook("《Spring MVC权威指南 第一版》");
    }
}
