package com.Spring_Project.Studend_Library_Management_System.Repositories;


import com.Spring_Project.Studend_Library_Management_System.Models.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface BookRepository extends JpaRepository<Book, Integer> {

}