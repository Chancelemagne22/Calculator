import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Double> number = new ArrayList<>();
        String operation;

        //Display - INPUT
        System.out.println("Enter Value:");
        number.add(input.nextDouble());

        for (int num = 0;num < 2;num++){
            System.out.println("""
                    Addition: +\s
                    Subtraction: -\s
                    Multiplication: *\s
                    Division: /\s
                    End: =""");
            operation = input.next();

            //Immediate Answer or not
            if (!Objects.equals(operation, "=")){

                System.out.println("Next Value:");
                number.add(input.nextDouble());
                if (!Objects.equals(operation, "="))
                    //Operation - Solving and removing the 1st and 2nd value

                    if (Objects.equals(operation, "+")) {
                        number.add(number.get(0) + number.get(1));
                        number.remove(1);
                        number.remove(0);


                    } else if (Objects.equals(operation, "-")) {
                        number.add(number.get(0) - number.get(1));
                        number.remove(1);
                        number.remove(0);

                    } else if (Objects.equals(operation, "*")) {
                        number.add(number.get(0) * number.get(1));
                        number.remove(1);
                        number.remove(0);

                    } else {
                        number.add(number.get(0) / number.get(1));
                        number.remove(1);
                        number.remove(0);
                    }
                num--;
                System.out.println(number);
                System.out.println();
            }else {
                System.out.println(number);
                num++;
            }


        }


    }
}


