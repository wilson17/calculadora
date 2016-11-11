import javax.swing.*;

public class Menu {
 public static int a;
 public static double n1,n2,n3,n4,n5,n6,n7,n8;
    public static double r1,r2,r3,r4;
 
    public static void main(String []agrs)
    {
        int op=0;
       


        do{

            op=Integer.parseInt(JOptionPane.showInputDialog("nCalculadoran"+
            "************n"+

            "[1] SUMARn  "+
            "[2] RESTARn  "+
            "[3] MULTIPLICARn "+
            "[4] DIVIDIRn  "+
            "[5] vitacora "+
            "Ingresa una opcion:"));

            switch(op)
            {
                case 1:
                    n1=Double.parseDouble(JOptionPane.showInputDialog("Ingrese numero 1"));
                    n2=Double.parseDouble(JOptionPane.showInputDialog("Ingrese numero 2"));
                    r1=n1+n2;
                    JOptionPane.showMessageDialog(null,"La suma es:"+r1);

                    break;
                case 2:
                    n3=Double.parseDouble(JOptionPane.showInputDialog("Ingrese numero 1"));
                    n4=Double.parseDouble(JOptionPane.showInputDialog("Ingrese numero 2"));
                    r2=n3-n4;
                    JOptionPane.showMessageDialog(null,"La resta es:"+r2);
                    break;
                case 3:
                    n5=Double.parseDouble(JOptionPane.showInputDialog("Ingrese numero 1"));
                    n6=Double.parseDouble(JOptionPane.showInputDialog("Ingrese numero 2"));
                    r3=n5*n6;
                    JOptionPane.showMessageDialog(null,"La multiplicacion es:"+r3);
                    break;
                case 4:
                    n7=Double.parseDouble(JOptionPane.showInputDialog("Ingrese numero 1"));
                    n8=Double.parseDouble(JOptionPane.showInputDialog("Ingrese numero 2"));
                    r4=n7/n8;
                    JOptionPane.showMessageDialog(null,"La division es:"+r4);
                    break;
                case 5:
                    JOptionPane.showMessageDialog(null,"La suma de :"+n1 + "+" + n2 + " ="+ r1);
                      JOptionPane.showMessageDialog(null,"La resta de:"+n3 + "+" + n4 + " ="+ r2);
                        JOptionPane.showMessageDialog(null,"La multiplicacion de:"+n5 + "+" + n6 + " ="+ r3);
                          JOptionPane.showMessageDialog(null,"La division de:"+n7 + "+" + n8+ " ="+ r4);

                 break;

            }
        }while(op!=6);

    }

}