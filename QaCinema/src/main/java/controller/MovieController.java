package controller;

import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import omdb.Movie;
import service.business.MovieService;
import service.business.iMovieService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

@RequestMapping("/movie")
@RestController
public class MovieController {

	@Autowired
	private MovieService service;

	@RequestMapping("/getMovie/{name}")
	@ResponseBody
	public String deleteUser(@PathVariable("name") String name) {
		return service.getMovie(name);

	}
	public void setService(MovieService service) {
		this.service = service;
	}
}
