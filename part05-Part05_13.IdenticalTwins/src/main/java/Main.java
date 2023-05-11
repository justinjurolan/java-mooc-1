
public class Main {

    public static void main(String[] args) {
        // you can write code here to try out your program
    SimpleDate date = new SimpleDate(24, 3, 2017);
    SimpleDate date2 = new SimpleDate(23, 7, 2017);

    Person leo = new Person("Leo", date, 62, 9);
    Person lily = new Person("Lily", date2, 65, 8);

    if (leo.equals(lily)) {
        System.out.println("Same");
    } else {
        System.out.println("Not the same");
    }

    Person leoWithDifferentWeight = new Person("Leo", date, 62, 10);
    Person lilySecond = new Person("Lily", date2,65,8);

    if (leo.equals(leoWithDifferentWeight)) {
        System.out.println("Same");
    } else {
        System.out.println("not the same");
    }
    
    if (lilySecond.equals(lily)) {
        System.out.println("Same");
    } else {
        System.out.println("Not the same");
    }
        
    }
}
