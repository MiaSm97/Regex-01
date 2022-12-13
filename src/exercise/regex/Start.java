package exercise.regex;

public class Start {
    public static void main(String[] args) {

        String string = "I Like to code near the Lake with my friend Luke";
        System.out.println(string.replaceAll("(?:Li|La)ke","BLA"));

    }
}
    /*You have a string with the following value: I Like to code near the Lake with my friend Luke
        with a regular expression, change into BLA all occurrences of words that start with an l and end with a ke, except your friend
        print the result*/