package com.endava.custom.adnotations;

import com.fasterxml.jackson.annotation.JsonSetter;

public class Person {
    private long   personId;
    private String name ;



    public long getPersonId() { return this.personId; }

    public String getName() {
        return name;
    }

    @JsonSetter("idCustomized")
    public void setPersonId(long personId) { this.personId = personId; }

    @JsonSetter("soMuchWow")
    public void setName(String name) {
        this.name = name;
    }
}
