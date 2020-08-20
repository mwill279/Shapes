/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author malac
 */
public class tester {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Square A = new Square();
        Circle B = new Circle();
        B.setSize(10);
        Shapes C;
        
        
        /*
        System.out.println("Perimeter: " +A.getperimeter());
        System.out.println("Area: " + A.getarea());
        
        
        
        
        System.out.println("Perimeter: " +B.getperimeter());
        System.out.println("Area: " + B.getarea());
        */
        
        //C[0] = new Circle();
        //C[1] = new Square();
        Displayshapes display = new Displayshapes();
        
        display.Display(A);
        display.Display(B);
    }
    
}
