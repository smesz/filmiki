package org.jdred.filmiki.service;

import org.jdred.filmiki.data.OmdbMovieResponse;
import org.jdred.filmiki.data.search.OmdbSearchMovieResponse;
import org.jdred.filmiki.external.omdb.OmdbCaller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class MovieFinder {

    private final OmdbCaller omdbCaller;

    @Autowired
    public MovieFinder(OmdbCaller omdbCaller) {
        this.omdbCaller = omdbCaller;
    }

    public List<OmdbSearchMovieResponse> search(String query) {
        return omdbCaller.search(query);
    }

    public OmdbMovieResponse findById(String imdbId) {
        return omdbCaller.findById(imdbId);
    }
}
