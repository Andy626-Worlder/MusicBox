public class Main {
    public static void main(String[] args) {

        MusicBox mbox = new MusicBox("S34TG65", 'Y', "Raindrops", "Misty",
                "The path less traveled", "Country", "BZEE Music", "Rhythm Divine");

        System.out.println("Now playing the song");
        mbox.playSong(mbox.getSongID(), mbox.getPremiumSong(), new AdPlayer(), 2);

        MusicBox mbox2 = new MusicBox("P23FJ78", 'N', "Fly High", "Skyfall", "Into the Unknown", "Pop", "Music Universe", "Beats by Aria");

        System.out.println("Now playing the song");
        mbox2.playSong(mbox2.getSongID(), mbox2.getPremiumSong(), new AdPlayer(), 1);
    /**
     * Note that I have removed the noAds variable from the MusicBox class 
     * since it is not necessary anymore, 
     * and the playAd method has been moved to the AdPlayer class. 
     * In the MusicBox class, I have added an AdPlayer parameter to the playSong method, 
     * vwhich is used to play ads.
     * yeah
     */
    }
}
