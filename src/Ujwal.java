import java.util.Scanner;

public class Ujwal {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("lngth");
        double ln=scanner.nextDouble();
        System.out.println("brath");
        double br=scanner.nextDouble();
        double ara=ln*br;
        int casted=(int) (ara);
        System.out.println(casted);
    }
}

class sir{
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("principle");
        double p =scanner.nextDouble();
        System.out.println("rate");
        double r =scanner.nextDouble();
        System.out.println("time");
        double t =scanner.nextDouble();
        double si=(p*t*r)/100;
        int casted=(int) (si);
        System.out.println(casted);

    }
}


