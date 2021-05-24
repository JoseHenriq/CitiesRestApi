package com.github.andrelugomes.states.resources;

import com.github.andrelugomes.states.entities.State;
import com.github.andrelugomes.states.repositories.StateRepository;
import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/staties")
public class StateResource {

  private final StateRepository repository;

  public StateResource(final StateRepository repository) {
    this.repository = repository;
  }

  /*
  @GetMapping
  public List<State> staties() {
    return repository.findAll();
  }
   */

  //--- Modificação implementada conforme Aula7 / Modulo8 vídeo 03'59"
  //@GetMapping("/states")
  @GetMapping
  public Page states(Pageable page) {

    return repository.findAll(page);

  }


}
