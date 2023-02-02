public class Main {
    public static void main(String[] args) {
        Game game = new Game(9, "start", 50);
        System.out.println(game);
        GameStorage gameStorage = new GameStorage();
        gameStorage.setSavedVersion(game.saveGame());
        game.setLevel(6);
        game.setNameVersion("start");
        game.setTimeOfGame(100);
        System.out.println(game);
        game.loadGame(gameStorage);
        System.out.println(game);

    }
}