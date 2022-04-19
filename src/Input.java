import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter full name");
        String name = scanner.nextLine();
        System.out.println("enter age");
        int age = scanner.nextInt();
        System.out.println("your name is " + name + " and your age is " + age);
    }
}
class Sum{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter 1st num");
        int n = scanner.nextInt();
        System.out.println("enter 2 num");
        int p= scanner.nextInt();
        System.out.println("enter 3 num");
        int k=scanner.nextInt();
        int sum=n+p+k;
        System.out.println( sum);
    }
}
class sun_product {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter two integers");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int sum = a+b;
        int product = a*b;

        double div = (double) ((double)sum/product);
        System.out.println("division os sum and product is"+div);



    }
}

class student_detail {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter full name");
        String name = scanner.nextLine();
        System.out.println("enter age");
        int age = scanner.nextInt();
        System.out.println("your name is "+name+" and your age is "+age);


    }
}

class string {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter first string");
        String first = scanner.nextLine();
        System.out.println("enter second string");
        String second = scanner.nextLine();
        System.out.print(first+second);
    }
}

class square {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter a number");
        int number = scanner.nextInt();
        int square =  number*number;
        System.out.println("square of number is "+square);

    }
}

class format {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter your name");
        String name = scanner.nextLine();
        System.out.println("enter your roll number");
        String roll = scanner.nextLine();
        System.out.println("enter field of interest");
        String interest = scanner.nextLine();
        System.out.println("hey,my name is "+name+" my roll number is "+interest+" my field of interest is "+interest);

    }
}
class Format{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter your name");
        String name = scanner.nextLine();
        System.out.println("enter your roll number");
        String roll = scanner.nextLine();
        System.out.println("enter field of interest");
        String interest = scanner.nextLine();
        System.out.println("hey,my name is "+name+" my roll number is "+interest+" my field of interest is "+interest);

    }
}

class conditions {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter first value");
        int a = scanner.nextInt();
        System.out.println("enter second value");
        int b = scanner.nextInt();
        System.out.println((a<50)&&(a<b));
    }
}

class Area_peri {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter length of square");
        int length = scanner.nextInt();
        int area = length*length;
        int perimeter = 4*length;
        System.out.println("area of square is "+area+" and its perimeter is "+perimeter);


    }
}
class Area {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double length = scanner.nextDouble();
        double breadth = scanner.nextDouble();
        int area = (int) ((int) length*breadth);
        System.out.println("area of rectangle is "+area);



    }
}
class Ternaryy {
    public static void main(String[] args) {
        System.out.println("Marks And Percentage of Students");

        int Science = 50;
        int Math = 40;
        int Social = 45;
        int Account = 49;
        float TotalMarks = Science + Math + Social + Account;
        System.out.println("The total marks obtained by this student is " + TotalMarks);
        float Percentage = TotalMarks / 4;
        System.out.println("The total percentage of this Student is " + Percentage);
        String Grade;
        Grade = (Percentage >= 70) ? "First Class" :
                ((Percentage >= 59 && Percentage < 70) ? "Upper Second Class" :
                        ((Percentage >= 49 && Percentage < 59) ? "Second Class" :
                                ((Percentage >= 39 && Percentage < 49) ? "Third Class" :
                                        "Failed")));
        System.out.println("Your Grade is: " + Grade);

    }
}
class Simple {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("enter  principal");
        double principal = scanner.nextDouble();
        System.out.println("enter time");
        double time = scanner.nextDouble();
        System.out.println("enter rate");
        double rate = scanner.nextDouble();
        double interest = (principal * time * rate) / 100;
        System.out.println(interest);

    }
}

