package com.lab3.ex1.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

@Entity
@Table(name= "person")
public class User {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @NotBlank(message = "Name is mandatory")
    private String name;
    
    @NotBlank(message = "Email is mandatory")
    private String email;

    @NotBlank(message = "Phone is mandatory")
    private String phone;

    public User() {}

    public User(String name, String email, String phone) {
        this.name = name;
        this.email = email;
        this.phone= phone;
    }

    public void setId(long id) {
        this.id = id;
    }
    
    public long getId() {
        return id;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhone(String phone){
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone(){
        return phone;
    }

    @Override
    public String toString() {
        return "User{" + "id=" + id + ", name=" + name + ", email=" + email + ", phone=" + phone +'}';
    }
}
