import java.util.ArrayList;

public class Song {
    //properties
    private String title;

    private String artist;

    private ArrayList<String> totalListeners;

    //constructors
    public Song(String title, String artist){
        this.title = title;
        this.artist = artist;
        this.totalListeners = new ArrayList<>();
    }

    //methods
    public String getTitle(){
        return title;
    }

    public String getArtist(){
        return artist;
    }

    public int howMany(ArrayList<String> al){
        int newListeners = 0;
        for(int i = 0; i<al.size(); i++){
            al.set(i,al.get(i).toLowerCase());

        }
        for(int i = 0; i<al.size(); i++){
            if(!totalListeners.contains(al.get(i))){
                newListeners++;
                totalListeners.add(al.get(i));
            }

        }

        return newListeners;


    }

}
