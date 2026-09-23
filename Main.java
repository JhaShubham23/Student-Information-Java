import java.util.Scanner;
class StudentInformation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter Student Information");
        System.out.print("Enter Name: ");
        String name = sc.nextLine();
        System.out.print("Enter Age: ");
        int age = sc.nextInt();
        System.out.print("Enter Roll Number: ");
        int rollNumber = sc.nextInt();
        System.out.print("Enter Percentage for Subject 1: ");
        double p1 = sc.nextDouble();
        System.out.print("Enter Percentage for Subject 2: ");
        double p2 = sc.nextDouble();
        System.out.print("Enter Percentage for Subject 3: ");
        double p3 = sc.nextDouble();
        double total = p1 + p2 + p3;
        double average = total / 3;
        System.out.println("\n----- Student Information -----");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Percentage Marks: " + p1 + "%, " + p2 + "%, " + p3 + "%");
        System.out.println("\n----- Calculated Results -----");
        System.out.println("Total: " + total);
        System.out.println("Average: " + average + "%");

        sc.close();
    }
}
