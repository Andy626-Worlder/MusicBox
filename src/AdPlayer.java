public class AdPlayer {
    
    public void playAd(int numberOfAds) {
        if (numberOfAds == 1) {
            System.out.println("Playing Ad 1");
        } else {
            for (int i = 1; i <= numberOfAds; i++) {
                System.out.println("Playing Ad " + i);
            }
        }
    }
    
}
