public class MusicBox {

    // Variables
    private String songID;
    private char isSongPremium;
    public String songTitle;
    private String songArtists;
    private String songAlbum;
    public String songGenre;
    private String songProducer;
    public String songMusicLabel;

    // Constructor
    public MusicBox(String songID, char premiumSong, String title, String artists, String Album, String genre, String producer, String label) {
        this.songID = songID;
        this.isSongPremium = premiumSong;
        this.songArtists = artists;
        this.songAlbum = Album;
        this.songGenre = genre;
        this.songProducer = producer;
        this.songMusicLabel = label;
    }

    // Methods
    public String getSongID() {
        return songID;
    }

    public String getSongArtists() {
        return songArtists;
    }

    public char getPremiumSong() {
        return isSongPremium;
    }

    public String getSongAlbum(){
        return songAlbum;
    }

    public String getSongGenre(){
        return songGenre;
    }

    public String getSongProducer(){
        return songProducer;
    }

    public String getSongMusicLabel(){
        return songMusicLabel;
    }

    public void playSong(String songID, char premium, AdPlayer adPlayer, int ads) {
        switch(premium){
            case 'Y':
                System.out.println("This is a premium song. Please buy it to play without the ads");
                adPlayer.playAd(ads);
                break;
            case 'N':
                System.out.println("Thank you for choosing this song. Hope you enjoy listening to it.");
                adPlayer.playAd(ads);
                break;
        }
    }
}


    
        // public void playSong(String songID, char premium, int ads) {
        //     switch(premium){
        //         case 'Y':
        //         System.out.println("This is a premium song. Please buy it to play without the ads");
        //         playAd(ads, premium);
        //         break;
        //         case 'N':
        //         System.out.println("Thank you for choosing this song. Hope you enjoy listening to it.");
        //         playAd(ads, premium);
        //         break;
        //     }
        // }
    
        // private void playAd(int ads, char premium) {
        //     if (ads == 1) {
        //         System.out.println("Playing Ad 1");
        //     }
        //     else {
        //         for(int i=1; i<=ads; i++){
        //             System.out.println("Playing Ad " + i);
        //         }
        //     }
            
        // }
    
        // the MusicBox class is responsible for both storing the details of the music 
        // and playing the song along with the ads. 
        // It violates the Single Responsibility Principle (SRP) 
        // which suggests that a class should have only one reason to change.

//         To fix this, we can create a new class named PlaySongs, 
//         which will be responsible for playing the song and ads. 
//         This class can take the MusicBox object as input and use its details to play the song.


