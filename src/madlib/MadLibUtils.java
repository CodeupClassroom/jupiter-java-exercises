package madlib;

class MadLibUtils {

    private static String getSentence(String prompt) {
        IoUtils.output(IoUtils.nullCoalesceStr(prompt, "Please enter a sentence for the Mad Lib..."));
        return IoUtils.getScanner().nextLine();
    }

    private static String getWordType(String prompt) {
        IoUtils.output(IoUtils.nullCoalesceStr(prompt, "Please enter a word..."));
        return IoUtils.getScanner().nextLine();
    }

    private static String getWord( String prompt, String type) {
        IoUtils.output(IoUtils.nullCoalesceStr(prompt, "Please enter a word matching the following description: ") + type + "...");
        return IoUtils.getScanner().nextLine();
    }

    static MadLib createMadLib(String senPrompt, String wordType1Prompt, String wordType2Prompt, String wordType3Prompt) {
        String sentence = getSentence(senPrompt);
        String wordType1 = getWordType(wordType1Prompt);
        String wordType2 = getWordType(wordType2Prompt);
        String wordType3 = getWordType(wordType3Prompt);
        return new MadLib(sentence, wordType1, wordType2, wordType3);
    }

    static MadLibAnswer fillInMadLib(MadLib ml) {
        String word1 = getWord(null, ml.getWordType1());
        String word2 = getWord(null, ml.getWordType2());
        String word3 = getWord(null, ml.getWordType3());
        return new MadLibAnswer(word1, word2, word3, ml);
    }

}
