package org.example;

public class Animal {
    private int Height;
    private int Weight;
    private String animal_type;
    private String blood_type;

    public Animal(int height, int weight, String animal_type, String blood_type) {
        Height = height;
        Weight = weight;
        this.animal_type = animal_type;
        this.blood_type = blood_type;
    }


    public String ShowInfo() {
        return "Animal{" +
                "Height=" + Height +
                ", Weight=" + Weight +
                ", animal_type='" + animal_type + '\'' +
                ", blood_type='" + blood_type + '\'' +
                '}';
    }
}
