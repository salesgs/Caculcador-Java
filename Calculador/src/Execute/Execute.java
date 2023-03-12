package Execute;

import ClassExceptions.ClassAritmetic;
import ClassExceptions.ClassNumber;
import Operators.Operator;

import java.util.Scanner;

public class Execute {
    public static void main(String[] args) {

         Operator operator = new Operator();
        Scanner scan = new Scanner(System.in);

         //int  result = operator.subtraction(4,2,0);
        try {
            System.out.println("Informe um número");
            int n1 = scan.nextInt();
            System.out.println("Informe outro número");
            int n2 = scan.nextInt();
            int result = operator.division(n1,n2);
            System.out.println(result);

        }catch (ClassNumber e){
            System.out.println(e +" Erro");
        }
        catch (ClassAritmetic e){
            System.err.println(e + "Erro ");
        }

    }
}