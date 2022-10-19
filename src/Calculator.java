import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите знак(+ , - , * , /)");
        //String stroka = plus("govno");
        //System.out.println(stroka);
        String pm = scanner.next();
        if (pm.equals("+")) {
            System.out.print("Введите первое значение для сложения: ");
            int in1 = scanner.nextInt();
            System.out.print("Введите второе значение для сложения: ");
            int in2 = scanner.nextInt();
            int otvet = plus(in1, in2);
            System.out.println(otvet);

        } else if (pm.equals("-")) {
            System.out.print("Введите первое значение для вычитания: ");
            int in1 = scanner.nextInt();
            System.out.print("Введите второе значение для вычитания: ");
            int in2 = scanner.nextInt();
            int otvet1 = minus(in1, in2);
            System.out.println(otvet1);
        }else if (pm.equals("*")) {
            System.out.print("Введите первое значение для умножения: ");
            int in1 = scanner.nextInt();
            System.out.print("Введите второе значение для умножения: ");
            int in2 = scanner.nextInt();
            int otvet1 = multiplication(in1, in2);
            System.out.println(otvet1);
        }else if (pm.equals("/")) {
            System.out.print("Введите первое значение для деления: ");
            int in1 = scanner.nextInt();
            System.out.print("Введите второе значение для деления: ");
            int in2 = scanner.nextInt();
            int otvet1 = division(in1, in2);
            System.out.println(otvet1);

        } else {
            System.out.println("Error");
        }


    }


    public static int plus(int plus1, int plus2) {
        int answer = plus1 + plus2;
        return answer;

    }

    public static int minus(int minus1, int minus2) {
        return minus1 - minus2;


    }

    public static int multiplication(int multiplication1, int multiplication2) {
        return multiplication1 * multiplication2;

    }


    public static int division(int division1, int division2) {
        return division1 / division2;
    }
}