public class Game {
    private String title;
    private String genre;
    private double price;

    public Game(String title, String genre, double price) {
        this.title = title;
        this.genre = genre;
        this.price = price;
    }

    public String toString() {
        return "Title: " + title + ", Genre: " + genre + ", Price: " + price;
    }
}
