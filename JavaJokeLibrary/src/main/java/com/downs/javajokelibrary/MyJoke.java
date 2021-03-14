package com.downs.javajokelibrary;

public class MyJoke {


    public String getJoke() {

        String[] allJokes = {"Joke A      Punch Line A",
                "Joke B      Punch Line B",
                "Joke C      Punch Line C",
                "Joke D      Punch Line D",
                "Joke E      Punch Line E",
                "Joke F      Punch Line F",
                "Joke G      Punch Line G"};

        int min = 0;
        int max = allJokes.length;
        int range = max - min + 1;
        int randomIndex = (int)(Math.random() * range) + min;// exclusive on both ends

        return allJokes[randomIndex];
    }

}