public class Main1 {
    public static void main(String[] args) {

        int ticket = 400; // Стоимость билета
        int bonus = 25;   // Кол-во рублей для одной бонусной мили
        int miles = (ticket / bonus);

        System.out.println("Начислено бонусных миль:");
        System.out.println(miles);
    }
}
