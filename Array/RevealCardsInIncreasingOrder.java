package Array;

import java.util.Arrays;

class RevealCardsInIncreasingOrder {
    public static int[] deckRevealedIncreasing(int[] deck) {
        if(deck.length == 0){
            return null;
        } else if(deck.length == 1) {
            return deck;
        }
        Arrays.sort(deck);
        int[] result = new int[deck.length];
        for(int i=0; i < deck.length; i=i+2){
            result[i] = deck[i/2];
            if((i+1)<deck.length) {
                result[i+1] = deck[deck.length - i/2 - 1];
            }
        }
        return result;
    }
    public static void main(String[] args) {
        int[] deck = {17,13,11,2,3,5,7}; 
        int[] result = deckRevealedIncreasing(deck);
        result.toString();
    }
}