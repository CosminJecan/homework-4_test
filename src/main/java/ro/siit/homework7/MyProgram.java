package ro.siit.homework7;

public class MyProgram {
    public static void main(String[] args) {
        double value1, value2, result;
        String operator;

        value1 = 7.3;
        value2 = 9.5;
        operator = "+";

        switch (operator) {
            case "+":
                result = value1 + value2;
                System.out.println(result);
                break;
            case "-":
                result = value1 - value2;
                System.out.println(result);
                break;
            case "*":
                result = value1 * value2;
                System.out.println(result);
                break;
            case "/":
                result = value1 / value2;
                System.out.println(result);
                break;
            default:
                System.out.println("Invalid operation!");
        }
    }
}
