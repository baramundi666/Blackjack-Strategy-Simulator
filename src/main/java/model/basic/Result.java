package model.basic;

public enum Result {
    WIN, LOSE, PUSH, BLACKJACK;

    @Override
    public String toString() {
        return switch(this){
            case WIN -> "WIN";
            case LOSE -> "LOSE";
            case PUSH -> "PUSH";
            case BLACKJACK -> "BLACKJACK";
        };
    }
}