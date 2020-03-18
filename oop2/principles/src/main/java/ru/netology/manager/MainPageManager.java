package ru.netology.manager;

import ru.netology.domain.Movie;

public class MainPageManager {
  private MovieManager movieManager;

  /**
   * Main Page generation
   */
  public String generate() {
    Movie[] movies = movieManager.getMoviesForFeed();
    // TODO: add logic
    for (Movie movie : movies) {
      String block = movie.getGenre();
    }
    return null;
  }
}
