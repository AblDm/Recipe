package HW2task2;

import static HW2task2.Numbers.numbers;

public class Main {
    public static void main(String[] args) {
//дз 1
        System.out.println ("ДЗ про числа");

        Numbers.fillSetRandomNumber();
        System.out.println (Numbers.numbers);
        numbers.removeIf(number -> number % 2 !=0);
        System.out.print (Numbers.numbers);

        System.out.println ();

// ДЗ 2
        System.out.println ("ДЗ про таблицу умножения");
        MultiplicationTable.generateTasks();
        System.out.println (MultiplicationTable.getSetTasks());


//ДЗ 3
        System.out.println ("ДЗ про паспорт");
        Passport.addNewPassport  (new Passport (63452, "Алексеев", "Иван", "Иванович", "12.12.2002"));
        Passport.addNewPassport  (new Passport (63452, "Борисов", "Иван", "Иванович", "15.02.2002"));
        Passport.addNewPassport  (new Passport (63452, "Васильев", "Иван", "Иванович", "14.01.2002"));
        Passport.addNewPassport  (new Passport (63452, "Геннадиев", "Иван", "Иванович", "13.06.2002"));

        Passport.printListOfPassport();

        System.out.println ( );
        System.out.println ("Поиск паспорта");
        System.out.println (Passport.searchPassport(Passport.addNewPassport  (new Passport (63452, "Алексеев", "Иван", "Иванович", "12.12.2002"))));


    }
}
