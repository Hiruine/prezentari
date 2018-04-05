package com.endava.jsonSchema;

import com.endava.data.Employee;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.module.jsonSchema.JsonSchema;
import com.fasterxml.jackson.module.jsonSchema.JsonSchemaGenerator;

public class SchemaMainClass {
    public static void main(String[] args) throws Exception{

        ObjectMapper mapper = new ObjectMapper();
        JsonSchemaGenerator schemaGen = new JsonSchemaGenerator(mapper);
        JsonSchema schema = schemaGen.generateSchema(Employee.class);

        System.out.println(mapper.writerWithDefaultPrettyPrinter()
                .writeValueAsString(schema));


    }
}
