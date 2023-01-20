package behavioral.template;

public class Main {
    public static void main(String[] args) {
        Game game = new Football();

        Game game2 = new Basketball();

        game.play();
        game2.play();
    }
}
