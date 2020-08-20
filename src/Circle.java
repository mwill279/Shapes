/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author malac
 */
public class Circle implements Shapes{
    
    double radius = 0.0;

    @Override
    public double getarea() {
        return 2 * Math.PI * Math.pow(radius, 2);
    }

    @Override
    public double getperimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public double getSize() {
        return radius;
    }

    @Override
    public void setSize(double size) {
        this.radius = size;
    }
    
}
