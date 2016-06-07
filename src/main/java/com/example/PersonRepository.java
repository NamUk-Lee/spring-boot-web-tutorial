package com.example;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by existmaster on 2016. 6. 7..
 */
public interface PersonRepository extends CrudRepository<Person, Long>{

    List<Person> findByName(String name);

}
