package com.cine.repository;

import com.cine.model.Theater;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TheaterRepository extends JpaRepository<Theater, Long> {
}
