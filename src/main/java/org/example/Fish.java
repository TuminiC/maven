package org.example;

public class Fish extends Animal{
    private boolean hasGills;
    private boolean livesInWater;

    public Fish(int height, int weight, String animal_type, String blood_type) {
        super(height, weight, animal_type, blood_type);
        this.hasGills = true;
        this.livesInWater = true;
    }

    @Override
    public String ShowInfo() {
        return "Fish{" +
                "hasGills=" + hasGills +
                ", livesInWater=" + livesInWater +
                '}' +super.ShowInfo();
    }
}
