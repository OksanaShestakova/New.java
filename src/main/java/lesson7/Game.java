package lesson7;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Game {
    public enum GameType {
        SOCCER, HOCKEY, RUGBY
    }

    public static void writeNumOfPlayersPerTeam(GameType game) {
        int numOfPlayersPerTeam;
        String fileName = game.name().toLowerCase() + ".txt";

        switch (game) {
            case SOCCER:
                numOfPlayersPerTeam = 11;
                break;
            case HOCKEY:
                numOfPlayersPerTeam = 6;
                break;
            case RUGBY:
                numOfPlayersPerTeam = 15;
                break;
            default:
                return;
        }

        try {
            File file = new File(fileName);
            FileWriter writer = new FileWriter(file);
            writer.write(Integer.toString(numOfPlayersPerTeam));
            writer.close();

            // Delete the file after writing
            if (file.delete()) {
                System.out.println("File deleted successfully.");
            } else {
                System.out.println("Failed to delete the file.");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
/*
import java.io.File;

import java.io.FileWriter;
import java.io.IOException;

public class Game {
    public enum GameType {
        SOCCER,
        HOCKEY,
        RUGBY
    }

    public static void writeNumOfPlayersPerTeam(GameType type) {
        int numOfPlayers = 0;
        String fileName = null;

        switch (type) {
            case SOCCER:
                numOfPlayers = 11;
                fileName = "Soccer.txt";
                break;
            case HOCKEY:
                numOfPlayers = 6;
                fileName = "Hockey.txt";
                break;
            case RUGBY:
                numOfPlayers = 15;
                fileName = "Rugby.txt";
                break;
        }

        try {
            FileWriter writer = new FileWriter(fileName);
            writer.write(String.valueOf(numOfPlayers));
            writer.close();
            System.out.println("File created: " + fileName);

        } catch (IOException e) {
            System.err.println("Error creating file: " + e.getMessage());
        }
        }
    }
}
*/
