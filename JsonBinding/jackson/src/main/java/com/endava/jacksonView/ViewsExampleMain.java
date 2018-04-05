package com.endava.jacksonView;

import com.fasterxml.jackson.databind.ObjectMapper;

//@JsonView lets you control what fields to display.

public class ViewsExampleMain {
    public static void main(String[] args) {
        Staff staff = new Staff("red", 40, "leader", 12352035);

        ObjectMapper mapper = new ObjectMapper();

        try {
            System.out.println("Normal View");
            System.out.println(mapper.writerWithView(Views.Normal.class).writeValueAsString(staff));

            System.out.println("\nManager View");
            System.out.println(mapper.writerWithView(Views.Manager.class).writeValueAsString(staff));

        } catch (Exception e) {
            System.out.println("do something");
        }

    }
}
