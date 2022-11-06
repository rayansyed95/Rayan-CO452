package Mycoursework1;
import java.util.ArrayList;
import java.util.Scanner;
import helpers.*;


public class Songlist 
{
    private ArrayList<Song> songs = new ArrayList<Song>();
    
     

    public Songlist() 
    {
        addSomeSongs();
        doMainMenu();
    }

    private void addSomeSongs() 
    {
        Song song = new Song("Starboy", "The Weeknd", 2100055576);
        songs.add(song);

        song = new Song("Lemonade", "Internet Money", 183096867	);
        songs.add(song);

        song = new Song("Breathless", "Shayne Ward", 7809326);
        songs.add(song);

        song = new Song("Ridin Solo", "Jason Derulo", 143098604);
        songs.add(song);

        song = new Song("Save Your Tears", "The Weeknd", 908589432);
        songs.add(song);

        song = new Song("Girls Like You", "Maroon 5", 60854387);
        songs.add(song);

        song = new Song("Wake Me Up", "Avicii", 564980431);
        songs.add(song);

        song = new Song("Laid", "Matt Nathanson", 4563876);
        songs.add(song);

        song = new Song("Unholy", "Sam Smith", 21354675);
        songs.add(song);

        song = new Song("Complicated", "Avril Lavigne", 78654986);
        songs.add(song);
        
    }

    private void doMainMenu() 
    {
        boolean wantToQuit = false;

        while(!wantToQuit)
        {
            displayMenu();
            int choice = InputReader.getInt("Please enter your choice > ");

            switch(choice)
            {
                case 1: addSong();break;
                case 2: deleteSong();break;
                case 3: printSongs();
                case 4: printTopSongs();
                case 5: wantToQuit = true; break;
            }
        }
    }

    private void displayMenu() 
    {
        System.out.println("\n 1. Add Songs");
        System.out.println(" 2. Delete Songs");
        System.out.println(" 3. Print All Songs");
        System.out.println(" 4. Print All Top Songs");
        System.out.println(" 5. Quit\n");

    }

    private void addSong()
    {
        System.out.println(" Adding a Song");
        String title = InputReader.getString("Please enter the song title >");
        String name = InputReader.getString("Please enter the artist name  >");
        int count = InputReader.getInt("Please enter the play count > ");

        Song song = new Song(title, name, count);
        songs.add(song);
    }

    private void deleteSong()
    {
    Scanner reader = new Scanner(System.in);
    System.out.println("Enter Song No. which you want to delete: ");
    Integer num = reader.nextInt();
    songs.remove(num - 1);



    }

    private void printSongs()
    {
        System.out.println("\nPrinting All Songs\n");
        int count = 0;
        
        for(Song song : songs)
        {
             count++;
            System.out.print("Song " + "count" + ": ");
            song.print();
        }
    }
    
    private void printTopSongs()  {
        Scanner reader = new Scanner(System.in);

        System.out.println("Enter No. of plays you want to print: ");
        Integer num = reader.nextInt();
            int i;
            for (i = 0; i < songs.size(); i++) {
                if (num <= songs.get(i).getPlayCount()) {
                    System.out.println("Song No. " + (i+1) + " : " + songs.get(i).getTitle() + " by " + songs.get(i).getArtist() + " " + songs.get(i).getPlayCount() + " plays ");
                }

            }

        

    }
    
}
