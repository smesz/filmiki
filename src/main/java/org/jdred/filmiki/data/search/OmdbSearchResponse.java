package org.jdred.filmiki.data.search;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class OmdbSearchResponse {

    @JsonProperty("Search")
    private List<OmdbSearchMovieResponse> search;

    @JsonProperty("totalResults")
    private int totalResults;

    @JsonProperty("Response")
    private boolean response;

    public List<OmdbSearchMovieResponse> getSearch() {
        return search;
    }

    public void setSearch(List<OmdbSearchMovieResponse> search) {
        this.search = search;
    }

    public int getTotalResults() {
        return totalResults;
    }

    public void setTotalResults(int totalResults) {
        this.totalResults = totalResults;
    }

    public boolean isResponse() {
        return response;
    }

    public void setResponse(boolean response) {
        this.response = response;
    }
}
