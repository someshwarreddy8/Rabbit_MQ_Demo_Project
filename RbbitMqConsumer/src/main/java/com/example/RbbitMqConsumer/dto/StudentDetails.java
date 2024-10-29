package com.example.RbbitMqConsumer.dto;

import org.springframework.stereotype.Component;

@Component
public class StudentDetails {
    private String name;
    private int rollNo;
    private String area;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    @Override
    public String toString() {
        return "StudentDetails{" +
                "name='" + name + '\'' +
                ", rollNo=" + rollNo +
                ", area='" + area + '\'' +
                '}';
    }
}
