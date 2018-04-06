package com.endava.custom.customSerializer;

import com.endava.data.Employee;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;

import java.io.IOException;

public class CustomCarSerializer extends StdSerializer<Car> {

    CustomCarSerializer() {
        this(null);
    }

    CustomCarSerializer(Class<Car> t) {
        super(t);
    }


    @Override
    public void serialize(Car car, JsonGenerator jsonGenerator,
                          SerializerProvider serializerProvider)
            throws IOException {
        //instructions for how to render JSON
        jsonGenerator.writeStartObject();
        jsonGenerator.writeStringField("car_brand", car.getType());
        jsonGenerator.writeStringField("car_color", car.getColor());
        jsonGenerator.writeEndObject();


    }
}
