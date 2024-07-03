package org.example.base;

import java.util.LinkedHashSet;
import java.util.Set;

public class testop {
    public static void main(String[] args) {

        System.out.println(removeDuplicate("Mpphhhasssiis"));

    }

    public static String removeDuplicate(String s)
    {
        Set<Character> st=new LinkedHashSet<Character>();
        StringBuilder sb=new StringBuilder();

        char[] charr= s.toCharArray();
        String result="";
        int count=0;
        for (int i = 0; i <charr.length; i++) {

            for (int j = i+1; j < charr.length; j++) {

                if(charr[i]!=charr[j])
                {
                    sb.append(charr[i]);
                    count++;
                }

            }
        }




          /*  if(st.add(s.charAt(i)))
            {
                sb.append(s.charAt(i));
            }
        }*/
        return sb.toString();
    }
}
