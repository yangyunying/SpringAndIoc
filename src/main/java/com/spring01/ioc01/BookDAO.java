package com.spring01.ioc01;

/**
 * Created by admin on 2018/9/25.
 * 图书数据访问实现类
 */
public class BookDAO implements IBookDAO{

    public String addBook(String bookname) {
        return "添加图书"+bookname+"成功！";
    }
}
