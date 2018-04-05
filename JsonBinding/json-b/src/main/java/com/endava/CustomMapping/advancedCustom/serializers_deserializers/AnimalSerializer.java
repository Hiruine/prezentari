package com.endava.CustomMapping.advancedCustom.serializers_deserializers;

import javax.json.bind.serializer.JsonbSerializer;
import javax.json.bind.serializer.SerializationContext;
import javax.json.stream.JsonGenerator;

public class AnimalSerializer implements JsonbSerializer<Animal> {
    @Override
    public void serialize(Animal animal, JsonGenerator jsonGenerator,
                          SerializationContext serializationContext) {
        if (animal != null) {
            serializationContext.serialize(animal, jsonGenerator);
        } else {
            serializationContext.serialize(null, jsonGenerator);
        }
    }
}
