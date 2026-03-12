package com.klef.fsad.exam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/transport")
public class TransportController {

 @Autowired
 TransportService service;

 @PostMapping("/add")
 public Transport add(@RequestBody Transport t){
  return service.addTransport(t);
 }

 @DeleteMapping("/delete/{id}")
 public String delete(@PathVariable int id){
  service.deleteTransport(id);
  return "Transport Deleted";
 }
}