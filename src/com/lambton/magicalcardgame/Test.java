package com.lambton.magicalcardgame;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Test {


    public static void main(String[] args) {

        String [][]cardList = { {"1","A","5"},
                                {"2","7","3"},
                                {"3","6","K"} };

        MagicalCardGameModel obj = new MagicalCardGameModel();
        MagicalCardGameCalculator calculate = new MagicalCardGameCalculator();

        obj.setCardList(cardList);

        System.out.println(Arrays.deepToString(obj.getCardList()));

        Scanner scan = new Scanner(System.in);

        System.out.println("Please guess a number from matrix : ");

        obj.setGuessedCard(scan.nextLine());

        System.out.println("Please enter column where your input place in :");

        obj.setFirstShuffleColPos(scan.nextLine());

        System.out.println(Arrays.deepToString(calculate.getFirstShuffleResult(obj)));

        System.out.println("Please enter column where your input place in :");

        obj.setSecShuffleColPos(scan.nextLine());

        System.out.println(Arrays.deepToString(calculate.getSecShuffleResult(obj)));











    }

}
