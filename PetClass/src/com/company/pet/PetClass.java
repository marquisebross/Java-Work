package com.company.pet;

public class PetClass {



    private String name = "Lola";
    private int age = 1;
    private String location = "Walnut Creek";
    private String type = "Rabbit";

public PetClass(String name, int age, String location, String type){
    this.name = name;
    this.age = age;
    this.location = location;
    this.type = type;

}

public String getName() {
    return name;
}

public int getAge() {
    return age;
}

public String getType() {
    return type;
}

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
