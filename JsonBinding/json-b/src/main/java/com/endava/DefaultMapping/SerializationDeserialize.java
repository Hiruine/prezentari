package com.endava.DefaultMapping;

import com.endava.data.Book;

import javax.json.bind.Jsonb;
import javax.json.bind.JsonbBuilder;

class SerializationDeserialize {
    public static void main(String[] args) {
        Book book = new Book("ABCD-1234", "Dune", "Frank Herbert");
        Jsonb jsonb = JsonbBuilder.create();
        String json = jsonb.toJson(book);
        System.out.println(json);

        System.out.println(jsonb.fromJson(json, Book.class));

    }
}
