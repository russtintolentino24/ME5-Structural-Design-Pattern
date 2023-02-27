package com.company;

public class SongListGenerator {

    public static void main(String[] args){

        SongComponent industrialMusic =
                new SongGroup("\nIndustrial",
                        "is a style of experimental music that draws on harsh, transgressive and provocative sounds and themes");

        SongComponent heavyMetalMusic =
                new SongGroup("Heavy Metal",
                        "is a genre of rock that developed in the late 1960s, largely in the UK and in the US");

        SongComponent industrialHipHopMusic =
                new SongGroup("\nIndustrial Hip Hop",
                        "is a genre fusion of industrial and hip hop music");


        SongComponent everySong = new SongGroup("Song List", "Every Song Available");

        everySong.add(heavyMetalMusic);

        heavyMetalMusic.add(new Song("War Pigs", "Black Sabath", 1970));
        heavyMetalMusic.add(new Song("Ace of Spades", "Motorhead", 1980));



        everySong.add(industrialMusic);


        industrialMusic.add(new Song("Head Like a Hole", "NIN", 1990));
        industrialMusic.add(new Song("Headhunter", "Front 242", 1988));

        industrialMusic.add(industrialHipHopMusic);

        industrialHipHopMusic.add(new Song("On Sight", "Kanye West", 2013));
        industrialHipHopMusic.add(new Song("New Slaves", "Kanye West", 2013));



        DiscJockey crazyLarry = new DiscJockey(everySong);

        crazyLarry.getSongList();

    }

}