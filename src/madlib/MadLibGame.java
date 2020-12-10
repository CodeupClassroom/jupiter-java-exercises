package madlib;

public class MadLibGame {

    private static void outputWelcome() {
        IoUtils.output("Welcome to the Mad Lib game!");
        IoUtils.output("The first step is to create a Mad Lib. You will be prompted to enter a few things to do this.");
    }

    private static MadLib generateMadLib() {
        return MadLibUtils.createMadLib(
                "Please enter a sentence with three words missing. You should use a single underscore for each missing word...",
                "Please enter a word or phrase type for the first missing word...",
                "Please enter another word or phrase type for the second missing word...",
                "Please enter a final word or phrase type for the third missing word...");
    }

    private static void outputMadLibDetails(MadLib ml) {
        IoUtils.output("The Mad Lib you created has the following structure...");
        IoUtils.output(ml.getMadLibSummary());
    }

    private static MadLibAnswer generateUserMadLib(MadLib ml) {
        IoUtils.output("Now that a Mad Lib has been created, try out silly answers!");
        return MadLibUtils.fillInMadLib(ml);
    }

    private static void outputUserMadLib(MadLibAnswer mla) {
        IoUtils.output(mla.returnUserVersion());
    }

    private static void outputClosingMsg() {
        IoUtils.output("\nThat was crazy!");
    }

    private static void run() {
        outputWelcome();
        MadLib ml = generateMadLib();
        outputMadLibDetails(ml);
        MadLibAnswer mla = generateUserMadLib(ml);
        outputUserMadLib(mla);
        outputClosingMsg();
    }

    public static void main(String[] args) {
        run();
    }

}
