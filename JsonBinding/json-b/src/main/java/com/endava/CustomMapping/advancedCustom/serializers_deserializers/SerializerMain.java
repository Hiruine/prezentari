package com.endava.CustomMapping.advancedCustom.serializers_deserializers;

import javax.json.bind.Jsonb;
import javax.json.bind.JsonbBuilder;
import javax.json.bind.JsonbConfig;
import java.io.*;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class SerializerMain {
    public static void main(String[] args) {
        Animal animal = new Animal("dog", 3);

        JsonbConfig config = new JsonbConfig()
                .withFormatting(true)
                .withSerializers(new AnimalSerializer())
                .withDeserializers(new AnimalDeserializer());

        Jsonb jsonb = JsonbBuilder.create(config);

        Path path = Paths.get("C:\\internship\\prezentari" +
                "\\JsonBinding\\json-b\\src\\main\\resources\\testFile.json");

        try(BufferedWriter os = Files.newBufferedWriter(path)) {

            jsonb.toJson(animal, os);

        } catch (IOException ex) {
            System.out.println("haa");
        }

//        try (BufferedReader is = Files.newBufferedReader(path)) {
//            Animal deserializedAnimal = jsonb.fromJson(is, Animal.class);
//            System.out.println(deserializedAnimal.toString());
//
//        } catch (IOException ex) {
//            System.out.println("haa");
//        }



    }
}
