package Homework_9;

public class Scissors extends GameItem {
    @Override
    public boolean beats(GameItem other) {
        return other instanceof Paper;
    }
}