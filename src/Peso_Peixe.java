import java.util.Scanner;

public class Peso_Peixe{

        public static void main (String[] args) {

            Scanner SC = new Scanner(System.in);



            double peso_adequado=50.0;

            double taxa=4.0;
            System.out.println("Digite o peso do seu peixe");
            double quantoPesaPeixe = SC.nextDouble();
            double excesso = quantoPesaPeixe-peso_adequado;
            double multa = excesso*taxa;

            System.out.println ("O peso excedido é"+excesso);
            System.out.println ("O valor da multa é"+multa);
            }



        }
