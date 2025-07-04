package com.example.basicsprgboot2025.repository;

import com.example.basicsprgboot2025.domain.Sboard;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Sboardrepo extends JpaRepository<Sboard, Long> {
}
