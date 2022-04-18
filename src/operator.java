import java.util.Scanner;

public class operator {
    public static void main(String[] args) {
        int age=19;

        String result;

        result= (age>=18)? "can vote": "can't vote";
        System.out.println(result);

    }
}
class Si{
    public static void main(String[] args) {
        int p=50;
        int t=2;
        int r=3;
        System.out.println((p*t*r)/100);
    }
}
class Ara{
    public static void main(String[] args) {
        int b=5;
        int h=4;
        System.out.println(0.5*b*h);

    }
}
class cub{
    public static void main(String[] args) {
        int l=5;
        System.out.println(l*l*l);
    }
}

class Volum{
    public static void main(String[] args) {
        int l=5;
        int b=10;
        int h=55;
        System.out.println(l*b*h);
    }
}

//class mark{
//    public static void main(String[] args) {
//        int m=55;
//        int s=66;
//        int p=5;
//        int l=99;
//        int mark;
//        int pr;
//        mark=m+s+p+l;
//        pr=mark/4;
//        System.out.println("prantag is"+pr);
//        if(pr>=75){
//            System.out.println("first");
//        }
//        else if (pr>=65){
//            System.out.println("scond");
//        }
//        else  if (pr>=50){
//            System.out.println("third");
//
//        }
//        else{
//            System.out.println("fail");
//        }
//    }
//}

class Poil {
    public static void main(String[] args) {
        System.out.println("nishan");
        System.out.println("basnt");

    }
}

class Inputoutput{
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
//        System.out.println("ntr a numbr");
//        int a= scanner.nextInt();
//        System.out.println("2 numbr");
//        int sum=a+b;
//        int b= scanner.nextInt();
//        System.out.println(sum);
        System.out.println("ntr your nam");
        String a=scanner.next();
        System.out.println("your lotion");
        String b=scanner.next();
        System.out.println("ag");
        int g=scanner.nextInt();
        System.out.print(a);
        System.out.println("    " +b);
        System.out.println(g);
    }
}

