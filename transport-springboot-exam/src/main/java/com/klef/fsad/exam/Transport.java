package com.klef.fsad.exam;

import jakarta.persistence.*;
import java.util.Date;

@Entity
public class Transport {

 @Id
 private int tid;

 private String name;

 @Temporal(TemporalType.DATE)
 private Date date;

 private String status;

 public int getTid(){ return tid; }
 public void setTid(int tid){ this.tid = tid; }

 public String getName(){ return name; }
 public void setName(String name){ this.name = name; }

 public Date getDate(){ return date; }
 public void setDate(Date date){ this.date = date; }

 public String getStatus(){ return status; }
 public void setStatus(String status){ this.status = status; }
}