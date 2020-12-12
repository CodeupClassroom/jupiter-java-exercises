public class StringLecture {

    public static void main(String[] args) {

// ------ .equals(String anotherString)

//        String one = "bob";
//        String two = "bob";

//        System.out.println(one.equals(two));

//        System.out.println("bob".equals("steve"));
//        System.out.println(one.equals(two));



// ------ .equalsIgnoreCase(String anotherString)

//        String greeting1 = "howdy";
//        String greeting2 = "howdy";
//        String greeting3 = "howdy";
//
//        // greeting1 has to match with greeting2 and greeting 3
//
//        if (greeting1.equals(greeting2) && greeting1.equals(greeting3)) {
//
//        }


//        greeting.equals(greeting);
//        System.out.println(greeting.equalsIgnoreCase("HoWDy"));
//

// ------ .startsWith(String prefix)

//        String title = "Dracula";
//        boolean isADoctor = title.toUpperCase().startsWith("DR.");
//        System.out.println(isADoctor);
//        System.out.println(title);


// ------ .endsWith(String suffix)

//        String travisParkAddress = "311 E Travis St, San Antonio, TX 78205";
//        String codeUpZip = "78205";
//        boolean sameZipAsCodeup = travisParkAddress.endsWith(codeUpZip);
//
//        System.out.println(sameZipAsCodeup);


// ------ .charAt(int index)
        // consider that this method returns a char type and not a String type

//        boolean firstLetterCapitalized = false;
//        String word = "test";
//
//        char firstLetter = word.charAt(0);
//
//        if (firstLetter == Character.toUpperCase(firstLetter)) {
//            firstLetterCapitalized = true;
//        }
//
//        System.out.println(firstLetterCapitalized);


// ------ .indexOf(String subString)

//        String cat = "cat";
//        System.out.println(cat.indexOf("at"));


// ------ .lastIndexOf(String subString)

//        String good = "Good";
//        System.out.println(good.indexOf("o"));


// ------ .length()

//        String longestWord = "pneumonoultramicroscopicsilicovolcanoconiosis";
//        System.out.println(longestWord.length());


// ------ .replace(char oldChar, char newChar)

//        String search = "tiny cats looking cute";
//        String parsedSearch = search.replace("cats", "dogs");
//        System.out.println(parsedSearch);
//        System.out.println(search);


// ------ .substring(int beginIndex[, int endIndex])

//        String name = "Justin Bob Reich";
//        System.out.println(name.substring(3));

//        System.out.println(name.lastIndexOf("i"));
//        System.out.println(name.indexOf(" "));
//        name.substring(0, 3);
//        System.out.println(name.substring(0, 3));
//        System.out.println(name.indexOf(" "));
//        String firstName = name.substring(0, 6);

//        System.out.println(firstName);


//        String lastName = name.substring(name.lastIndexOf(" ") + 1);
//        System.out.println(firstName);
//        System.out.println(lastName);

//        String name = "Justin Reich";
//        String firstName = name.substring(0, name.indexOf(" "));
//        System.out.println(firstName);
//        String lastName = name.substring(firstName.length() + 1);
//        System.out.println(lastName);


// ------ .toLowerCase() and .toUpperCase()

//        String hello = "hELlo";
//        System.out.println(hello.toUpperCase());
//        System.out.println(hello.toLowerCase());
//        System.out.println(hello);


// ------ .trim()

//        String input = "   bob      smith \n\n  ";
//        String trimmedInput = input.trim();
//        System.out.println(trimmedInput);
//
//        System.out.print("|" + input + "|");


// ------ chaining string methods

// convert word to pig latin word (assume word doesn't begin with a vowel or end in ay)

//    String word1 = "cat";
//    String pigLatinWord = word1
//        .trim() // "cat"
//        .toLowerCase() // "cat"
//        .substring(1) // "at"
//        .concat(word1.substring(0, 1).toLowerCase()) // "atc"
//        .concat("ay"); // "atcay"
//    System.out.println(pigLatinWord);



    }

}

