package ICT152Java.Lesson2;
import java.util.Scanner;

public class divide {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int userNum;
        int divNum;

        userNum = scnr.nextInt();
        divNum = scnr.nextInt();

        userNum = userNum / divNum;
        System.out.print(userNum);

        userNum = userNum / divNum;
        System.out.print(" " + userNum);

        userNum = userNum / divNum;
        System.out.print(" " + userNum);

        scnr.close();

    }

}
