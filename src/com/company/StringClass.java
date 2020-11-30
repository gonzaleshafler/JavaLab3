package com.company;


import java.util.Arrays;
import java.util.Scanner;

public class StringClass {
     private String string;

     public void setString(String string)
     {
         this.string=string;
     }

    public String getString() {
        return string;
    }

    public void input()
    {
        Scanner input=new Scanner(System.in);
        String string=input.nextLine();
        this.setString(string);
    }
    public void processString()
    {
        StringBuilder stringBuilder=new StringBuilder(string);
        for (int i=0;i<stringBuilder.length()-1;i++)
        {

            if (stringBuilder.charAt(i)=='p'||stringBuilder.charAt(i)=='P')
            {
                if (i+2<stringBuilder.length())
                if (stringBuilder.charAt(i+1)=='a'&&Character.isLetter(stringBuilder.charAt(i+2)))
                {
                    stringBuilder.setCharAt(i+1,'o');
                }
                else if (stringBuilder.charAt(i+1)=='A'&&Character.isLetter(stringBuilder.charAt(i+2)))
                {
                    stringBuilder.setCharAt(i+1,'O');
                }
            }
        }
        System.out.println(string);

        string=stringBuilder.toString();

    }

    public void processString2()
    {
        char[] firstChar=new char[]{'A','a'};
        char[] secondChar=new char[]{'O','o'};
        StringBuilder stringBuilder = new StringBuilder(string+"\00");
        for (int i=1;i<string.length();i++)
        {
            for (int j=0;j<firstChar.length;j++)
            {
                if (stringBuilder.charAt(i)==firstChar[j] &&
                        (stringBuilder.charAt(i-1)=='p'||stringBuilder.charAt(i-1)=='P') &&
                        Character.isLetter(stringBuilder.charAt(i+1)))
                {
                    stringBuilder.setCharAt(i,secondChar[j]);
                    break;

                }
            }
        }
        string=stringBuilder.toString();
    }



}
