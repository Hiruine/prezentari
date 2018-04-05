package com.endava.CustomMapping.runtimeConfig;

import com.endava.data.Book;

import javax.json.bind.Jsonb;
import javax.json.bind.JsonbBuilder;
import javax.json.bind.JsonbConfig;
import javax.json.bind.config.PropertyOrderStrategy;

public class RuntimeConfiguration {
    public static void main(String[] args) {
        JsonbConfig jsonbConfig = new JsonbConfig()
                .withPropertyOrderStrategy(PropertyOrderStrategy.REVERSE)
                .withNullValues(true);

        Jsonb jsonb = JsonbBuilder.create(jsonbConfig);

        Book book = new Book("ABCD-1234", "Dune", "Frank Herbert");
        System.out.println(jsonb.toJson(book));

    }
}
