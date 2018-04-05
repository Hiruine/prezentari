package com.endava.defaultMapping;


import com.endava.data.Employee;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ObjectToJson {
    public static void main(String[] args) {

        Employee employee = new Employee(21435124, "hello", "world",
                "developer", 42);
        Path filePath = Paths.get("jackson/src/resources/testFile.json");
        ObjectToJson.serialize(employee, filePath);


    }

        static void serialize(Employee employee, Path filePath) {
            try {
                ObjectMapper mapper = new ObjectMapper();

                //Object to JSON in file
                mapper.writeValue(filePath.toFile(), employee);

                // Convert object to JSON string
                System.out.println('\n' + mapper.writeValueAsString(employee) + '\n');

                // Convert object to JSON string and pretty print
                System.out.println(mapper.writerWithDefaultPrettyPrinter().writeValueAsString(employee));

            } catch (IOException e) {
                e.printStackTrace();
            }
        }

}
