package com.endava.jacksonView;

import com.fasterxml.jackson.annotation.JsonView;

class Staff {
    @JsonView(Views.Normal.class)
    private String name;

    @JsonView(Views.Normal.class)
    private int age;

    @JsonView(Views.Normal.class)
    private String position;

    @JsonView(Views.Manager.class)
    private double salary;

    public Staff() {
    }

    public Staff(String name, int age, String position, double salary) {
        this.name = name;
        this.age = age;
        this.position = position;
        this.salary = salary;
    }

}
