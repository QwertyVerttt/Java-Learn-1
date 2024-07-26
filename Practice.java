import java.util.Scanner;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Practice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String user;
        LocalDateTime dateTime = LocalDateTime.now();
        DateTimeFormatter date = DateTimeFormatter.ofPattern("dd/MM/yy HH:mm:ss");

        System.out.println("Do you want to use a Math method sir? (yes/no): ");
        user = scanner.nextLine();
        
        while (user.isBlank()) {
            System.out.println("Please enter yes/no : ");
            user = scanner.nextLine();
        }
        
        if (user.equalsIgnoreCase("no")) {
            System.out.println("So what then sir?");
            user = scanner.nextLine();
            if (user.equalsIgnoreCase("What time is it?") || user.equalsIgnoreCase("time") || user.equalsIgnoreCase("Time")) {
                String ask = " ";
                System.out.println("Please enter your name first " + ask);
                ask = scanner.nextLine();
                if (ask.equalsIgnoreCase("Agung") || ask.equalsIgnoreCase("agung") || ask.equalsIgnoreCase("qwerty")
                || ask.equalsIgnoreCase("Qwerty")) {
                    String formattedDate = dateTime.format(date);
                    System.out.println("This is the time sir " + formattedDate);
                    System.exit(0);
                } else {
                    System.out.println("u are not my boss!");
                    System.exit(0);
                }
            } else {
                System.out.println("Maybe u put a wrong command sir");
                System.exit(0);
            }
        } else if (user.equalsIgnoreCase("yes")) {
            System.out.println("");
         } else if (user.equalsIgnoreCase("Agung") || user.equalsIgnoreCase("agung")) {
                System.out.println("hello boss! " + user);
         } else {
            System.out.println("Please enter Yes or No sir");
            System.exit(0);
        }
        
        System.out.println("which what type do you want to calculate sir? ");
        String choice = scanner.nextLine();
        
        switch (choice) {
            case "Minus", "M", "m", "Minus root square", "minus root square" , "minus" , "root square" , "Root square":
            calculateMinusRootSquare(scanner);
            break;
            case "circle", "c" , "C":
                calculateCircleArea(scanner);
                break;
            case "triangle" , "t" , "T":
                calculateTriangleArea(scanner);
                break;
            case "square" , "s", "S" :
                calculateSquareArea(scanner);
                break;
            case "rectangle", "r", "R":
                calculateRectangleArea(scanner);
                break;
            case "parallelogram", "p", "P":
                calculateParallelogramArea(scanner);
                break;
            default:
                System.out.println("Invalid choice. Please enter 'circle', 'triangle', 'square', 'rectangle', or 'parallelogram' 'minus root square'.");
                System.exit(0);
        }
        
        scanner.close();
    }

    private static void calculateMinusRootSquare(Scanner scanner) {
        System.out.println("Type your name: ");
        String name = scanner.nextLine();

        if (name.equals("Agung") || name.equals("agung") || name.equals("qwerty") || name.equals("Qwerty")){
            System.out.println("hello boss! "+ name);          
        } else {
            System.out.println("You are not allowed to use this program.");
            System.exit(0);
        }
        

        System.out.println("Input The 'a' Value : ");
        int a = scanner.nextInt();
        System.out.println("Input the 'b' Value : ");
        int b = scanner.nextInt();
        
        int result = (a + b) * (a - b);
        System.out.println("the 'a' value i " + a + " and the 'b' value is " + b );
        System.out.println("Hv a nice day Mr. " + name);
        System.out.println("The result is " + result);
    }
    private static void calculateCircleArea(Scanner scanner) {
        System.out.println("Type your name: ");
        String name = scanner.nextLine();

        if (name.equals("Agung") || name.equals("agung") || name.equals("qwerty") || name.equals("Qwerty")){
            System.out.println("hello boss! "+ name);            
        } else {
            System.out.println("You are not allowed to use this program.");
            System.exit(0);
        }
        
        System.out.println("Input the radius value: ");
        double radius = scanner.nextDouble();
        
        double area = Math.PI * radius * radius;
        
        System.out.println("Hv a nice day Mr. " + name);
        System.out.println("The radius value is " + radius);
        System.out.println("The area of the circle is = " + area);
    }
    
    private static void calculateTriangleArea(Scanner scanner) {
        System.out.println("Type your name: ");
        String name = scanner.nextLine();
        if (name.equals("Agung") || name.equals("agung") || name.equals("qwerty") || name.equals("Qwerty")){
            System.out.println("hello boss! "+ name);            
        } else {
            System.out.println("You are not allowed to use this program.");
            System.exit(0);
        }
        
        System.out.println("Input the base value: ");
        double base = scanner.nextDouble();
        
        System.out.println("Input the height value: ");
        double height = scanner.nextDouble();
        
        double area = 0.5 * base * height;
        
        System.out.println("Hv a nice day Mr. " + name);
        System.out.println("The base value is " + base + " and the height value is " + height);
        System.out.println("The area of the triangle is = " + area);
    }
    
    private static void calculateSquareArea(Scanner scanner) {
        System.out.println("Type your name: ");
        String name = scanner.nextLine();
        if (name.equals("Agung") || name.equals("agung") || name.equals("qwerty") || name.equals("Qwerty")){
            System.out.println("hello boss! "+ name);            
        } else {
            System.out.println("You are not allowed to use this program.");
            System.exit(0);
        }
        
        System.out.println("Input the side length: ");
        double side = scanner.nextDouble();
        
        double area = side * side;
        
        System.out.println("Hv a nice day Mr. " + name);
        System.out.println("The side length is " + side);
        System.out.println("The area of the square is = " + area);
    }
    
    private static void calculateRectangleArea(Scanner scanner) {
        System.out.println("Type your name: ");
        String name = scanner.nextLine();
        if (name.equals("Agung") || name.equals("agung") || name.equals("qwerty") || name.equals("Qwerty")){
            System.out.println("hello boss! "+ name);            
        } else {
            System.out.println("You are not allowed to use this program.");
            System.exit(0);
        }
        
        System.out.println("Input the length value: ");
        double length = scanner.nextDouble();
        
        System.out.println("Input the width value: ");
        double width = scanner.nextDouble();
        
        double area = length * width;
              
        System.out.println("Hv a nice day Mr.  " + name);
        System.out.println("The length value is " + length + " and the width value is " + width);
        System.out.println("The area of the rectangle is = " + area);
    }
    
    private static void calculateParallelogramArea(Scanner scanner) {
        System.out.println("Type your name: ");
        String name = scanner.nextLine();
        if (name.equals("Agung") || name.equals("agung") || name.equals("qwerty") || name.equals("Qwerty")){
            System.out.println("hello boss! "+ name);            
        } else {
            System.out.println("You are not allowed to use this program.");
            System.exit(0);
        }
        
        System.out.println("Input the base value: ");
        double base = scanner.nextDouble();
        
        System.out.println("Input the height value: ");
        double height = scanner.nextDouble();
        
        double area = base * height;
        
        System.out.println("Have a nice day Mr. " + name);
        System.out.println("The base value is " + base + " and the height value is " + height);
        System.out.println("The area of the parallelogram is = " + area);
    }
}
