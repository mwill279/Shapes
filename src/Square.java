/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author malac
 */
public class Square implements Shapes{
    
    double size = 0;
    
    public Square(){
        size = 10;
    }

    @Override
    public double getSize() {
        return size;
    }

    @Override
    public void setSize(double size) {
        this.size = size;
    }

   
     @Override
    public double getarea() {
        return size * size;
    }

    @Override
    public double getperimeter() {
        return size * 4;
    }
}
