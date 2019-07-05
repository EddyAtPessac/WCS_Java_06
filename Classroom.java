package com.WildCodeSchool;
//import com.WildCodeSchool.Wilder;

public class Classroom {


    public static void main(String[] args) {
        // Define some Wilders students and present them
        Wilder ourClass[];
        ourClass = new Wilder[] {
                new Wilder("Jean-claude",true),
                new Wilder("Henry",false),
                new Wilder("Nestor",true),
                new Wilder("Zigy",false),
                new Wilder("Schmoll", true),
                new Wilder("Geraldine",true)
        };

        for (Wilder student : ourClass) {
            System.out.println(student.whoAmI());
        } // for wilder

    } // main
} // Classroom
