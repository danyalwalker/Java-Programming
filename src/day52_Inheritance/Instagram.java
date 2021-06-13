package day52_Inheritance;

public class Instagram extends MobileApp{
    public void postPhoto() {
        System.out.println("Posting photo on instagram");
    }

    @Override
    public void useTheApp(int minutes) {
        super.useTheApp(minutes);
        System.out.println("Using instagram app features");
        postPhoto();
    }
}
