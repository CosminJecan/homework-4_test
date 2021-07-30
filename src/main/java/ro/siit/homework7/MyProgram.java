package ro.siit.homework7;



import java.io.OutputStream;
import java.nio.charset.StandardCharsets;

public class MyProgram {
    private String value1;
    private String value2;
    private String operator;

    public MyProgram() {
        this.value1 = value1;
        this.value2 = value2;
        this.operator = operator;
    }

    public String getValue1() {
        return value1;
    }

    public String getValue2() {
        return value2;
    }

    public String getOperator() {
        return operator;
    }

    public static void main(String[] args) {
        MyProgram op = new MyProgram();
        System.out.println(op.getOperator());

    }
}
//
//
//        switch ( operator ) {
//            case "+":
//                System.out.println(value1 + value2);
//                break;
//            case "-":
//                System.out.println(value1 - value2);
//                break;
//            case "*":
//                System.out.println(value1 * value2);
//                break;
//            case "/":
//                System.out.println(value1 / value2);
//                break;
//            default:
//                System.out.println("Invalid operation!");
//        }
//    }
//
//    public static void main(String[] args) {
//        System.out.println(operator);
//    }

