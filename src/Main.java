// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        task0();
        task1();
        task2();
        task3();
    }

    public static void task0() {
        System.out.println("Строка. Образец");

        String phone = "+72-58-98 29-55";
        phone = phone.replace("-","" );
        phone = phone.replace("+","" );
        phone = phone.replace(" ", "");
        if (phone.length()==10) {
//            phone = '3' + phone;
        } else if (phone.length() > 11) {
            throw new RuntimeException("Телефон слишком длинный");
        } else if (phone.length() < 10) {
            throw new RuntimeException("Телофон слишком короткий");
        } else if (phone.length() == 11 && phone.charAt(0) != '3') {
            throw new RuntimeException("Иностранный номер");
        }
        System.out.println("phone = " + phone);
        String expextedPhone = "37258982955";
        if (phone.equals(expextedPhone)) {
            System.out.println("Успех");
        } else {
            System.out.println("Неудача");
        }
        }

        public static void task1() {
            System.out.println();
            System.out.println("Строка.Задание 1");

            String firstName = "Иван ";
            String middleName = "Иванович ";
            String lastName = "Иванов ";
            String fullName = lastName + firstName + middleName;
//            String fullName = String.join(" ", lastName + firstName + middleName);
            System.out.println("ФИО сотрудника- " + fullName);
        }


    public static void task2() {
        System.out.println();
        System.out.println("Строка.Задание 2");

        String firstName = "Иван ";
        String middleName = "Иванович ";
        String lastName = "Иванов ";
        String fullName = lastName + firstName + middleName;
//        fullName = fullName.replace("Иванов Иван Иванович ","ИВАНОВ ИВАН ИВАНОВИЧ " );
        System.out.println("Данные ФИО сотрудников для заполнения отчёта-  " + fullName.toUpperCase());
//        System.out.println("Данные ФИО сотрудников для заполнения отчёта-  " + fullName);

    }


    public static void task3() {
        System.out.println();
        System.out.println("Строка.Задание 3");

        String firstName = "Семён ";
        String middleName = "Семёнович ";
        String lastName = "Иванов ";

        String fullName = lastName + firstName + middleName;

        fullName = fullName.replace("ё","е" );

        System.out.println("Данные ФИО сотрудника-  " + fullName.toUpperCase());



    }
    }
