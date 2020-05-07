import java.util.Scanner;
public class UniqueObjects {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Game[] games = new Game[3];

        for (int i = 0; i < games.length; ) {
            Game game = createGame();
            if (isUnique(game, games)) {
                games[i] = game;
                i++;
            } else {
                System.out.println("Duplikat");
            }
        }

        for (Game game : games) {
            System.out.println(game);
        }
    }

    private static boolean isUnique(Game game, Game[] games) {
        for (Game b : games) {
            if (game.equals(b))
                return false;
        }
        return true;
    }

    private static Game createGame() {
        System.out.println("Podaj nazwę: ");
        String name = scanner.nextLine();
        System.out.println("Podaj cenę gry: ");
        int prize = scanner.nextInt();
        scanner.nextLine();
        return new Game(name, prize);
    }
}