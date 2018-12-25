package com.bakman.spring_it.repository;

import com.bakman.spring_it.domain.Link;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LinkRepository extends JpaRepository<Link, Long> {

    Link findByTitle(String title);

}
