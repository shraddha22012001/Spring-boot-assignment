package com.example.springboot.model;


import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name="employee")
public class Employee  implements Serializable {
    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    private  long id;
    @Column(name = "name")
    private String name;
    @Column(name = "email")
    private String email;
    @Column(name = "qcode")
    private String qcode;
    @Column(name = "phone")
    private String phone;

    public Employee(){

    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getQcode() {
        return qcode;
    }

    public void setQcode(String qcode) {
        this.qcode = qcode;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", qcode='" + qcode + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }
}
