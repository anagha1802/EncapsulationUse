package DateUtil;

import java.util.Scanner;

public class DateCreator {

    public static void main(String[] args) {

        MyDate date = new MyDate();
        Scanner scanner = new Scanner(System.in);


        System.out.println("PLease enter year: ");
        date.setYear(scanner.nextInt());


        System.out.println("PLease enter month: ");
        date.setMonth(scanner.nextInt());

        System.out.println("PLease enter day: ");
        date.setDay(scanner.nextInt());

        System.out.println("Date entered: "+date.getDay()+" / "+date.getMonth()+" / "+date.getYear());
    }
}
