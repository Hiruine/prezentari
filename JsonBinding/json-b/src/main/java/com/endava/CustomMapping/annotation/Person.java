package com.endava.CustomMapping.annotation;

import javax.json.bind.annotation.JsonbTransient;

class Person {

        private String name;

        //ignore this property
        @JsonbTransient
        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

}
