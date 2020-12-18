# Order of FileReader Class Creation

### Paths
1. Create a **directory** string property
1. Create a **filename** string property
1. Create a **logfileName** string property
1. Initialize the path for our file

### Getters and Setters
1. We can use the IntelliJ shortcut to create these

### Constructor
We'll be using the following methods in our constructor
1. **Paths**.get
1. **Files**.notExists
1. **Files**.createFile
1. **Files**.createDirectories
1. **Files**.write
1. **Files**.readAllLines

### Special Logging Method
I also want a method that will log any string I send in to the log file.

### Test it all out (PSVM)
Finally, just need to test it all out with a `public static void main() { ...`