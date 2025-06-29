package com.nitesh.trackmymedia;

import java.util.Scanner;

import com.nitesh.trackmymedia.manager.ProgressManager;
import com.nitesh.trackmymedia.storage.FileManager;
import com.nitesh.trackmymedia.implementations.Anime;
import com.nitesh.trackmymedia.implementations.Book;
import com.nitesh.trackmymedia.implementations.Series;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ProgressManager manager = new ProgressManager(new FileManager());
        manager.load();

        System.out.println("Welcome to TrackMyMedia!");
        System.out.println("Type `menu` to see available commands.\n");

        while(true) {
            System.out.print("> ");
            String command = sc.nextLine().trim().toLowerCase();

            switch(command) {
                case "menu":
                case "help":
                    printMenu();
                    break;

                case "add": 
                    handleAdd(sc, manager);
                    break;

                case "update":
                    handleUpdate(sc, manager);
                    break;

                case "show":
                    manager.showAllProgress();
                    break;

                case "exit":
                    System.out.println("Goodbye");
                    System.exit(0);
                    break;

                default:
                    System.out.println("Unknown command. Type `menu` to see options.");

            }
        }
    }

    public static void printMenu() {
        System.out.println("Available Commands:");
        System.out.println(" add       - Add new media");
        System.out.println(" update    - Update progress");
        System.out.println(" show      - Show all tracked items");
        System.out.println(" exit      - Exit the app");

    }

    public static void handleAdd(Scanner sc, ProgressManager manager) {
        System.out.println("Add what? (book / anime / series): ");
        String type = sc.nextLine().trim().toLowerCase();
        String title;


        switch (type) {
            case "book":
            System.out.println("Enter title: ");
            title = sc.nextLine();
            System.out.print("Current Page: ");
            int currentPage = Integer.parseInt(sc.nextLine());
            System.out.print("Total Page: ");
            int totalPage = Integer.parseInt(sc.nextLine());
            manager.addItem(new Book(title, totalPage, currentPage));
            break;

            case "anime":
            System.out.println("Enter title: ");
            title = sc.nextLine();
            System.out.print("Season (or 0 if none): ");
            int aSeason = Integer.parseInt(sc.nextLine());
            System.out.print("Current Episode: ");
            int aCurrentEpisode = Integer.parseInt(sc.nextLine());
            System.out.print("Total Episode: ");
            int aTotalEpisode = Integer.parseInt(sc.nextLine());
            manager.addItem(new Anime(title, aSeason == 0 ? null: aSeason, aTotalEpisode, aCurrentEpisode));
            break;

            case "series":
            System.out.println("Enter title: ");
            title = sc.nextLine();
            System.out.print("Season (or 0 if none): ");
            int sSeason = Integer.parseInt(sc.nextLine());
            System.out.print("Current Episode: ");
            int sCurrentEpisode = Integer.parseInt(sc.nextLine());
            System.out.print("Total Episode: ");
            int sTotalEpisode = Integer.parseInt(sc.nextLine());
            manager.addItem(new Series(title, sSeason == 0 ? null: sSeason, sTotalEpisode , sCurrentEpisode));
            break;

            default:
            System.out.println("Unsupported Media Type!");
        }

    }

    public static void handleUpdate(Scanner sc, ProgressManager manager) {
        System.out.print("Enter number to update: ");
        int id = Integer.parseInt(sc.nextLine());
        System.out.print("Enter new progress: ");
        int progress = Integer.parseInt(sc.nextLine());
        manager.updateItem(id, progress);
    }
}

