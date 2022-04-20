import java.util.Scanner;

public class Uf {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("numbr in day ");
        int a= scanner.nextInt();
        switch (a){
            case 1:
                System.out.println("sunday");
                break;
            case 2:
                System.out.println("monday");
                break;
            case 3:
                System.out.println("tus");
                break;
            case 4:
                System.out.println("wed");
                break;
            case 5:
                System.out.println("thur");
                break;
            case 6:
                System.out.println("fri");
                break;
            case 7:
                System.out.println("satu");
                break;
            default:
                System.out.println("numb shiul b 7");
                break;
        }
    }
}
