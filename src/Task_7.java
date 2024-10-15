public class Task_7 {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++){ //Outer loop i for rows
            for (int j = 1; j <= 5; j++){ //Inner loop j for columns
                System.out.print("* "); //Print asterisks in each row
            }
            System.out.println(); //Move to new line after each row
        }
    }
}

