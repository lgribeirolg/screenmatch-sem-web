package model;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public record  DadosSerie(	@JsonAlias("Title")String titulo, 
							@JsonAlias("Released")String released,
							@JsonAlias("imdbRating")String avaliacao
							) {
	

}
