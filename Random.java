import java.util.Scanner;

public class Random {

    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int rand;
        int answer;
        do {
            rand = getRandom();
            answer = getUserAnswer();
            answer = getComparison(rand, answer);
        } while (getQuestion(rand, answer) == 1);
    }

    public static int getRandom() {
        int random = (int) (Math.random() * 10);
        return random;
    }

    public static int getUserAnswer() {
        System.out.println("Введите число от 0 до 10.");
        int answer = in.nextInt();
        return answer;
    }

    public static int getComparison(int rand, int answer) {
        for (int i = 0; i < 2; i++) {
            if(answer == rand) {
                System.out.println("Вы угадали, загаданное число " + rand);
                break;
            } else answer = getUserAnswer();
        }
        return answer;
    }

    public static int getQuestion(int rand, int answer) {
        int question;
        if(rand != answer)
            System.out.println("Вы проиграли, загаданное число " + rand);
        System.out.println("Повторить игру еще раз? 1 - да / 0 - нет");
        do {
            question = in.nextInt();
            if(question != 0 && question != 1)
                System.out.println("Только 0 или 1!");
        } while (question != 0 && question != 1);
        return question;
    }

}
