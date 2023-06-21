package com.zlz.book.service;

import com.zlz.book.pojo.Book;

import java.util.List;

public interface BookService {
    List<Book> getBookList();
    Book getBook(Integer id);
}
