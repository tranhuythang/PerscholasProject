package net.javaguides.springboot.repository;

import net.javaguides.springboot.model.Review;
import net.javaguides.springboot.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ReviewRepository extends JpaRepository<Review, Long> {
    @Query("select r from Review r where r.user.username = :username")
    List<Review> findByUsername(@Param("username") String username);



}
