package com.endava.defaultMapping;

import com.endava.data.Employee;
import java.io.File;
import java.io.IOException;
import java.math.BigDecimal;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonToObject {
    public static void main(String[] args) {

        ObjectMapper mapper = new ObjectMapper();


        String jsonInString ="{\"id\":1232145124, \"firstName\":\"blah\"," +
                " \"lastName\":\"the second\"," +
                " \"position\":\"guru\" ,\"salary\":42}";


        try {
            //JSON from file to Object
            Employee employee = mapper.readValue(
                    Paths.get("C:\\internship\\prezentari\\JsonBinding\\jackson\\" +
                            "src\\resources\\testFile.json").toFile(),
                    Employee.class);
            System.out.println(employee.toString());

            //JSON from String to Object
            System.out.println(mapper.readValue(jsonInString, Employee.class).toString());


        } catch (IOException e) {
            System.out.println();
        }
    }
}
