public class Main {

    public static void main(String[] args) {

        // Номер билета
        int numTicket = 178456;

        if (Algorithm.checkTicket(numTicket)) System.out.println("Билет счастливый");
        else {
            System.out.println("Билет не счастливый");

            System.out.println("Ближайший счастливый билет: " + Algorithm.getLuckyTicket(numTicket));
        }
    }

}