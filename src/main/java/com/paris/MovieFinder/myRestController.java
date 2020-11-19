package com.paris.MovieFinder;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.hateoas.EntityModel;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class myRestController {
	
	@Autowired
	private MovieRepository movieRepository;
	
	@Autowired
	private GenreRepository genreRepository;
	
	
	@GetMapping("/movies/{id}")
	public EntityModel<Movies> retrieveMovie(@PathVariable int id) {
		Optional<Movies> movie = movieRepository.findById(id);
		
		EntityModel<Movies> resource = EntityModel.of(movie.get());
		
		return resource;
	}	
	
	@GetMapping("/movies/Best")
	public List<Movies> retrieveBestMovies() {
			return movieRepository.findBestMovies();
		}
	@GetMapping("/movies/Popular")
	public List<Movies> retrievePopularMovies() {
			return movieRepository.findPopularMovies();
		}
	@GetMapping("/movies/Unpopular")
	public List<Movies> retrieveUnpopularMovies() {
			return movieRepository.findUnPopularMovies();
		}
	@GetMapping("/movies/Worst")
	public List<Movies> retrieveWorstMovies() {
			return movieRepository.findWorstMovies();
		}

		
	
	@GetMapping("/movies/Best/{Date}")
	public List<Movies> retrieveDatebyBestMovies(@PathVariable String Date) {
			return movieRepository.findDatebyMovies(Date);	
	}
	
	
	@GetMapping("/genres/{name}")
	public List<Genres> retrieveGenres(@PathVariable String name) {
		return genreRepository.findByGenre_Name(name);
	}
	

}
