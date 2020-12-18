package fileIo;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FileReader {

    // properties for this class
    //  goal: read in a file and parse through it
    private String directoryName;  // i.e. 'data', 'src/fileIo'
    private String fileName;       // i.e. 'day18.txt', 'jolts.txt'
    private String logFileName;    // will hold logging info
    private Path directoryPath;    // Path representation of the parent directory for our files
    private Path filePath;   // Path representation for the actual file itself
    private Path logFilePath; // Path representation of the log file
    private List<String> fileLines; // Holding spot for the content inside of the data file itself
    private List<String> logFileLines; // Holding spot for the content inside of the log file


    // Constructor
    //  Want to send in a directory path name and a file name, logFile name, and generate EVERYTHING from just those two values
    public FileReader(String directoryName, String fileName, String logFileName) throws IOException {
        this.directoryName = directoryName;
        this.fileName = fileName;
        this.logFileName = logFileName;
        // Instantiating Path values
        this.directoryPath = Paths.get(directoryName); // Paths.get("data")
        this.filePath = Paths.get(directoryName, fileName);
        this.logFilePath = Paths.get(directoryName, logFileName);

        // Check if files exist, and create them if they don't currently exist
        // Log File
        if (Files.notExists(this.logFilePath)) {
            try {
                Files.createFile(this.logFilePath);
            } catch (IOException e) {
                // Store this exception message in the log file
                // if there is an issue creating the log file, let's just crash the whole party and throw an IOException
                throw new IOException("Unable to create the logfile (" + this.logFileName + ")!");
            }
        }

        // Directory for data file ('data'), ('src/fileIo')
        if (Files.notExists(this.directoryPath)) {
            try {
                Files.createDirectories(this.directoryPath); // createDirectories will create any missing parent directories along with the enclosing directory
            } catch (IOException e) {
                // Add this error message to the log
                // Files.write(Path filePath, List<String> message(s), appendOption)
                // could initialize a List<String> like this, and send it in as the second argument in the Files.write() method
                // List<String> errorMessage = new ArrayList<>();
                // errorMessage.add(e.getMessage());

                Files.write(this.logFilePath, Arrays.asList(e.getMessage()), StandardOpenOption.APPEND); // append to the end of the log file
                throw new IOException("Unable to create the data directory (" + this.directoryName + ")!");
                // stop all execution
            }
        }

        // Data File ('day18.txt')
        if (Files.notExists(this.filePath)) { // i.e. 'src/day18.txt'
            // if we've made into this if statement, that means the file DOES NOT exist, so let's create it!
            try {
                Files.createFile(this.filePath);
            } catch (IOException e) {
                Files.write(this.logFilePath, Arrays.asList(e.getMessage()), StandardOpenOption.APPEND); // append to the end of the log file
                throw new IOException("Unable to create the data file (" + this.fileName + ")!");
            }
        }


        // Test if the instantiation worked
        System.out.println(filePath); // display the file path for the passed in arguments
        this.fileLines = Files.readAllLines(this.filePath); // gives me every line in (i.e. 'day18.txt' as a String, inside of a List<String>

    }

    // PSVM (you can think of this as being 20 files away from this file - it is STATIC
    public static void main(String[] args) throws IOException {
        // Instantiate a FileReader object, and see if it works
        FileReader day18Reader = new FileReader("data", "day18.txt", "day18.log");
        day18Reader.writeToLog("Successfully read the " + day18Reader.getFileName() + " file!");

        // Set up a new instance to access the jolts.txt file
        FileReader joltsReader = new FileReader("src/fileIo", "jolts.txt", "jolts.log");
        joltsReader.writeToLog("Successfully read the " + joltsReader.getFileName() + " file!");

        System.out.println("Day18 file, here's the first line:");
        System.out.println(day18Reader.getFileLines().get(0));

        System.out.println("Jolts file, here's the first line:");
        System.out.println(joltsReader.getFileLines().get(0));
    }


    // Custom Method - want to be able to easily write a message to the log, without some enormous nested function calling nonsense
    public void writeToLog(String message) throws IOException {
        try {
            // write the string 'message' to the log file of THIS INSTANCE of a FileReader object
            Files.write(this.logFilePath, Arrays.asList(message), StandardOpenOption.APPEND);
        } catch(IOException e) {
            Files.write(this.logFilePath, Arrays.asList(e.getMessage()), StandardOpenOption.APPEND);
            throw new IOException("Unable to write custom message to log file");
        }
    }



    // Getters and Setters
    public String getDirectoryName() {
        return directoryName;
    }

    public void setDirectoryName(String directoryName) {
        this.directoryName = directoryName;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getLogFileName() {
        return logFileName;
    }

    public void setLogFileName(String logFileName) {
        this.logFileName = logFileName;
    }

    public Path getDirectoryPath() {
        return directoryPath;
    }

    public void setDirectoryPath(Path directoryPath) {
        this.directoryPath = directoryPath;
    }

    public Path getFilePath() {
        return filePath;
    }

    public void setFilePath(Path filePath) {
        this.filePath = filePath;
    }

    public Path getLogFilePath() {
        return logFilePath;
    }

    public void setLogFilePath(Path logFilePath) {
        this.logFilePath = logFilePath;
    }

    public List<String> getFileLines() {
        return fileLines;
    }

    public void setFileLines(List<String> fileLines) {
        this.fileLines = fileLines;
    }

    public List<String> getLogFileLines() {
        return logFileLines;
    }

    public void setLogFileLines(List<String> logFileLines) {
        this.logFileLines = logFileLines;
    }
}
