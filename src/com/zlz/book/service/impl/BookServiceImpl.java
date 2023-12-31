package com.zlz.book.service.impl;

import com.zlz.book.dao.BookDAO;
import com.zlz.book.pojo.Book;
import com.zlz.book.service.BookService;

import java.util.List;

public class BookServiceImpl implements BookService {

    private BookDAO bookDAO ;

    @Override
    public List<Book> getBookList() {
        return bookDAO.getBookList();
    }

    @Override
    public Book getBook(Integer id) {
        return bookDAO.getBook(id);
    }
}
