package Homework_9;

public enum Choice {
    ROCK(new Rock()), SCISSORS(new Scissors()), PAPER(new Paper());

    private final GameItem gameItem;

    Choice(GameItem gameItem) {
        this.gameItem = gameItem;
    }

    public GameItem getGameItem() {
        return gameItem;
    }
}