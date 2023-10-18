import org.apache.commons.lang3.StringUtils;

import java.util.Scanner;

public class DependencyManagementExercise {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        System.out.println("Enter a String: ");
        String input = myScanner.nextLine();

        System.out.println("You entered: " + "\"" + input + "\"");

        //StringUtils.isNumeric(input) == false is what I has as the parameter, but the current expression is a simplified version
        if(!StringUtils.isNumeric(input)){
            System.out.println("\"" + input + "\"" + " is not a number");
        }

        System.out.println(StringUtils.swapCase(input));
        System.out.println(StringUtils.reverse(input));

    }
}
