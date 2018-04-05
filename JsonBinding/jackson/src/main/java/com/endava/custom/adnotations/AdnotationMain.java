package com.endava.custom.adnotations;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.nio.file.Path;
import java.nio.file.Paths;

public class AdnotationMain {
    public static void main(String[] args) throws Exception{

        Person person = new Person();
        person.setPersonId(1234);
        person.setName("harambe");

        Path filePath = Paths.get("jackson/src/resources/testFile.json");

        ObjectMapper mapper = new ObjectMapper();
        mapper.writeValue(filePath.toFile(), person);

    }
}
