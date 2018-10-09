package org.jdred.filmiki.external.omdb;


import org.jdred.filmiki.external.RestClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.util.UriComponentsBuilder;

@Component
public class OmdbCaller {

    private final RestClient restClient;

    @Value("${omdb.host}")
    private String omdbHost;

    @Value("${omdb.api.key}")
    private String apiKey;

    @Autowired
    public OmdbCaller(RestClient restClient) {
        this.restClient = restClient;
    }

    public String search(String query) {
        String uri = UriComponentsBuilder.fromHttpUrl(omdbHost)
                .queryParam("apikey", apiKey)
                .queryParam("s", query)
                .toUriString();

        return restClient.get(uri);
    }

    public String findById(String imdbId) {
        String uri = UriComponentsBuilder.fromHttpUrl(omdbHost)
                .queryParam("apikey", apiKey)
                .queryParam("i", imdbId)
                .toUriString();

        return restClient.get(uri);
    }
}
