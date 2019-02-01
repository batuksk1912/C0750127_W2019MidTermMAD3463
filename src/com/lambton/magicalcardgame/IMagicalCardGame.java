package com.lambton.magicalcardgame;

public interface IMagicalCardGame {

    /**
     * This function returns the first shuffled
     result based on the given criteria. */
    public String[][] getFirstShuffleResult(MagicalCardGameModel magicalCardGameModel);
    /**

     * This function returns the second
     shuffled result based on the given criteria. */
    public String[][] getSecShuffleResult(MagicalCardGameModel magicalCardGameModel);
    /**

     * This function returns the final result. */
    public String getFinalResult(MagicalCardGameModel magicalCardGameModel);

}

