package HW2task2;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import java.util.LinkedList;
import java.util.List;
import java.util.Objects;

public class Passport {
    private  int number;
    private String surname;
    private String name;
    private String patronymic;
    private String dateOfBirth;


    private static List<Passport> listOfPassports = new LinkedList<> ();
    public Passport(int number, String surname, String name,  String dateOfBirth){
        this( number, surname, name, null,dateOfBirth);
    }

    @Override
    public String toString() {
        return "Passport{" +
                "number=" + number +
                ", surname='" + surname + '\'' +
                ", name='" + name + '\'' +
                ", patronymic='" + patronymic + '\'' +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                '}';
    }

    public Passport(int number, String surname, String name, String patronymic, String dateOfBirth) {
        if (number <= 0) {
            throw new RuntimeException ("Номер паспорта должен быть больше нуля");
        } else {
            this.number = number;
        }
        if (surname != null && !surname.isBlank () && !surname.isEmpty ()) {
            this.surname = surname;
        } else {
            throw new RuntimeException ("Заполните графу ФАМИЛИЯ");
        }

        if (name != null && !name.isBlank () && !name.isEmpty ()) {
            this.name = name;
        } else {
            throw new RuntimeException ("Заполните графу ИМЯ");
        }

        if (patronymic != null && !patronymic.isBlank () && !patronymic.isEmpty ()) {
            this.patronymic = patronymic;
        } else {
            throw new RuntimeException ("Заполните графу, ПАТРАНОМИК");
        }

        if (parseDate (dateOfBirth) != null ) {
            this.dateOfBirth = dateOfBirth;
        } else {
            System.out.println ("Заполните графу, ДАТА РОЖДЕНИЯ в формате \"dd.MM.yyyy\" ");
        }
    }

    public static Date parseDate (String date){
        try {
            return new SimpleDateFormat ("dd.MM.yyyy").parse(date);
        } catch (ParseException e) {
            return null;
        }
    }



    public static List<Passport> getListOfPassports() {
        return listOfPassports;
    }

    public static Passport addNewPassport (Passport newPassport) {
        boolean checkNewPassport = true;
        for (Passport  passport : listOfPassports) {
            if (passport.getNumber () == newPassport.getNumber ()) {
                passport.setName (newPassport.getName ());
                passport.setSurname (newPassport.getSurname ());
                passport.setPatronymic (newPassport.getPatronymic ());
                passport.setDateOfBirth (newPassport.getDateOfBirth ());
                checkNewPassport = false;
                break;
            }
        }
        if (checkNewPassport){
            listOfPassports.add (newPassport);
        }
        return newPassport;
    }

    public static Passport searchPassport (Passport searchPassport){
        for (Passport passport : listOfPassports){
            if (passport.getNumber () == searchPassport.getNumber ()){
                return searchPassport;
            }
        }
        return null;
    }

    public static void printListOfPassport (){
        for (Passport passport : listOfPassports){
            System.out.println (passport);
        }
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public static void setListOfPassports(List<Passport> listOfPassports) {
        Passport.listOfPassports = listOfPassports;
    }

    public int getNumber() {
        return number;
    }

    public String getSurname() {
        return surname;
    }

    public String getName() {
        return name;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass () != o.getClass ()) return false;
        Passport passport = (Passport) o;
        return number == passport.number && Objects.equals (surname, passport.surname) && Objects.equals (name, passport.name) && Objects.equals (patronymic, passport.patronymic) && Objects.equals (dateOfBirth, passport.dateOfBirth);
    }

    @Override
    public int hashCode() {
        return Objects.hash (number, surname, name, patronymic, dateOfBirth);
    }



}
