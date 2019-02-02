package com.lambton.magicalcardgame;

public class MagicalCardGameCalculator implements IMagicalCardGame {

    @Override
    public String[][] getFirstShuffleResult(MagicalCardGameModel magicalCardGameModel) {
        String[][] temp;
        temp = magicalCardGameModel.getCardList();
        String[] c1 = new String[temp[0].length];
        String[] c2 = new String[temp[0].length];
        String[] c3 = new String[temp[0].length];

        if (magicalCardGameModel.getFirstShuffleColPos().equalsIgnoreCase("c3")) {
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
        } else if (magicalCardGameModel.getFirstShuffleColPos().equalsIgnoreCase("c1")) {
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
        } else {
            return new String[0][];
        }
    }

    @Override
    public String[][] getSecShuffleResult(MagicalCardGameModel magicalCardGameModel) {
        String[][] tempArr;
        tempArr = magicalCardGameModel.getCardList();
        String[] c1 = new String[tempArr[0].length];
        String[] c2 = new String[tempArr[0].length];
        String[] c3 = new String[tempArr[0].length];

        if (magicalCardGameModel.getSecShuffleColPos().equalsIgnoreCase("c3")) {
            for (int i = 0; i < c1.length; i++) {
                c1[i] = tempArr[i][1];
                c2[i] = tempArr[i][2];
                c3[i] = tempArr[i][0];
            }
            for (int j = 0; j < c1.length; j++) {
                tempArr[0][j] = c1[j];
                tempArr[1][j] = c2[j];
                tempArr[2][j] = c3[j];
            }
            return tempArr;
        } else if (magicalCardGameModel.getSecShuffleColPos().equalsIgnoreCase("c2")) {
            for (int i = 0; i < c1.length; i++) {
                c1[i] = tempArr[i][0];
                c2[i] = tempArr[i][1];
                c3[i] = tempArr[i][2];
            }
            for (int j = 0; j < c1.length; j++) {
                tempArr[0][j] = c1[j];
                tempArr[1][j] = c2[j];
                tempArr[2][j] = c3[j];
            }
            return tempArr;
        } else if (magicalCardGameModel.getSecShuffleColPos().equalsIgnoreCase("c1")) {
            for (int i = 0; i < c1.length; i++) {
                c1[i] = tempArr[i][1];
                c2[i] = tempArr[i][0];
                c3[i] = tempArr[i][2];
            }
            for (int j = 0; j < c1.length; j++) {
                tempArr[0][j] = c1[j];
                tempArr[1][j] = c2[j];
                tempArr[2][j] = c3[j];
            }
            return tempArr;
        } else {
            return new String[0][];
        }
    }

    @Override
    public String getFinalResult(MagicalCardGameModel magicalCardGameModel) {
        String[][] temp;
        temp = magicalCardGameModel.getCardList();
        return temp[1][1];
    }
}
