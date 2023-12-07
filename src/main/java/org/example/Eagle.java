package org.example;

public class Eagle extends Birds{
    public Eagle(int height, int weight, String animal_type, String blood_type, boolean feathers) {
        super(height, weight, animal_type, blood_type, feathers);
    }

    @Override
    public String ShowInfo() {
        return "Eagle{"+ super.ShowInfo() +"}";
    }
}
