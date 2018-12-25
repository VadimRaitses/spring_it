package com.bakman.spring_it.repository;

import com.bakman.spring_it.domain.Comment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommentRepository extends JpaRepository<Comment, Long> {
}
