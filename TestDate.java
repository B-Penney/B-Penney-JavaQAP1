public class TestDate {
    public static void main(String[] args) {
        // Create a Date object
        Date myDate = new Date(21, 9, 2024); 

        // Print the date using toString method
        System.out.println("Initial Date: " + myDate);

        // Modify the date using setters
        myDate.setDay(21);
        myDate.setMonth(9);
        myDate.setYear(2024);

        // Print the date
        System.out.println("Modified Date: " + myDate);
    }
}

