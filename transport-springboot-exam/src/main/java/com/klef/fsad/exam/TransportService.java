package com.klef.fsad.exam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TransportService {

 @Autowired
 TransportRepository repo;

 public Transport addTransport(Transport t){
  return repo.save(t);
 }

 public void deleteTransport(int id){
  repo.deleteById(id);
 }
}