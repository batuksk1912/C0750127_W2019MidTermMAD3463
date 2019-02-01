package com.lambton.magicalcardgame;

public class MagicalCardGameCalculator implements IMagicalCardGame {

    @Override
    public String[][] getFirstShuffleResult(MagicalCardGameModel magicalCardGameModel) {
        if (magicalCardGameModel.getFirstShuffleColPos().equalsIgnoreCase("c3")) {
            String[][] temp = new String[3][3];
            temp = magicalCardGameModel.getCardList();
            Object[] column = new String[temp[0].length];
            for(int i=0; i<column.length; i++){
                column[i] = temp[i][2];
            }
            return column ;

        } else if (magicalCardGameModel.getFirstShuffleColPos().equalsIgnoreCase("c2")) {

        } else {

        }
        return new String[0][];
    }

    @Override
    public String[][] getSecShuffleResult(MagicalCardGameModel magicalCardGameModel) {
        return new String[0][];
    }

    @Override
    public String getFinalResult(MagicalCardGameModel magicalCardGameModel) {
        return null;
    }
}
