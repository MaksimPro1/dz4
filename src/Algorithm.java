public class Algorithm {

    // поиск ближайшего счастливого билета
    static int getLuckyTicket(int num) {

        while(true) {
             num += 1;
            if (checkTicket(num)) break;
        }

        return num;
    }

    // проверка билета
    static boolean checkTicket(int num) {

        // Четные числа
        int evenNumbers = 0;

        // Нечетные числа
        int oddNumbers = 0;

        for (int i = 0; i < 6; i++) {

            if ((num % 10) % 2 > 0) oddNumbers += num % 10;
            else evenNumbers += num % 10;

            num = num / 10;
        }

        return evenNumbers == oddNumbers;
    }
}