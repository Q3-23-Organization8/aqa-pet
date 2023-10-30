package Homework_9;

public class Rock extends GameItem {
    @Override
    public boolean beats(GameItem other) {
        return other instanceof Scissors;
    }
}