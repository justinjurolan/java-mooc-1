/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author justin
 */
import java.util.Scanner;
public class UserInterface {
    
    private Scanner scan;
    private Points points;
    
    
    public UserInterface (Scanner scan, Points points) {
        this.scan = scan;
        this.points = points;
    }
    
    public void start() {
        System.out.println("Enter point totals, -1 stops:");
        while (true) {
            int numberValue = Integer.valueOf(this.scan.nextLine());
            if (numberValue == -1) {
                break;
            }
            if (numberValue > 0 && numberValue <= 100) {
                this.points.addPoints(numberValue);
            }
        }
        System.out.println("Point average (all): " + this.points.getAverage());
        System.out.println("Point average (passing): " + this.points.getPassingGrade());
        System.out.println("Pass percentage: " + this.points.passPercentage());
        System.out.println("Grade distribution: " + this.points.printGradeDistribution());
        
    }
    
}
