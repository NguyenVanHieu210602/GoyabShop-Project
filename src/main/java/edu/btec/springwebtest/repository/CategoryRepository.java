package edu.btec.springwebtest.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import edu.btec.springwebtest.domain.Category;
@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {
	List<Category> findByNameContaining(String name);
}
