public class SavedVersion {
    private final int  level;
    private final String nameVersion;
    private final int timeOfGame;

    public SavedVersion(Game game) {
        this.level =game.getLevel();
        this.nameVersion= game.getNameVersion();
        this.timeOfGame = game.getTimeOfGame();
    }

    public int getLevel() {
        return level;
    }

    public String getNameVersion() {
        return nameVersion;
    }

    public int getTimeOfGame() {
        return timeOfGame;
    }
}
