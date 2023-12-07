package org.example;

public class Birds extends Animal{
    private boolean feathers;
    private boolean canFly;
    public Birds(int height, int weight, String animal_type, String blood_type, boolean feathers) {
        super(height, weight, animal_type, blood_type);
        this.feathers=feathers;
        this.canFly =(this.feathers) ? true: false;
    }

    @Override
    public String ShowInfo() {
        return "Birds{" +
                "feathers=" + feathers +
                ", canFly=" + canFly +
                '}'+ super.ShowInfo();
    }
}
