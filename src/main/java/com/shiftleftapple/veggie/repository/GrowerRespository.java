package com.shiftleftapple.veggie.repository;

import com.shiftleftapple.veggie.entity.Grower;
import org.springframework.data.repository.CrudRepository;

public interface GrowerRespository extends CrudRepository<Grower, String> {
  
}
