package com.endava.defaultMapping;

import com.endava.data.Employee;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class JsonToObject {
    public static void main(String[] args) {

        ObjectMapper mapper = new ObjectMapper();


        String jsonInString ="{\"id\":21435124, \"firstName\":\"hello\"," +
                " \"lastName\":\"world\"," +
                " \"position\":\"developer\" ,\"salary\":42}";

        System.out.println(jsonInString);

        try {
            //JSON from file to Object
            Employee employee = mapper.readValue(
                    new File("/home/hiruine/programing/endava_internship2018/" +
                            "json_binding/prezentari/JsonBinding/jackson/src/resources/testFile.json"),
                    Employee.class);
            System.out.println(employee.toString());


            //JSON from String to Object
            System.out.println(mapper.readValue(jsonInString, Employee.class).toString());


        } catch (IOException e) {
            System.out.println();
        }
    }
}
