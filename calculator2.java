import java.util.Scanner;

public class calculator2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int result = 0;
        boolean finish = false;
        boolean isLastOperationAddition = true;

        while (finish == false) {
            System.out.println("Введите число или команду (+, -, отмена, закончить):");
            String input = sc.nextLine();

            if (input.equals("+")) {
                result += Integer.parseInt(sc.nextLine());
                isLastOperationAddition = true;
            } else if (input.equals("-")) {
                result -= Integer.parseInt(sc.nextLine());
                isLastOperationAddition = false;
            } else if (input.equals("отмена")) {
                if (isLastOperationAddition) {
                    result -= Integer.parseInt(sc.nextLine());
                } else {
                    result += Integer.parseInt(sc.nextLine());
                }
            } else if (input.equals("закончить")) {
                finish = true;
            } else {
                result = Integer.parseInt(input);
            }

            System.out.println("Результат: " + result);
        }
        sc.close();
    }
}
