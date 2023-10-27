public class Game {
    private final String title;
    private final String genre;
    private final double price;

    public Game(String title, String genre, double price) {
        this.title = title;
        this.genre = genre;
        this.price = price;
    }

    public String toString() {
        return "Title: " + title + ", Genre: " + genre + ", Price: " + price;
    }
}
