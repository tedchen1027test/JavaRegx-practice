package edu.ndhu.regexpDemo; /**
 * Created by tedc on 10/15/14.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class RegexTestHarness {

    public static void main(String[] args) {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String strLine = null;
        try {
            while (true) {

                System.out.println("%nEnter your regex: ");
                Pattern pattern =
                        Pattern.compile(in.readLine());

                System.out.println("Enter input string to search: ");
                Matcher matcher =
                        pattern.matcher(in.readLine());

                boolean found = false;
                int i = 0;
                while (matcher.find()) {
                    System.out.format("I found the text match %d" +
                                    " groupcount %d" +
                                    " \"%s\" starting at " +
                                    "index %d and ending at index %d.%n",
                            i++,
                            matcher.groupCount(),
                            matcher.group("id"),
                            matcher.start(),
                            matcher.end());
                    found = true;
                }
                if (!found) {
                    System.out.format("No match found.%n");
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
