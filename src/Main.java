/*import java.util.Scanner;

import static java.lang.Character.isAlphabetic;

public class Main {
    public static void main(String[] args) {
        new Main().run();
    }

    private void run() {
        Scanner in = new Scanner(System.in);

        System.out.println("Введіть число");
        int k = in.nextInt();

        System.out.println("Введіть літеру");
        String inChar = in.next();
        char chr = inChar.charAt(0);

        Scanner in2 = new Scanner(System.in);

        System.out.println("Введіть текст");
        String str = in2.nextLine();

        StringBuilder sasha = new StringBuilder(str);
        int count = 0;
        for (int i = 0; i < sasha.length(); i++) {
            Character b = sasha.charAt(i);
            if (isAlphabetic(b)) {
                count ++;
                if (count == k) {
                    sasha.setCharAt(i,chr);
                    count = 0;
                    for (int j = i+1; j < sasha.length(); j++) {
                        b = sasha.charAt(j);
                        if (!isAlphabetic(b) || j == sasha.length()-1) {
                            i = j;
                            break;
                        }
                    }
                }
            }
            else if (!isAlphabetic(b)) count = 0;
        }
        System.out.println(sasha);
    }
}*/


import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        new Main().run();
    }

    private void run() {
        Scanner in = new Scanner(System.in);
        System.out.println("Введіть текст");
        String str = in.nextLine();
        System.out.println("Введіть символ після якого видалиться текст");
        char chr1 = in.next().charAt(0);
        System.out.println("Введіть символ до якого видалиться текст");
        char chr2 = in.next().charAt(0);
        laba3 text = new laba3(str);
        text.printText();
        text.editText(chr1,chr2);
        text.printText();
        System.out.println("Кількість слів у рядку: " + text.getNumberOfWords());
    }
}
/*private void run() {
        Scanner in = new Scanner(System.in);
        System.out.println("Введіть текст");
        String str = in.nextLine();

        StringBuilder resStr = new StringBuilder(str);

        int countCpecial = 0;
        int start = -1;
        int end = -1;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '(' || str.charAt(i) == '*' || str.charAt(i) == ')') {
                if (countCpecial < 2) {
                    countCpecial ++;
                    if (countCpecial == 1) start = i;
                }
                if (countCpecial == 2) {
                    end = i+1;
                    countCpecial = 0;
                    resStr.delete(start,end);
                }
            }
        }
        if (resStr.length() != 0) {
            countCpecial ++;
            for (int i = 0; i < resStr.length(); i++) {
                if (resStr.charAt(i) == ' ') countCpecial ++;
            }
        }

        System.out.println("Початковий рядок: " + "\n" + str + "\n");
        System.out.println("Рядок після опрацювання: " + "\n" + resStr + "\n");
        System.out.print("Кількість слів у опрацьованому рядку: " + "\n" + countCpecial);
    }*/

