package com.han.controller;

import com.han.repo.*;
import com.han.model.*;

import java.util.*;

import org.springframework.http.*;
 
import org.springframework.web.bind.annotation.*;

 
@RestController
public class ApplicationController {
 
    private final ApplicationRepository repo;
     
    public ApplicationController(ApplicationRepository repo) {
        this.repo = repo;
    }
    
    // RESTful API methods for Retrieval operations
    @GetMapping("/applications")
    public List<Application> list() {
        return (List<Application>) repo.findAll();
    }
    
    @GetMapping("/applications/{id}")
    public ResponseEntity<Optional<Application>> get(@PathVariable Integer id) {
        try {
        	Optional<Application> application = repo.findById(id);
            return new ResponseEntity<Optional<Application>>(application, HttpStatus.OK);
        } catch (NoSuchElementException e) {
            return new ResponseEntity<Optional<Application>>(HttpStatus.NOT_FOUND);
        }      
    }
     
    // RESTful API method for Create operation
    @PostMapping("/applications")
    void add(@RequestBody Application application) {
    	repo.save(application);
    }
     
    // RESTful API method for Update operation
    //@PutMapping("/applications/{id}")
    @RequestMapping(value = "/applications/{id}", 
    		  produces = "application/json", 
    		  method=RequestMethod.PUT)
    public ResponseEntity<?> update(@RequestBody Application application, @PathVariable Integer id) {
        try {
        	Optional<Application> exists = repo.findById(id);
        	if (exists!= null)
        		repo.save(application);
            return new ResponseEntity<>(HttpStatus.OK);
        } catch (NoSuchElementException e) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }      
    }
     
    // RESTful API method for Delete operation
    
    @DeleteMapping("/applications/{id}")
    public void delete(@PathVariable Integer id) {
        repo.deleteById(id);
    }
}