package com.zlz.book.dao;

import com.zlz.book.pojo.Book;

import java.util.List;

public interface BookDAO {
    List<Book> getBookList();
    Book getBook(Integer id);
}
