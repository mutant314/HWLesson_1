public class HomeWorkLesson1_1 {
    public static void main(String[] args) {

        byte a = 8;
        short b = 500;
        int c = 1200;
        long d = 15000;

        float pi = 3.14f;
        double g = 8.18195478542;

        char s = 0;
        boolean wordIsMine = true;

        byte a1 = 5;
        byte a2 = 3;

        System.out.println("a * (b + (c / d) = " + exercise3(a, b, c, d));
        System.out.println(exercise4(a1, a2));

        int exe5 = -98;
        exercise5(exe5);

        System.out.println(exercise6(exe5));

        exercise7("Евгений");
    }

    public static double exercise3(int a, int b, int c, double d) {
        double f = a * (b + (c / d));
        return f;
    }

    public static boolean exercise4(byte a1, byte a2) {
        boolean wordIsMine = true;
        int sum = a1 + a2;
        if(sum >= 10 & sum <= 20) {
            return wordIsMine;
        } else return wordIsMine = false;
    }

    public static void exercise5(int exe5) {
        if(exe5 < 0) {
            System.out.println("Число отрицательное!");
        } else System.out.println("Число положительное!");
    }

    public static boolean exercise6(int exe5) {
        boolean exe6 = false;
        if(exe5 < 0){
            exe6 = true;
        }
        return exe6;
    }

    public static void exercise7(String txt) {
        System.out.println("Привет, " + txt + "!");
    }

}
