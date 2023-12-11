package org.example;

public class Reptile extends Animal{
    private String skin;
    private String eggs;
    private String bone;

    public Reptile(int height, int weight, String animal_type, String blood_type, String eggs){
        super(height, weight, animal_type, blood_type);
        this.skin = "Dry";
        this.eggs = eggs;
        this.bone = "Backbone";
    }


    public String ShowInfo() {
        return "" +
                "skin='" + skin + '\'' +
                ", eggs='" + eggs + '\'' +
                ", bone='" + bone + '\'' +
                '}' + super.ShowInfo();
    }
}
