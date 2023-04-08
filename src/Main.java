public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();

        System.out.println("Сумма кредита: 1 000 000 руб");
        System.out.println("Количество месяцев: 12");
        System.out.println("Сумма платежа: " + service.calculate(1000000,9.99,12));
        System.out.println("Процентная ставка: 9,99 %");

        System.out.println();
        System.out.println("Сумма кредита: 1 000 000 руб");
        System.out.println("Количество месяцев: 24");
        System.out.println("Сумма платежа: " + service.calculate(1000000,9.99,24));
        System.out.println("Процентная ставка: 9,99 %");

        System.out.println();
        System.out.println("Сумма кредита: 1 000 000 руб");
        System.out.println("Количество месяцев: 36");
        System.out.println("Сумма платежа: " + service.calculate(1000000,9.99,36));
        System.out.println("Процентная ставка: 9,99 %");





            }
}