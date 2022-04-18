import javax.swing.*;

public class Guii {
    public static void main(String[] args) {
        String name=JOptionPane.showInputDialog("enter your name");
        String address=JOptionPane.showInputDialog("enter your address");
        String rollno= JOptionPane.showInputDialog("enter your roll nno");

//        rollno=String.parseint(JOptionPane.showInputDialog();)
        JOptionPane.showMessageDialog(null, name +address +rollno);
        System.exit(0);

    }
}

class Pll{
    public static void main(String[] args) {
        double s =Double.parseDouble(JOptionPane.showInputDialog("enter your mark of subjet1"));
        double p =Double.parseDouble(JOptionPane.showInputDialog("enter your mark of  subjet 2"));
        double f =Double.parseDouble(JOptionPane.showInputDialog("enter your mark of  subjet 3"));
        double k =Double.parseDouble(JOptionPane.showInputDialog("enter your mark of  subjet 4"));
        double mark=s+p+f+k;
        double pu = mark / 4;
        int fu = (int)pu;
//        int fu = Integer.parseInt(JOptionPane.showMessageDialog();
        JOptionPane.showMessageDialog(null,pu+"\u0025");


    }
}