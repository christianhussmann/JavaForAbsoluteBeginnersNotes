package oop.stateAndBehaviour;

public class ChairExample {
    String colour = "red";
    int length;
    int width;
    int height;
    double weight;
    String modelNumber;
    String material;
    boolean hasArmRests;
    int minimumHeightLevel;
    int maximumHeightLevel;
    double currentHeightLevel;
    String position;


    void raise(){
        height++;
    }

    void lower(){
        height--;
    }

    void swivelLeft(){
        //rotate left
    }

    void swivelRight(){
        //rotate right
    }
}
