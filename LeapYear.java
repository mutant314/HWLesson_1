public class LeapYear {
    public static void main(String [] args) {

        int year = 2018;

        if(year % 400 == 0)
            System.out.println("Год является високосным!");
        else if(year % 100 == 0)
                System.out.println("Год не является високосным!");
                else if(year % 4 == 0)
                    System.out.println("Год является високосным!");
                    else System.out.println("Год не является високосным!");
    }
}
