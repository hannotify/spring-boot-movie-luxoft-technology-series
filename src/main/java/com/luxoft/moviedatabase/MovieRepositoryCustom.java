package com.luxoft.moviedatabase;

import java.util.List;

public interface MovieRepositoryCustom {
    List<Movie> findByDecade(int decade);
}
