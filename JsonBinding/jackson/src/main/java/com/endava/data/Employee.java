package com.endava.data;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public final class Employee {
    private final long id;
    private final String firstName;
    private final String lastName;
    private final String position;
    private final double salary;

    private Employee( long id,
                      String firstName,
                      String lastName,
                      String position,
                      double salary) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.position = position;
        this.salary = salary;
    }

    @JsonCreator
    public static Employee createEmployee(@JsonProperty("id") long id,
                                          @JsonProperty("firstName") String firstName,
                                          @JsonProperty("lastName") String lastName,
                                          @JsonProperty("position") String position,
                                          @JsonProperty("salary") double salary) {
        return new Employee(id, firstName, lastName, position, salary);
    }

    public long getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPosition() {
        return position;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", position='" + position + '\'' +
                ", salary=" + salary +
                '}';
    }
}
