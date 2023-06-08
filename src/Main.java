public class Main {
    public static void main(String[] args) {

        int balance = 100;
        int popolnenie = 1100;

        int bonus = 0;
        if (popolnenie > 1000) {
            bonus = popolnenie / 100;
        }

        int itog = balance + popolnenie + bonus;

        System.out.println("Итоговый баланс: " + itog);
        System.out.println("Количество бонусов: " + bonus);
    }
}