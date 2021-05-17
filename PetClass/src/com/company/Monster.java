package com.company;

public class Monster {
    private String color = "blue";
    private String type = "scary";
    private int numEyes = 7;


    public MonsterClass(String color, String type){
        this.color = color;
        this.type = type;
    }

    public MonsterClass(String color, String type, int numEyes) {
        this.color = color;
        this.type = type;
        this.numEyes = numEyes;
    }

    public String getColor() {
        return color;
    }

    public String getType() {
        return type;
    }

    public int getNumEyes() {
        return numEyes;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setNumEyes(int numEyes) {
        this.numEyes = numEyes;
    }

    public boolean MonsterBoolean() {
        return true;
    }
    public String MonsterString() {
        return "This is a string";
    }
}
