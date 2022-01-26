package example;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static example.PrimeNumber.findPrimeNum;

public class Start {
    public static Integer generatePrimeNumber() {
        List<Integer> integerList = new ArrayList<>(findPrimeNum(10));
        Integer sizeList = integerList.size();
        Integer num = (int) (Math.random() * sizeList);
        return integerList.get(num);
    }

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("Введите число g: ");
        int g = s.nextInt();
        System.out.println("Введите число p: ");
        int p = s.nextInt();

        Alice alice = new Alice(g,p);
        Bob bob = new Bob(g,p);

        System.out.println("Алиса и Боб есть 2 числа: g и p");

        int a = generatePrimeNumber();
        alice.setA(a);
        System.out.println("Алиса загадала число a = " + a);

        int b = generatePrimeNumber();
        bob.setB(b);
        System.out.println("Боб загадал число b = " + b);

        System.out.println("Алиса вычислила остаток от деления a=" + alice.calculateRemainderOfTheDivision() + " после этого передала Бобу");
        bob._a_ = alice.sendToBob();

        System.out.println("Боб вычислил остаток от деления b=" + bob.calculateRemainderOfTheDivision() + "после этого передал Алисе");
        alice._b_ = bob.sendToAlice();

        System.out.println("Алиса вычислила секретный ключ: " + alice.calculateSecretKey());
        System.out.println("Боб вычислил секретный ключ: " + bob.calculateSecretKey());
    }
}
