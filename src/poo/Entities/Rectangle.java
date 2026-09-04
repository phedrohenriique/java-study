package poo.Entities;

import java.lang.Math;

public class Rectangle {

    private Double length;
    private Double height;

    public Rectangle(Double length, Double height) {
        this.length = length;
        this.height = height;
    }

    public Double getLenght() {
        return this.length;
    }

    public void setLength(Double length) {
        this.length = length;
    }

    public Double getHeight() {
        return this.height;
    }

    public void setHeight(Double height) {
        this.height = height;
    }

    public double getArea() {
        return length*height;
    }

    public double getPerimeter() {
        return (2 * this.length) + (2 * this.height);
    }

    public double getDiagonal() {
        double l = Math.pow(this.length, 2);
        double h = Math.pow(this.height, 2);
        return Math.sqrt(l + h);
    }

    @Override
    public String toString(){
       return "Area = "+getArea()+"\n Perímetro = "+getPerimeter()+"\n Diagonal = "+getDiagonal();
    }

}
