package org.example.JavaPractice.Numbers;

import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

public class StringProgram {
    public static void main(String[] args) {
        System.out.println(reverseAString("Souradeep"));
        System.out.println(removeRepeatedDuplicate("Mpphhhasssiis"));
        System.out.println(reverseNumber(5551238));
        System.out.println(removeDuplicates("Souradeep"));
        System.out.println(getCharacterOccurrences("Souradeep"));
        System.out.println(getDigitFromString("Souradeep1234"));
        System.out.println(getTheCountOfVowelConsonantsDigitsSpace("Souradeep1234","digit"));
        System.out.println(getTheCountOfVowelConsonantsDigitsSpace("Souradeep1234","vowel"));
        System.out.println(getTheCountOfVowelConsonantsDigitsSpace("Souradeep1234","consonant"));
        System.out.println(getTheCountOfVowelConsonantsDigitsSpace("Souradeep1234","space"));

    }

    public static String removeRepeatedDuplicate(String s)
    {
        char previousChar=s.charAt(0);
        StringBuilder sb=new StringBuilder();
        sb.append(previousChar);
        for (int i = 1; i < s.length(); i++) {
            char currentChar=s.charAt(i);
            if(previousChar!=currentChar)
            {
                sb.append(currentChar);
                previousChar=currentChar;
            }

        }
        return sb.toString();
    }

    /**
     * String Reverse
     *
     * @param s
     * @return
     */
    public static String reverseAString(String s) {
        String reverse = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            reverse = reverse + s.charAt(i);
        }
        return reverse;
    }

    /**
     * Get the digit
     * @param s
     * @return
     */
    public static String getDigitFromString(String s) {
        String digString = "";
        for (int i = 0; i <= s.length()-1; i++) {
            if (Character.isDigit(s.charAt(i))) {
                digString = digString + s.charAt(i);
            }
        }
        return digString;

    }

    public static int getTheCountOfVowelConsonantsDigitsSpace(String s,String typeToGet)
    {
        int v=0;
        int c=0;
        int d=0;
        int sp=0;

       String st= s.toLowerCase();
        for (int i = 0; i <= st.length()-1; i++) {
            char ch=st.charAt(i);
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
            {
                ++v;
            } else if ((ch>='a'&& ch<='z')) {
                ++c;
            }
            else if ((ch>='0'&& ch<='9')) {
                ++d;
            }
            else if ((ch==' ')) {
                ++sp;
            }

        }
        int count = 0;
        if(typeToGet.equals("vowel"))
        {
            count= v;
        } else if (typeToGet.equals("consonant")) {
            count= c;
        }
        else if (typeToGet.equals("digit")) {
            count= d;
        }
        else if (typeToGet.equals("space")) {
            count= sp;
        }

return count;
    }

    public static String removeDuplicates(String input) {
        Set<Character> seen = new LinkedHashSet<>();
        StringBuilder output = new StringBuilder();

        for (char ch : input.toCharArray()) {
            if (seen.add(ch)) {
                output.append(ch);
            }
        }

        return output.toString();
    }

    public static Map<Character, Integer> getCharacterOccurrences(String input) {
        Map<Character, Integer> charCountMap = new HashMap<>();

        for (char ch : input.toCharArray()) {
            charCountMap.put(ch, charCountMap.getOrDefault(ch, 0) + 1);
        }

        return charCountMap;
    }

    public static int reverseNumber(int number) {
        int reversed = 0;

        while (number != 0) {
            int digit = number % 10;
            reversed = reversed * 10 + digit;
            number /= 10;
        }

        return reversed;
    }
}


