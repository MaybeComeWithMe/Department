package com.example.demo.model;

public class DepartmentsInfo {
    private int id;
    private String name;

    public DepartmentsInfo() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public DepartmentsInfo(int id, String name) {
        this.id = id;
        this.name = name;
    }
}
