package com.lambton.magicalcardgame;
import java.util.Arrays;

public class MagicalCardGameModel extends MagicalCardGameCalculator {

    String firstShuffleColPos;
    String secShuffleColPos;
    String [][]cardList=null;
    String [][]firstShuffle=null;
    String [][]secShuffle=null;
    String guessedCard;

    public String getFirstShuffleColPos() {
        return firstShuffleColPos;
    }

    public void setFirstShuffleColPos(String firstShuffleColPos) {
        this.firstShuffleColPos = firstShuffleColPos;
    }

    public String getSecShuffleColPos() {
        return secShuffleColPos;
    }

    public void setSecShuffleColPos(String secShuffleColPos) {
        this.secShuffleColPos = secShuffleColPos;
    }

    public String[][] getCardList() {
        return cardList;
    }

    public void setCardList(String[][] cardList) {
        this.cardList = cardList;
    }

    public String[][] getFirstShuffle() {
        return firstShuffle;
    }

    public void setFirstShuffle(String[][] firstShuffle) {
        this.firstShuffle = firstShuffle;
    }

    public String[][] getSecShuffle() {
        return secShuffle;
    }

    public void setSecShuffle(String[][] secShuffle) {
        this.secShuffle = secShuffle;
    }

    public String getGuessedCard() {
        return guessedCard;
    }

    public void setGuessedCard(String guessedCard) {
        this.guessedCard = guessedCard;
    }

    @Override
    public String toString() {
        return "MagicalCardGameModel{" +
                "firstShuffleColPos='" + firstShuffleColPos + '\'' +
                ", secShuffleColPos='" + secShuffleColPos + '\'' +
                ", cardList=" + Arrays.deepToString(cardList) +
                ", firstShuffle=" + Arrays.deepToString(firstShuffle) +
                ", secShuffle=" + Arrays.deepToString(secShuffle) +
                ", guessedCard='" + guessedCard + '\'' +
                '}';
    }
}
