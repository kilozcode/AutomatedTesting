package service.repository;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import omdb.Movie;

@Repository
public interface iMovieRepository extends JpaRepository<Movie, Integer>{
	
	

}