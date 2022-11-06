package Mycoursework1;

public class Song  
{
    private String id;

    private String title;

    private String artist;

    int playCount;
 

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public int getPlayCount() {
        return playCount;
    }

    public void setPlayCount(int playCount) {
        this.playCount = playCount;
    }

    public Song(String title, String name, int count) 
    {
        this.title = title;
        this.artist = name;
        this.playCount = count;
    }

    public void print()
    {
        System.out.println(title + " by " + artist + " plays: " + playCount);
    }


   

   

    


 


}
