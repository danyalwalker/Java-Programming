package day24_loops;

public class YoutubeCatVideo {
    public static void main(String[] args) throws InterruptedException {
        // video is 1 min 57 seconds. while we dod not reach to the last second
        // print " Watching Youtube video: second: 1"
        // At the end print " Finished video
        // Thread.sleep(1000); to slow it down 1000ms => 1s
        int second = 0;
        while(second <= 117){
            System.out.println("watching youtube video \uD83D\uDC08: second " + second);
            second++;
            Thread.sleep(1000);
        }
        System.out.println("Finished watching cat  \uD83D\uDC08 video");
    }
}
