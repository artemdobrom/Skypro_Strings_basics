import java.time.LocalDate;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {


    public static void printSeparator() {
        System.out.println("=====================");
        System.out.println("+++++++++++++++++++++");
    }

    public static void printIssues(int issuesCount) {
        System.out.println(issuesCount);
    }

    public static int sum(int[] numbers) {
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum = sum + numbers[i];
        }
        return sum;
    }

    public static void main(String[] args) {


//        task0();
        task1();
        checkIsLeapYear(2020);
        checkIsLeapYear(2002);
        checkIsLeapYear(2030);

        task2();
        defineAppVersion(0, 2023);
        defineAppVersion(1, 2020);

        task3();
        printCardDeliseryDays(95);
        printCardDeliseryDays(800);

    }

    public static void task0() {
        System.out.println();
        System.out.println("Метод. Образец");

        int[] issuesByMounths = {4, 6, 7, 9, 2, 5, 12, 3, 7, 10, 6, 7, 1, 8};
        printSeparator();
        for (int i = 0; i < issuesByMounths.length; i++) {
            printIssues(issuesByMounths[i]);
            if ((i + 1) % 3 == 0) {
                printSeparator();
            }
        }
        printSeparator();
        int total = sum(issuesByMounths);
        printIssues(total);

    }

    public static void task1() {
        System.out.println();
        System.out.println("Метод. Задание 1");
    }

    public static void checkIsLeapYear(int year) {
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + " - высокосный год");
        } else {
            System.out.println(year + " - не высокосный год");

        }
    }


    public static void task2() {
        System.out.println();
        System.out.println("Метод. Задание 2");
    }

    public static void defineAppVersion(int mobileIOS, int mobileYear) {
        int currentYear = LocalDate.now().getYear();
        String mobileIOsName = defineIOsName(mobileIOS);

        if (mobileYear != currentYear) {
            System.out.println("Для ОС " + mobileIOsName + " необходимо установить старую версию.");
        } else {
            System.out.println("Для ОС " + mobileIOsName + " необходимо установить новую версию.");

        }
    }

    public static String defineIOsName(int mobileIOS) {
        String mobileName;

        switch (mobileIOS) {
            case 0:
                mobileName = "iOS";
                break;
            case 1:
                mobileName = "Android";
                break;
            default:
                mobileName = " Не известная ОС";

        }
        return mobileName;
    }

    public static void task3() {
        System.out.println();
        System.out.println("Метод. Задание 3");
    }

    public static int calcCardDeliveryDays(int disatance) {
        if (disatance <= 20) {
            return 1;
        } else if (disatance < 60) {
            return 2;
        } else if (disatance < 100) {
            return 3;
        } else {
            return -1;
        }
    }

    public static void printCardDeliseryDays(int distance) {
        int days = calcCardDeliveryDays(distance);

        if (days > 0) {
            System.out.println("Потребуется дней: " + days);

        } else {
            System.out.println("Доставка не осуществляется.");

        }
    }
}





