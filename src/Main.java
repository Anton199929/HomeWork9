//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1");

        int[] spending = {12345, 10146, 7654, 16132, 12321};
        int spendingAmount = 0;
        for (int i = 0; i < spending.length; i++) {
            spendingAmount += spending[i];
            if (i == spending.length - 1){
                System.out.print("Сумма трат за месяц составила " + spendingAmount + " рублей");
            }
        }
        System.out.println();

        System.out.println("Задача 2");

        int[] spending1 = {13124, 7654, 3434, 15176, 20876};
        int maxPayot = 0;
        int minPayot = 100000;
        for (int i = 0; i < spending1.length; i++) {
            if (spending1[i] > maxPayot){
                maxPayot = spending1[i];
            }
            if (spending1[i] < minPayot){
                minPayot = spending1[i];
            }
        }
        System.out.println("Минимальная сумма трат за неделю составила " + minPayot + " рублей. Максимальная сумма трат за неделю составила " + maxPayot + " рублей");

        System.out.println("Задача 3");

        int[] spending2 = {12786, 13245, 8314, 20945, 15768};
        double spendingAmount1 = 0;
        double averageSpend = 0;
        for (int i = 0; i < spending2.length; i++) {
            spendingAmount1 += spending2[i];
            if (i == spending2.length - 1){
                averageSpend = spendingAmount1 / spending2.length;
            }
        }
        System.out.println("Средняя сумма трат за месяц составила " + averageSpend + " рублей");

        System.out.println("Задача 4");

        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0; i--){
            System.out.print(reverseFullName[i]);
        }


    }
}