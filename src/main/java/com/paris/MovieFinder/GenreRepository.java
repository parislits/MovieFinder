package com.paris.MovieFinder;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface GenreRepository extends JpaRepository<Genres, Integer>{

	@Query(value="SELECT * FROM Genres g WHERE g.Genre_Name = :Genre",nativeQuery = true)
	List<Genres> findByGenre_Name(@Param("Genre")String Genre_Name);

}


