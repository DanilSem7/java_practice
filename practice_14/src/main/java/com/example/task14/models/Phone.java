package com.example.task14.models;

public class Phone {
    private int id;
    private String name;
    private String creationYear;

    public Phone(String name, String creationYear) {
        this.name = name;
        this.creationYear = creationYear;
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

    public String getCreationYear() {
        return creationYear;
    }

    public void setCreationYear(String creationYear) {
        this.creationYear = creationYear;
    }


    @Override
    public String toString() {
        return "Phone{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", creationYear='" + creationYear + '\'' +
                '}';
    }
}
