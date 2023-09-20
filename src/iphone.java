public class iPhone implements iPhone.MusicPlayer, iPhone.Phone, iPhone.Calculator, iPhone.InternetBrowser {
    @Override
    public void playMusic() {
    }

    @Override
    public void makeCall() {
    }

    @Override
    public void openCalculator() {
    }

    @Override
    public void openBrowser() {
    }

    @Override
    public void play() {

    }

    @Override
    public void pause() {

    }

    @Override
    public void nextTrack() {

    }

    @Override
    public void previousTrack() {

    }

    @Override
    public void call() {

    }

    @Override
    public void receiveCall() {

    }

    @Override
    public int add(int a, int b) {
        return 0;
    }

    @Override
    public int subtract(int a, int b) {
        return 0;
    }

    @Override
    public int multiply(int a, int b) {
        return 0;
    }

    @Override
    public int divide(int a, int b) {
        return 0;
    }

    @Override
    public void openURL(String url) {

    }

    @Override
    public void browse() {

    }

    @Override
    public void close() {

    }

    public interface MusicPlayer {
        void playMusic();

        void play();
        void pause();
        void nextTrack();
        void previousTrack();
    }

    public interface Phone {
        void makeCall();

        void call();
        void receiveCall();
    }

    public interface Calculator {
        void openCalculator();

        int add(int a, int b);
        int subtract(int a, int b);
        int multiply(int a, int b);
        int divide(int a, int b);
    }

    public interface InternetBrowser {
        void openBrowser();

        void openURL(String url);
        void browse();
        void close();
    }
}

