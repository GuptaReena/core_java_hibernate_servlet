package com.bms.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashSet;
import java.util.Set;

import com.bms.model.BookPojo;
import com.mysql.cj.x.protobuf.MysqlxSql.StmtExecute;

public class BookDaoJdbcImpl implements BookDao{

	@Override
	public Set<BookPojo> fetchAllBooks() {
		
		// TODO Auto-generated method stub
		Set<BookPojo> returnBooks =  new HashSet<>();
		Connection conn = DBUtils.makeConnection();
		try {
			Statement stmt = conn.createStatement();
			ResultSet rs =  stmt.executeQuery(DBQueries.FETCH_ALL_BOOKS);
			
			while(rs.next()) {
				
				BookPojo bookPojo =  new BookPojo(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getInt(5),rs.getString(6));
				returnBooks.add(bookPojo);
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return returnBooks;
	}

	@Override
	public BookPojo fetchABook(int bookId) {
		// TODO Auto-generated method stub
		
		BookPojo fetchedBook = null;
		Connection conn =  DBUtils.makeConnection();
		
		try {
			Statement stmt = conn.createStatement();
			
			ResultSet rs = stmt.executeQuery(DBQueries.FETCH_A_BOOK + bookId);
			if(rs.next()) {
				fetchedBook =  new BookPojo(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getInt(5),rs.getString(6));
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return fetchedBook;
	}

	@Override
	public Set<BookPojo> fetchByGener(String bookGener) {
		// TODO Auto-generated method stub
		
		Set<BookPojo> returnBooks =  new HashSet<>();
		Connection conn = DBUtils.makeConnection();
		try {
			Statement stmt = conn.createStatement();
			ResultSet rs =  stmt.executeQuery(DBQueries.FETCH_BOOKS_BY_GENER + "'" + bookGener+ "'" );
			
			while(rs.next()) {
				
				BookPojo bookPojo =  new BookPojo(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getInt(5),rs.getString(6));
				returnBooks.add(bookPojo);
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return returnBooks;
	}

	@Override
	public BookPojo addBook(BookPojo newBook) {
		// TODO Auto-generated method stub
		
		Connection conn =  DBUtils.makeConnection();
		try {
			PreparedStatement pstmt =  conn.prepareStatement(DBQueries.ADD_BOOKS);
			pstmt.setString(1, newBook.getBookName());
			pstmt.setString(2, newBook.getBookAuthor());
			pstmt.setString(3, newBook.getBookGener());
			pstmt.setInt(4, newBook.getBookPrice());
			pstmt.setString(5, newBook.getBookImgUrl());
			
			int rowAffected =  pstmt.executeUpdate();
			
			Statement stmt =  conn.createStatement();
			ResultSet rs =  stmt.executeQuery(DBQueries.LAST_INSERT_VALUE);
			if(rs.next()) {
				newBook.setBookId(rs.getInt(1)); 
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return newBook;
	}

	@Override
	public BookPojo updateBook(BookPojo editbook) {
		// TODO Auto-generated method stub
		
		Connection conn = DBUtils.makeConnection();
		try {
			PreparedStatement pstmt = conn.prepareStatement(DBQueries.UPDATE_BOOK);
			pstmt.setInt(1, editbook.getBookPrice());
			pstmt.setInt(2, editbook.getBookId());
			
			pstmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		return editbook;
	}

	@Override
	public void deleteBook(int bookId) {
		// TODO Auto-generated method stub
		
		Connection conn =  DBUtils.makeConnection();
		try {
			Statement stmt = conn.createStatement();
			int rowAffected =  stmt.executeUpdate(DBQueries.DELETE_BOOK + bookId);
			
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
