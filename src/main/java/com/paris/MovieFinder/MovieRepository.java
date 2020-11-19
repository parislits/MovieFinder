package com.paris.MovieFinder;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface MovieRepository extends JpaRepository<Movies, Integer>{
	
	@Query(value="SELECT * FROM Movies m WHERE m.Votes >100 ORDER BY m.Popularity DESC",nativeQuery = true)
	List<Movies> findPopularMovies();
	
	@Query(value="SELECT * FROM Movies m WHERE m.Votes >100 ORDER BY m.Popularity ASC",nativeQuery = true)
	List<Movies> findUnPopularMovies();
	
	@Query(value="SELECT * FROM Movies m WHERE m.Votes >100 ORDER BY m.Average DESC",nativeQuery = true)
	List<Movies> findBestMovies();
	
	@Query(value="SELECT * FROM Movies m WHERE m.Votes >100 ORDER BY m.Average ASC",nativeQuery = true)
	List<Movies> findWorstMovies();
	
	@Query(value="SELECT * FROM Movies m WHERE m.Release > :Date And m.Votes>100 ORDER BY m.Average DESC",nativeQuery = true)
	List<Movies> findDatebyMovies(@Param("Date")String Date);
		
	
	


}
