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

        int result = IsIncomeMoreThan1000(income) ? (startAmount + income + HowManyBonusRubles(income)) : startAmount + income;

        System.out.println(IsIncomeMoreThan1000(income) ? "Количествоо бонусных рублей: " + HowManyBonusRubles(income)+"\nИтоговый счёт: " + result : "Бонусов нет\nИтоговый счёт: " + result);
        System.out.println("--------------------------------");
    }

    public static boolean IsIncomeMoreThan1000(int income) {
        return (income > 1000);
    }

    public static int HowManyBonusRubles(int income) {
        return IsIncomeMoreThan1000(income) ? income / 100 : 0;
    }
}
