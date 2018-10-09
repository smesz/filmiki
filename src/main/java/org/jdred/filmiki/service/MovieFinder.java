package org.jdred.filmiki.service;

import org.jdred.filmiki.external.omdb.OmdbCaller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MovieFinder {

    private final OmdbCaller omdbCaller;

    @Autowired
    public MovieFinder(OmdbCaller omdbCaller) {
        this.omdbCaller = omdbCaller;
    }

    public String search(String query) {
        return omdbCaller.search(query);
    }

    public String findById(String imdbId) {
        return omdbCaller.findById(imdbId);
    }
}
