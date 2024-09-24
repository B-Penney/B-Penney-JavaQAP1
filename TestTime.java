public class TestTime {
    public static void main(String[] args) {
        // Create two Time objects
        Time t1 = new Time(21, 10, 15);
        Time t2 = new Time(10, 20, 25);

        // Display initial time 
        System.out.println("Initial t1: " + t1);
        System.out.println("Initial t2: " + t2);

        // Call nextSecond() for t1 and previousSecond() for t2
        t1.nextSecond();
        t2.previousSecond();

        // Display time after changes
        System.out.println("t1 after nextSecond(): " + t1);
        System.out.println("t2 after previousSecond(): " + t2);
    }
}

