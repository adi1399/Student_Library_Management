package com.Spring_Project.Studend_Library_Management_System.Repositories;


import com.Spring_Project.Studend_Library_Management_System.Models.Card;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.support.SimpleJpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface CardRepository extends JpaRepository<Card,Integer> {
}
