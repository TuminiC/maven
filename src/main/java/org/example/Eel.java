package org.example;

public class Eel extends Fish{
    private boolean electric_release;
    public Eel(int height, int weight, String animal_type, String blood_type, boolean electric_release) {
        super(height, weight, animal_type, blood_type);
        this.electric_release=electric_release;
    }

    @Override
    public String ShowInfo() {
        return "Eel{" +
                "electric_release=" + electric_release +
                '}' + super.ShowInfo();
    }
}
