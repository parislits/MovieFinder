package com.paris.MovieFinder;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;


@Entity
public class Genres {
	
	@Id
	@GeneratedValue
	private Integer Id ;


	@ManyToOne(fetch=FetchType.LAZY)
	@JsonIgnore
	private Movies movie;
	
	public String Genre_Name;

	public Integer getId() {
		return Id;
	}

	public void setId(Integer id) {
		Id = id;
	}

	public Movies getMovie() {
		return movie;
	}

	public void setMovie(Movies movie) {
		this.movie = movie;
	}

	public String getGenre_Name() {
		return Genre_Name;
	}

	public void setGenre_Name(String genre_Name) {
		Genre_Name = genre_Name;
	}

	@Override
	public String toString() {
		return "Genres [Id=" + Id + ", Genre_Name=" + Genre_Name + "]";
	}

 
}
