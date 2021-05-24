package com.github.andrelugomes.countries.resources;

import com.github.andrelugomes.countries.entities.Country;
import com.github.andrelugomes.countries.repositories.CountryRepository;
import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CountryResource {

  private final CountryRepository repository;

  public CountryResource(final CountryRepository repository) {
    this.repository = repository;
  }

  /*
  @GetMapping("/countries")
  public List<Country> cities() {

    return repository.findAll();
  }
   */

  //--- Modificação implementada conforme Aula7 / Modulo8 vídeo 03'59"
  @GetMapping("/countries")
  public Page cities(Pageable page) {

    return repository.findAll(page);

  }

}
