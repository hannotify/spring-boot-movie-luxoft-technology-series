package com.luxoft.moviedatabase;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Collection;
import java.util.List;
import java.util.UUID;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MovieTest {
	@Autowired private MovieRepository movieRepository;

	@Before
	public void setup() {
		Movie movie = new Movie();
		movie.setId(1L);
		movie.setName("The Godfather");
		movie.setYear("1972");
		movie.setLeadActor("Marlon Brando");
		movie.setLeadActor("Al Pacino");
		movieRepository.save(movie);
	}

	@Test
	public void testFindAll() {
		List<Movie> foods = movieRepository.findAll();

		assertThat(foods.size(), is(1));
	}

	@After
	public void tearDown() {
		movieRepository.deleteAll();
	}
}
