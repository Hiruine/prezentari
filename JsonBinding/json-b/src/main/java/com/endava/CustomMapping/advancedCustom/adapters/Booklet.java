package com.endava.CustomMapping.advancedCustom.adapters;

import java.math.BigDecimal;

public class Booklet {
    private String title;
    private String authorName;
    private BigDecimal price;

    public Booklet(String title, String author, BigDecimal price) {
        this.title = title;
        this.authorName = author;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthorName() {
        return authorName;
    }

    public BigDecimal getPrice() {
        return price;
    }
}
