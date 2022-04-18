package baseball.model.player;

public class Player {
    private String value;
    private GameState mode;

    public void setMode(GameState mode) {
        this.mode = mode;
    }

    public String getValue() {
        return value;
    }

    public void input() {
        this.value = mode.input();
    }
}
