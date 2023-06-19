package org.example;

public class Criteria {

    private String name;
    private String value;

    public Criteria(String criteriaNumber, String value) throws Exception {
        this.value = value;
        if (criteriaNumber.equals("1")) {
            this.name = "colour";
        } else if (criteriaNumber.equals("2")) {
            this.name = "brand";
        } else {
            throw new Exception("Enter 1 or 2");
        }
    }

    public String getName() {
        return name;
    }

    public String getValue() {
        return value;
    }
}

