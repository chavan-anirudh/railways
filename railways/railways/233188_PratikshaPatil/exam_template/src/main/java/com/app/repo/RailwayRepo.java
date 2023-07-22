package com.app.repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.entity.Category;
import com.app.entity.Railway;

@Repository
public interface RailwayRepo extends JpaRepository<Railway, Long> {

	Optional<Railway> findByCategory(Category cat);
}
