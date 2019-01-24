public class Staffers {

    public static void main(String[] args) {

        Person[] persArr = new Person[5];
        persArr[0] = new Person("Johnny Depp", "Director", "JohnnyD@gmail.com", "+71005001111", 100000, 45);
        persArr[1] = new Person("Keanu Reeves", "Staff manager", "KeanuR@gmail.com", "+71005001112", 80000, 43);
        persArr[2] = new Person("Monica Bcellucci", "Sales manager", "MonicaB@gmail.com", "+71005001113", 60000, 36);
        persArr[3] = new Person("Robert Downey Jr.", "Guard", "RobertD@gmail.com", "+71005001114", 30000, 47);
        persArr[4] = new Person("Russell Crowe", "Inspector", "RussellC@gmail.com", "+71005001115", 50000, 33);

        for (int i = 0; i < persArr.length; i++) {
            persArr[i].setPrintPers();
        }

        System.out.println("Сотрудники старше 40 лет:\n");
        for (int i = 0; i < persArr.length; i++) {
            if(persArr[i].getAge() > 40)
                persArr[i].setPrintPers();
        }
    }
}
