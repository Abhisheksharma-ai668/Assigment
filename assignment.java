class StudentInfo {

    public void displayInfo() {
        System.out.println("Name: Aman Sharma");
        System.out.println("Age: 16");
        System.out.println("Grade: 10th");
    }

    public static void main(String[] args) {
        StudentInfo obj = new StudentInfo();
        obj.displayInfo();
    }
}

// Q2: Calculator
class Calculator {

    public void addNumbers() {
        int num1 = 10;
        int num2 = 20;
        int sum = num1 + num2;
        System.out.println("Sum: " + sum);
    }

    public static void main(String[] args) {
        Calculator obj = new Calculator();
        obj.addNumbers();
    }
}

// Q3: Greeting
class Greeting {

    public void sayHello(String name) {
        System.out.println("Hello, " + name + "! Welcome to Java programming.");
    }

    public static void main(String[] args) {
        Greeting obj = new Greeting();
        obj.sayHello("Abhishek"); // Change to your name
    }
}

// Q4: Circle
class Circle {

    public void calculateArea() {
        double radius = 7;
        double pi = 3.14;
        double area = pi * radius * radius;
        System.out.println("Area of Circle: " + area);
    }

    public static void main(String[] args) {
        Circle obj = new Circle();
        obj.calculateArea();
    }
}

// Q5: SimpleInterest
class SimpleInterest {

    public void calculateInterest() {
        double P = 1000;
        double T = 2;
        double R = 5;
        double SI = (P * T * R) / 100;
        System.out.println("Simple Interest: " + SI);
    }

    public static void main(String[] args) {
        SimpleInterest obj = new SimpleInterest();
        obj.calculateInterest();
    }
}