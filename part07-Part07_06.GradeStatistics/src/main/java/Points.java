/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author justin
 */
import java.util.ArrayList;
public class Points {
    private ArrayList<Integer> points;
    
    public Points () {
        this.points = new ArrayList<>();
    }
    
    public ArrayList<Integer> getPoints () {
        return this.points;
    }
    
    public double getAverage() {
        int sum = 0;
        for (int point : this.points) {
            sum += point;
        }
        return sum / this.points.size();
    }
    
    public void addPoints(int point) {
        this.points.add(point);
    }
    
    public String getPassingGrade() {
        double sum = 0;
        int counter = 0;
        String output = "";
        for (int point : this.points) {
            if (point >= 50 && point <= 100) {
                sum += point;
                counter++;
            }
        }
        if (counter <= 0) {
            return output += "-";
        }
        double ave = sum / counter;
        return output += ave;
    }
    
    public double passPercentage() {
        double participants = 0;
        double pass = 0;
        for (int point : this.points) {
            if (point > 0 && point <= 100) {
                participants++;
            }
            if (point >= 50 && point <= 100) {
                pass++;
            }
        }
        return (pass / participants) * 100;
    }
    
    public int pointsToGrade (int points) {
        int grade = 0;
        if (points < 50) {
            grade = 0;
        } else if (points < 60) {
            grade = 1;
        } else if (points < 70) {
            grade = 2;
        } else if (points < 80) {
            grade = 3;
        } else if (points < 90) {
            grade = 4;
        } else {
            grade = 5;
        }
        return grade;
    }
    
    public String printGradeDistribution () {
        String output = "\n";
        String five = "5: ";
        String four = "4: ";
        String three = "3: ";
        String two = "2: ";
        String one = "1: ";
        String zero = "0: ";
        
        for (int point : this.points) {
            int stars = this.pointsToGrade(point);
            switch (stars) {
                case 0:
                    zero += "*";
                    break;
                case 1:
                    one += "*";
                    break;
                case 2:
                    two += "*";
                    break;
                case 3:
                    three += "*";
                    break;
                case 4:
                    four += "*";
                    break;
                case 5:
                    five += "*";
                    break;
                default:
                    break;
            }
        }
        
        return output + five + "\n" + four + "\n" + three + "\n" + two + "\n" + one + "\n" + zero;
    }
    
}
