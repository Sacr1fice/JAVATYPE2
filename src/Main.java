public class Main {
    public static void main(String[] args) {

        int balance = 100;
        int replenishment = 1100;

        int bonus = 0;
        if (replenishment > 1000) {
            bonus = replenishment / 100;
        }

        int total = balance + replenishment + bonus;

        System.out.println("Итоговый баланс: " + total);
        System.out.println("Количество бонусов: " + bonus);
    }
}