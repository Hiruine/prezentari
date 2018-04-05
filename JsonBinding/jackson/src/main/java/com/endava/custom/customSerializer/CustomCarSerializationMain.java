package com.endava.custom.customSerializer;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.Version;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.module.SimpleModule;

public class CustomCarSerializationMain {
    public static void main(String[] args) {

        try {
            // register serializers and deserializes via Module interface.
            // This is the recommended way to add custom serializers

            ObjectMapper mapper = new ObjectMapper();
            SimpleModule module =
                    new SimpleModule("CustomCarSerializer", new Version(1, 0, 0, null, null, null));
            module.addSerializer(Car.class, new CustomCarSerializer());
            mapper.registerModule(module);
            Car car = new Car("yellow", "renault");
            System.out.println(mapper.writeValueAsString(car));

        } catch (JsonProcessingException e) {
            System.out.println();
        }
    }
}
