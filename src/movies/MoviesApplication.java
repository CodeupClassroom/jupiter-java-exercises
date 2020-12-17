package movies;


import util.Input;

public class MoviesApplication {
    public static void main(String[] args) {
        init();
    }

    private static void init() {
        MoviesApplication app = new MoviesApplication();
        app.run();
    }

    private void run() {
        displayStartMessage();
        boolean running = true;
        while(running) {
            int choice = promptUserForChoice();
            running = executeUserChoice(choice);
        }
    }

    private boolean executeUserChoice(int choice) {
        boolean continueRunningApp = true;
        switch(choice) {
            case 0:
                continueRunningApp = false;
                endApp();
                break;
            case 1:
                viewAllMovies();
                break;
            case 2:
                viewMoviesByCategory("animated");
                break;
            case 3:
                viewMoviesByCategory("drama");
                break;
            case 4:
                viewMoviesByCategory("horror");
                break;
            case 5:
                viewMoviesByCategory("scifi");
                break;
        }
        return continueRunningApp;
    }

    private void endApp() {
        System.out.println("Thank you for using this movie application!!");
        System.out.println("GOODBYE!");
    }

    private void viewAllMovies() {
        displayMovies(MoviesArray.findAll());
        System.out.println(returnMenuDisplay());
    }

    private void viewMoviesByCategory(String category) {
        Movie[] allMovies = MoviesArray.findAll();
        Movie[] filteredMovies;
        int filteredMoviesCount = 0;
        for (Movie movie : allMovies) {
            if (movie.getCategory().equalsIgnoreCase(category)) {
                filteredMoviesCount++;
            }
        }
        filteredMovies = new Movie[filteredMoviesCount];
        int i = 0;
        for (Movie movie : allMovies) {
            if (movie.getCategory().equalsIgnoreCase(category)) {
                filteredMovies[i] = movie;
                i++;
            }
        }

        displayMovies(filteredMovies);

        System.out.println(returnMenuDisplay());
    }

    private void displayMovies(Movie[] movies) {
        System.out.println("\n");
        for (Movie movie : movies) {
            System.out.printf("%s -- %s\n", movie.getName(), movie.getCategory());
        }
        System.out.println("\n");
    }

    private void displayStartMessage() {
        String output = "=========== Welcome to the Movie Application!!! ===========\n\n";
        output += returnMenuDisplay();
        System.out.println(output);
    }

    private String returnMenuDisplay() {
        String output = "What would you like to do?\n\n";
        output += "0 - exit\n";
        output += "1 - view all movies\n";
        output += "2 - view movies in the animated category\n";
        output += "3 - view movies in the drama category\n";
        output += "4 - view movies in the horror category\n";
        output += "5 - view movies in the scifi category\n";
        return output;
    }

    private int promptUserForChoice() {
        Input in = new Input();
        return in.getInt(0, 5, "Enter your choice: ");
    }


}
