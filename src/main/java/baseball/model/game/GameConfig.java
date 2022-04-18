package baseball.model.game;

import baseball.model.computer.Computer;
import baseball.model.player.PlayMode;
import baseball.model.player.Player;
import baseball.model.player.ReplayMode;
import baseball.model.rule.Rule;
import baseball.view.ConsoleView;

public class GameConfig {
    protected Player player = new Player();
    protected PlayMode playMode = new PlayMode();
    protected ReplayMode replayMode = new ReplayMode();
    protected Computer computer = new Computer();
    protected Rule rule = new Rule();
    protected ConsoleView view = new ConsoleView();
}
