package com.company;

public class Main
{
    public static void main(String[] args)
    {
	    // use sequential search to find Charlie's grade
        String [] students = {"Alissa", "Ben", "Charlie", "Dianna"};
        String [] grades = {"B", "D", "B", "A"};
        String key = "Charlie";

        boolean found = false;

        for (int i = 0; i < students.length && !found; i++)
        {
            if (key.equals (students[i]))
            {
                found = true;
                System.out.println (students[i] + "'s grade is " + grades[i]);
            }

        }
    }
}
