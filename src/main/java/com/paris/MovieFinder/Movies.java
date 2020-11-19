package com.paris.MovieFinder;


import java.util.List;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;



@Entity
public class Movies {
    
    @Id
	@GeneratedValue
    private Integer ID ;
    
    private String IMDB_ID ;
    
    private String ORIGINAL_TITLE ;
   
    private String OVERVIEW ;
    
    private Double POPULARITY ;
    
    private String POSTER ;
    
    private String RELEASE ;
    
    private Double AVERAGE ;
    
    private Integer VOTES ;

    @OneToMany(mappedBy="movie")
    private List<Genres> Genre ;
    

    
	public Movies() {
				
		}
	
    public List<Genres> getGenre() {
        return Genre;
    }

    public void setGenre(List<Genres> genre) {
        Genre = genre;
    }


    public String getIMDB_ID() {
        return IMDB_ID;
    }

    public void setIMDB_ID(String IMDB_ID) {
        this.IMDB_ID = IMDB_ID;
    }

    public Integer getID() {
        return ID;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }

    public String getORIGINAL_TITLE() {
        return ORIGINAL_TITLE;
    }

    public void setORIGINAL_TITLE(String ORIGINAL_TITLE) {
        this.ORIGINAL_TITLE = ORIGINAL_TITLE;
    }


    public String getOVERVIEW() {
        return OVERVIEW;
    }

    public void setOVERVIEW(String OVERVIEW) {
        this.OVERVIEW = OVERVIEW;
    }

    public Double getPOPULARITY() {
        return POPULARITY;
    }

    public void setPOPULARITY(Double POPULARITY) {
        this.POPULARITY = POPULARITY;
    }

    public String getPOSTER() {
        return POSTER;
    }

    public void setPOSTER(String POSTER) {
        this.POSTER = POSTER;
    }

    public String getRELEASE() {
        return RELEASE;
    }

    public void setRELEASE(String RELEASE) {
        this.RELEASE = RELEASE;
    }

    public Double getAVERAGE() {
        return AVERAGE;
    }

    public void setAVERAGE(Double AVERAGE) {
        this.AVERAGE = AVERAGE;
    }

    public Integer getVOTES() {
        return VOTES;
    }

    public void setVOTES(Integer VOTES) {
        this.VOTES = VOTES;
    }
    
    @Override
    public String toString() {
    	return String.format("Movie [id=%s, IMDB=%s, votes=%s]", ID, IMDB_ID, VOTES);
    }
    
}

