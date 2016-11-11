import java.util.Scanner; 

public class Menu1 {
 public static int op=0;;
 public static int n1,n2,n3,n4,n5,n6,n7,n8;
    public static int r1,r2,r3,r4;
 
    public static void main(String []agrs)
    {
    
       


        do{

            Scanner stdin = new Scanner (System.in); 
  System.out.println("------------CALCULADORA V1.0----------------");
System.out.println("1-SUMA"); 
System.out.println("2-RESTA"); 
System.out.println("3-MULTIPLICACION"); 
System.out.println("4-DIVICION"); 
System.out.println("5-VITACORA"); 
System.out.println("6-SALIR"); 


System.out.println("INGRESA TU OPCION"); 
op = stdin.nextInt(); 
 System.out.println("----------------------------");
            switch(op)
            {
                case 1:
                 System.out.println("------------SUMA-------------");
                  System.out.println("primer digito"); 
                    n1 = stdin.nextInt(); 
                System.out.println("primer digito"); 
                    n2 = stdin.nextInt(); 
                r1=n1+n2;
                System.out.println("resultado  "+ r1);
                System.out.println("----------------------------");

                    break;
                case 2:
                    System.out.println("------------RESTA-------------");
                  System.out.println("primer digito"); 
                    n3 = stdin.nextInt(); 
                System.out.println("primer digito"); 
                    n4 = stdin.nextInt(); 
                r2=n3-n4;
                System.out.println("resultado  "+ r2);
                System.out.println("----------------------------");
                    break;
                case 3:
                 System.out.println("------------MULTIPLICACION-------------");
                  System.out.println("primer digito"); 
                    n5 = stdin.nextInt(); 
                System.out.println("primer digito"); 
                    n6 = stdin.nextInt(); 
                r3=n5-n6;
                System.out.println("resultado  "+ r3);
                System.out.println("----------------------------");
                 break;
                case 4:
                 System.out.println("------------DIVICION-------------");
                  System.out.println("primer digito"); 
                    n7 = stdin.nextInt(); 
                System.out.println("primer digito"); 
                    n8 = stdin.nextInt(); 
                r4=n7-n8;
                System.out.println("resultado  "+ r4);
                System.out.println("----------------------------");
                   
                    break;
                case 5:
                System.out.println("------------HISTORIAL DE OPERACIONES-------------");
                   System.out.println("SUMA DE"+ n1 + " + " + n2 + "=" + r1);
                    System.out.println("RESTA DE"+ n3 + " + " + n4 + "=" + r2);
                     System.out.println("MULTIPLIACION DE"+ n5 + " + " + n6 + "=" + r3);
                      System.out.println("DIVICION DE"+ n7 + " + " + n8 + "=" + r4);
                      System.out.println("--------------------------------------------");
                       

                 break;

            }
        }while(op!=6);

    }

}