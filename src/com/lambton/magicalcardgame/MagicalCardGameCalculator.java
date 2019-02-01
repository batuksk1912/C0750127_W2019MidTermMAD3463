package com.lambton.magicalcardgame;

public class MagicalCardGameCalculator implements IMagicalCardGame {

    @Override
    public String[][] getFirstShuffleResult(MagicalCardGameModel magicalCardGameModel) {

        if (magicalCardGameModel.getFirstShuffleColPos().equalsIgnoreCase("c3")) {
            String[][] temp;
            temp = magicalCardGameModel.getCardList();
            String[] c1 = new String[temp[0].length];
            String[] c2 = new String[temp[0].length];
            String[] c3 = new String[temp[0].length];
            for (int i = 0; i < c1.length; i++) {
                c1[i] = temp[i][1];
                c2[i] = temp[i][2];
                c3[i] = temp[i][0];
            }
            for (int j = 0; j < c1.length; j++) {
                temp[0][j] = c1[j];
                temp[1][j] = c2[j];
                temp[2][j] = c3[j];
            }
            return temp;

        } else if (magicalCardGameModel.getFirstShuffleColPos().equalsIgnoreCase("c2")) {
            String[][] temp;
            temp = magicalCardGameModel.getCardList();
            String[] c1 = new String[temp[0].length];
            String[] c2 = new String[temp[0].length];
            String[] c3 = new String[temp[0].length];
            for (int i = 0; i < c1.length; i++) {
                c1[i] = temp[i][0];
                c2[i] = temp[i][1];
                c3[i] = temp[i][2];
            }
            for (int j = 0; j < c1.length; j++) {
                temp[0][j] = c1[j];
                temp[1][j] = c2[j];
                temp[2][j] = c3[j];
            }
            return temp;
        } else {
            String[][] temp;
            temp = magicalCardGameModel.getCardList();
            String[] c1 = new String[temp[0].length];
            String[] c2 = new String[temp[0].length];
            String[] c3 = new String[temp[0].length];
            for (int i = 0; i < c1.length; i++) {
                c1[i] = temp[i][1];
                c2[i] = temp[i][0];
                c3[i] = temp[i][2];
            }
            for (int j = 0; j < c1.length; j++) {
                temp[0][j] = c1[j];
                temp[1][j] = c2[j];
                temp[2][j] = c3[j];
            }
            return temp;
        }
    }

    @Override
    public String[][] getSecShuffleResult(MagicalCardGameModel magicalCardGameModel) {
        if (magicalCardGameModel.getSecShuffleColPos().equalsIgnoreCase("c3")) {
            String[][] temp;
            temp = magicalCardGameModel.getCardList();
            String[] c1 = new String[temp[0].length];
            String[] c2 = new String[temp[0].length];
            String[] c3 = new String[temp[0].length];
            for (int i = 0; i < c1.length; i++) {
                c1[i] = temp[i][1];
                c2[i] = temp[i][2];
                c3[i] = temp[i][0];
            }
            for (int j = 0; j < c1.length; j++) {
                temp[0][j] = c1[j];
                temp[1][j] = c2[j];
                temp[2][j] = c3[j];
            }
            return temp;

        } else if (magicalCardGameModel.getFirstShuffleColPos().equalsIgnoreCase("c2")) {
            String[][] temp;
            temp = magicalCardGameModel.getCardList();
            String[] c1 = new String[temp[0].length];
            String[] c2 = new String[temp[0].length];
            String[] c3 = new String[temp[0].length];
            for (int i = 0; i < c1.length; i++) {
                c1[i] = temp[i][0];
                c2[i] = temp[i][1];
                c3[i] = temp[i][2];
            }
            for (int j = 0; j < c1.length; j++) {
                temp[0][j] = c1[j];
                temp[1][j] = c2[j];
                temp[2][j] = c3[j];
            }
            return temp;
        } else {
            String[][] temp;
            temp = magicalCardGameModel.getCardList();
            String[] c1 = new String[temp[0].length];
            String[] c2 = new String[temp[0].length];
            String[] c3 = new String[temp[0].length];
            for (int i = 0; i < c1.length; i++) {
                c1[i] = temp[i][1];
                c2[i] = temp[i][0];
                c3[i] = temp[i][2];
            }
            for (int j = 0; j < c1.length; j++) {
                temp[0][j] = c1[j];
                temp[1][j] = c2[j];
                temp[2][j] = c3[j];
            }
            return temp;
        }
    }

    @Override
    public String getFinalResult(MagicalCardGameModel magicalCardGameModel) {
        String[][] temp;
        temp = magicalCardGameModel.getCardList();
        return temp[1][1];
    }
}
