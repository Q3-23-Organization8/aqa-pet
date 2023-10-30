package Homework_9;

public class Paper extends GameItem {
    @Override
    public boolean beats(GameItem other) {
        return other instanceof Rock;
    }
}
