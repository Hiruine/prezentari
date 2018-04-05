package com.endava.CustomMapping.advancedCustom.adapters;

import com.endava.data.Book;

import javax.json.Json;
import javax.json.JsonObject;
import javax.json.bind.Jsonb;
import javax.json.bind.JsonbBuilder;
import java.math.BigDecimal;

public class AdapterMain {
    public JsonObject adaptToJson(Booklet booklet) throws Exception {
        return Json.createObjectBuilder()
                .add("titleCanBeModified", booklet.getTitle())
                .add("authorName", booklet.getAuthorName())
                .add("priceCustom", booklet.getPrice())
                .build();
    }

    public static void main(String[] args) throws Exception {
        Booklet booklet = new Booklet("Animal Farm", "Orwel",
                                         BigDecimal.valueOf(1235.4));
        System.out.println(new AdapterMain().adaptToJson(booklet));
    }
}
