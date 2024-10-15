public class Task_6 {
    public static void main(String[] args) {
        for (int i = 5; i >= 1; i--){ //Outer loop i for rows
            for (int j= 1; j <=i; j++){ //Inner loop j for columns
                System.out.print("* "); //Print asterisks in each row
            }
            System.out.println(); // Move to new line after each row
        }
    }
}
