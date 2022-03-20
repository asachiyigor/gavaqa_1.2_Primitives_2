import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("--------------------------------");
        System.out.print("Введите начальную сумму на счете клиента ... например 100: ");
        int startAmount = s.nextInt();
        System.out.print("Введите сумму пополнения ... например 100: ");
        int income = s.nextInt();
        System.out.println("--------------------------------");

        int result = isIncomeMoreThan1000(income) ? (startAmount + income + howManyBonusRubles(income)) : startAmount + income;

        System.out.println(isIncomeMoreThan1000(income) ? "Количествоо бонусных рублей: " + howManyBonusRubles(income)+"\nИтоговый счёт: " + result : "Бонусов нет\nИтоговый счёт: " + result);
        System.out.println("--------------------------------");
    }

    public static boolean isIncomeMoreThan1000(int income) {
        return (income > 1000);
    }

    public static int howManyBonusRubles(int income) {
        return isIncomeMoreThan1000(income) ? income / 100 : 0;
    }
}
