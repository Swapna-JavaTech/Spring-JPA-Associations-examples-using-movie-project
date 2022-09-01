package com.hexaware.lombakdemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hexaware.lombakdemo.entity.MovieDetails;

@Repository
public interface MovieDetailsRepository extends JpaRepository<MovieDetails, Long>{

}
