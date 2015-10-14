import net.algorithm.squareroot.SquareRoot;
import java.util.Scanner;

public class Main {

    public static Double initial(Double epsilon){
        String str = epsilon.toString();
        String str2 = "1";
        str = str.substring(str.indexOf(".")+1, str.length());
        int length = str.length();
        for(int j = 0; j < length; j ++){
            str = str+"0";
        }
        str = str+".0";
        Double divider = new Double(str);

        return divider;
    }

    public static void main(String[] args) {

        SquareRoot squareRoot = new SquareRoot();
        Scanner scanner = new Scanner(System.in);
        Double epsilon;
        Integer n;
        Boolean check = true;

        System.out.print("Enter Number : ");
        n = scanner.nextInt();
        squareRoot.setN(n);
        System.out.print("Enter epsilon : ");
        epsilon = scanner.nextDouble();
        squareRoot.setB(new Double(n));

        while(check){

            squareRoot.calculate();
            System.out.println(squareRoot.getA() + "\t\t" + squareRoot.getB() + "\t\t" + squareRoot.getX()+"\t\t"+squareRoot.getCompare());

            if(squareRoot.getCompare() > 0){
                squareRoot.setB(squareRoot.getX());
            }
            else{
                squareRoot.setB(squareRoot.getB());
            }
            if(squareRoot.getCompare() < 0){
                squareRoot.setA(squareRoot.getX());
            }
            else{
                squareRoot.setA(squareRoot.getA());
            }

            if(Math.round(epsilon - squareRoot.getCompare()*initial(epsilon))/initial(epsilon) == 0){
                check = false;
                System.out.println("Square root of " + n + " is "+ squareRoot.getX());
            }
        }
    }
}
