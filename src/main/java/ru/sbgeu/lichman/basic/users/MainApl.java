package ru.sbgeu.lichman.basic.users;


public class MainApl {
    public static void main(String[] args) {
        User[] userArray = new User[10];

        userArray[0] = new User("Личман", "Елена", "Александровна", "elen@mail.ru", 1997);
        userArray[1] = new User("Абуев", "Назим", "Мирзеханович", "nazim@mail.ru", 1976);
        userArray[2] = new User("Ксенофонтова", "Екатерина", "Михайловна", "kat@mail.ru", 1973);
        userArray[3] = new User("Лукин", "Максим", "Александрович", "maxi@mail.ru", 1983);
        userArray[4] = new User("Малевич", "Юлия", "Валерьевна", "yali@mail.ru", 1972);
        userArray[5] = new User("Пластуняк", "Ирина", "Александровна", "ira@mail.ru", 1974);
        userArray[6] = new User("Аитова", "Ксения", "Алексеевна", "kseni@mail.ru", 1990);
        userArray[7] = new User("Мусанёв", "Дмитрий", "Михайлович", "dima@mail.ru", 1985);
        userArray[8] = new User("Тимофеева", "Елена", "Юрьевна", "timofeeva@mail.ru", 1958);
        userArray[9] = new User("Полякова", "Виктория", "Алексеевна", "vika@mail.ru", 1977);


        for (int i = 0; i < userArray.length; i++)
            if (userArray[i].yearOfBirth < 1983)
                userArray[i].info();
    }

}
