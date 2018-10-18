package omdb;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="movie_data")
public class Movie {
	
	@Column (name="title")
	private String title;
	
	@Column (name="runtime")
	private int minutes;
	
	@Column (name="realease_Date")
	private String releaseDate;
	
	@Column (name="age_rating")
	private String ageRating;
	
	@Column (name="diretor")
	private String director;

	public Movie(String title, int minutes, String releaseDate, String ageRating, String director) {
		
		this.title = title;
		this.minutes = minutes;
		this.releaseDate = releaseDate;
		this.ageRating = ageRating;
		this.director = director;
	}

	
	public Movie() {
		
	}


	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getMinutes() {
		return minutes;
	}

	public void setMinutes(int minutes) {
		this.minutes = minutes;
	}

	public String getReleaseDate() {
		return releaseDate;
	}

	public void setReleaseDate(String releaseDate) {
		this.releaseDate = releaseDate;
	}

	public String getAgeRating() {
		return ageRating;
	}

	public void setAgeRating(String ageRating) {
		this.ageRating = ageRating;
	}

	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}
	

}
