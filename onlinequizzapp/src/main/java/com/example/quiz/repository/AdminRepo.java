package com.example.quiz.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.example.quiz.bean.Admin;

public interface AdminRepo extends JpaRepository<Admin, Integer> {
}
