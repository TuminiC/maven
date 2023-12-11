package org.example;

public class Crocodile extends Reptile {

    public Crocodile(int height, int weight, String animal_type, String blood_type, String eggs) {
        super(height, weight, animal_type, blood_type, eggs);
    }

    @Override
    public String ShowInfo() {
        return "{" +
                super.ShowInfo() +
                "}";
    }
}
