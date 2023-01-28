public class Main {
    public static void main(String[] args) {
        // Объявляете переменные для входных данных и
        // параметров программы: начального счёта,
        // суммы пополнения и тп

        // Условным оператором проверяете, превысила ли
        // сумма пополнения порог, и для этих двух разных
        // сценариев рассчитываете сумму бонуса и выводите
        // на экран.
        int beforeAccount = 100;
        int pay = 1100;
        int limit = 1000;
        int bonus = pay / 100;
        int afterAccount1 = beforeAccount + pay + bonus;
        int afterAccount2 = beforeAccount + pay;
        if (pay > limit) {
            System.out.println("Итоговая сумма на счету = " + afterAccount1);
            System.out.println("Бонус = " + bonus);
        } else {
            System.out.println("Итоговая сумма на счету = " + afterAccount2);
            System.out.println("Бонус = " + 0);
        }

    }
}