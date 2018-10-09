package org.jdred.filmiki.data;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

public class OmdbMovieResponse implements Serializable {

    private String title;
    private String year;
    private String metascore;

    @JsonProperty("Title")
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @JsonProperty("Year")
    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    @JsonProperty("Metascore")
    public String getMetascore() {
        return metascore;
    }

    public void setMetascore(String metascore) {
        this.metascore = metascore;
    }
}
