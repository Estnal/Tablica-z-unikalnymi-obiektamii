import java.util.Objects;
class Game {
    private String name;
    private int prize;

    public Game(String title, int pages) {
        this.name = title;
        this.prize = pages;
    }

    public String getName() {
        return name;
    }

    public void setName(String title) {
        this.name = title;
    }

    public int getPrize() {
        return prize;
    }

    public void setPrize(int prize) {
        this.prize = prize;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Game game = (Game) o;
        return prize == game.prize &&
                Objects.equals(name, game.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, prize);
    }

    @Override
    public String toString() {
        return "Game{" +
                "name='" + name + '\'' +
                ", prize=" + prize +
                '}';
    }
}