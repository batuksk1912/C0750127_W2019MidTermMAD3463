package com.lambton.magicalcardgame;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;
import java.util.ArrayList;


public class Test {

    public static void main(String[] args) {

        String[][] cardList = {{"A", "4", "3"},
                {"K", "7", "2"},
                {"5", "9", "8"}};

        MagicalCardGameModel obj = new MagicalCardGameModel();

        obj.setCardList(cardList);

        System.out.println(Arrays.deepToString(obj.getCardList()));

        Scanner scan = new Scanner(System.in);

        System.out.println("Please guess a element from matrix : ");

        obj.setGuessedCard(scan.nextLine());

        System.out.println("You select : " + obj.getGuessedCard());

        System.out.println("Please enter column where your input place in :");

        obj.setFirstShuffleColPos(scan.nextLine());

        System.out.println(Arrays.deepToString(obj.getFirstShuffleResult(obj)));

        System.out.println("Please enter column where your input place in :");

        obj.setSecShuffleColPos(scan.nextLine());

        System.out.println(Arrays.deepToString(obj.getSecShuffleResult(obj)));

        String middle = obj.getFinalResult(obj);

        System.out.println("Middle element of Array : " + middle);
    }
}
