package ru.sbgeu.lichman.basic.users;

public class User {
    private String surname;
    private String name;
    private String patronymic;
    private String email;
    public int yearOfBirth;

    public User (String surname,String name, String patronymic, String email, int yearOfBirth ) {
        this.surname = surname;
        this.name = name;
        this.patronymic = patronymic;
        this.email = email;
        this.yearOfBirth = yearOfBirth;

    }

    public void info () {
        System.out.println("ФАМИЛИЯ, ИМЯ, ОТЧЕСТВО " + surname + " " + name + " " + patronymic);
        System.out.println("Год рождения: " + yearOfBirth);
        System.out.println("mail: " + email);
    }
}
