import java.io.*;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        System.out.println("Menu");
        System.out.println("1. List Games");
        System.out.println("2. Add Games");
        System.out.println("3. Update a Game");
        System.out.println("4. Delete a Game");
        System.out.println("5. Exit");

        Scanner in = new Scanner(System.in);
        boolean done = false;

        while (!done) {
            System.out.print("Enter Option: ");
            int option = in.nextInt();
            System.out.println();
            switch (option) {
                case 1:
                    listGames();
                    System.out.println();
                    break;
                case 2:
                    addGame();
                    System.out.println();
                    break;
                case 3:
                    updateGame();
                    System.out.println();
                    break;
                case 4:
                    deleteGame();
                    System.out.println();
                    break;
                case 5:
                    in.close();
                    done = true;
                    break;
                default:
                    System.out.println("Incorrect Option");

            }
        }

    }

    /**
     * Adds a game to a text file from user input
     */
    public static void addGame() {
        try {
            Scanner in = new Scanner(System.in);
            System.out.print("Enter the title of the game: ");
            String title = in.nextLine();

            System.out.print("Enter the genre of the game: ");
            String genre = in.nextLine();

            System.out.print("Enter the price of the game: ");
            double price = Double.parseDouble(in.nextLine());

            Game game = new Game(title, genre, price);

            try (FileWriter fileWriter = new FileWriter("games.txt", true);

                 PrintWriter writer = new PrintWriter(fileWriter)) {
                writer.println(game);

            }
        } catch (Exception e) {
            System.out.println("Error");

        }

    }

    /**
     * Prints out all the games listed from a text file
     */
    public static void listGames() {
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader("games.txt"))) {
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (Exception e) {
            System.out.println("Error");
        }
    }

    /**
     * user inputs title they want to update (incomplete)
     */
    public static void updateGame() {

        Scanner in = new Scanner(System.in);
        System.out.print("Enter Title to update: ");
        String oldTitle = in.nextLine();
        try {

            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter the new title of the game: ");
            String title = scanner.nextLine();

            System.out.print("Enter the new genre of the game: ");
            String genre = scanner.nextLine();

            System.out.print("Enter the new price of the game: ");
            double price = Double.parseDouble(scanner.nextLine());

            Game game = new Game(title, genre, price);

            try (BufferedReader bufferedReader = new BufferedReader(new FileReader("games.txt"))) {
                String line;
                while ((line = bufferedReader.readLine()) != null) {
                    if (line.contains("Title: " + oldTitle)) {

                        System.out.println("title found");
                        continue;
                    }
                }

            }
        } catch (Exception e) {
            System.out.println("Error");
        }
    }

    /**
     * user inputs title they want to delete (incomplete)
     */
    public static void deleteGame() {
        System.out.println("not implmented");

    }
}

