package ca.lambton.c0724540;

import java.util.LinkedHashMap;
import java.util.Map;

public class LambtonStringTools {

    /**
     * take a String as an argument and return the String reversed. Eg. “Lambton” would be
     * returned as “notbmaL”.
     */
    public static String reverse(String s) {

        char[] temp = new char[s.length()];
        for (int i = 0; i < s.length(); i++) {
            temp[i] = s.charAt(i);
        }

        StringBuilder result = new StringBuilder();
        for (int i = temp.length - 1; i >= 0; i--) {
            result.append(temp[i]);
        }

        return result.toString();
    }

    /**
     * -take a String as an argument and return the decimal equivalent as an integer. If any of the
     * characters are neither zero nor one return null. Eg. “1000” would return 8. “10001” would
     * return 17. “111111” would return 63.
     */
    public static Integer binaryToDecimal(String s) {
        if (s == null || s.isEmpty()) {
            return null;
        }
        return Integer.valueOf(s, 2);
    }

    /**
     * -take a String as an argument and return a properly “initialized” and capitalized name. If
     * the String does not contain exactly three names return null. Eg. “James tiBeriUs kiRK”
     * would return “J. T. Kirk”. “jean luc picard” would return “J. L. Picard”. “AaroN LANGille”
     * would return null.
     */
    public static String initials(String s) {

        char[] temp = new char[s.length()];
        for (int i = 0; i < s.length(); i++) {
            temp[i] = s.charAt(i);
        }

        int split1 = -1;
        int split2 = -1;

        for (int i = 0; i < temp.length; i++) {
            if (split1 == -1 && temp[i] == ' ') {
                split1 = i;
            } else if (split2 == -1 && temp[i] == ' ') {
                split2 = i;
            }
        }

        if (split1 == -1 || split2 == -1) {
            return null;
        } else {

            String result = "";
            boolean check1 = false;
            boolean check2 = false;
            for (int i = 0; i < temp.length; i++) {
                if (i < split1 && !check1) {
                    result = result + Character.toUpperCase(temp[i]) + ". ";
                    check1 = true;
                } else if (i == split1 + 1 && !check2) {
                    result = result + Character.toUpperCase(temp[i]) + ". ";
                    check2 = true;
                } else if (i == split2 + 1 && check1 && check2) {
                    result = result + Character.toUpperCase(temp[i]);
                } else if (i > split2 + 1 && check1 && check2) {
                    result = result + temp[i];
                }
            }

            return result + ".";
        }

    }

    /**
     * -take a String and return the Character that occurs most frequently. In the event of a tie,
     * return the last character that was checked in the tie.
     */
    public static Character mostFrequent(String s) {
        if (s == null) {
            return null;
        }

        char[] temp = new char[s.length()];
        for (int i = 0; i < s.length(); i++) {
            temp[i] = s.charAt(i);
        }

        Map<Character, Integer> checkMap = new LinkedHashMap<>();
        for (char c : temp) {
            if (checkMap.containsKey(c)) {
                checkMap.put(c, checkMap.get(c) + 1);
            } else {
                checkMap.put(c, 1);
            }
        }

        Character maxChar = null;
        Integer maxCount = 0;
        for (Character key : checkMap.keySet()) {

            // return the last character that was checked in the tie
            if (checkMap.get(key) >= maxCount) {
                maxChar = key;
                maxCount = checkMap.get(key);
            }
        }

        return maxChar;

    }

    /**
     * -take three Strings as arguments. The first String is the user’s “text”. The second String is a
     * pattern to look for.
     * Make all Strings lowercase in the method to facilitate search and replace. The third String
     * is a pattern to replace the second String with. Eg: “the dog jumped over the fence” as the
     * first String, “the” as the second and “that” as the third. Returned String is “that dog jumped
     * over that fence”.
     */
    public static String replaceSubString(String s1, String s2, String s3) {
        return s1.replaceAll(s2, s3);
    }
}
