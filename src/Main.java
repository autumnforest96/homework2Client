public class Main {
    public static void main(String[] args) {

        int currentBalance = 100; // начальный счет клиента
        int refillAmount = 1200; // сумма пополнения

        int bonus = 0; // объявляем переменную для хранения бонуса

        if (refillAmount > 1000) { // если сумма пополнения больше 1000
            bonus = (refillAmount / 100); // рассчитываем бонус
        } else bonus = 0; // если сумма пополнения меньше 1000, то бонуса нет

        int totalBalance = currentBalance + refillAmount + bonus; // рассчитываем итоговый счет

        System.out.println("Итоговый счет: " + totalBalance + " рублей"); // выводим итоговый счет на экран
        System.out.println("Бонусные рубли: " + bonus + " рублей"); // выводим бонусные рубли на экран
    }
}