package oop.EncapsulationAndConstructor;

public class Rectangle {
    int height;
    int width;

    public Rectangle(int height, int width) {
        setHeight(height);
        setWidth(width);
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }

    void setHeight(int h){
        if(h > 0){
            height = h;
        }
    }

    void setWidth(int w){
        if(w > 0) {
            width = w;
        }
    }


    void printArea(){
        System.out.println(height * width);
    }
}
