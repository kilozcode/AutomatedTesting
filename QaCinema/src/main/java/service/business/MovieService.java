package service.business;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import omdb.Movie;
import service.repository.iMovieRepository;
import utility.JSONUtility;
public class MovieService {
	
	@Autowired
	private JSONUtility util;
	
	@Autowired
	private iMovieRepository repo;
	
	public Movie getMovie() {
		return repo.getMovie();
	}
}
