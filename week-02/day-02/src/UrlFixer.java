//public class UrlFixer {
//    public static void main(String... args) {
//        String url = "https//www.reddit.com/r/nevertellmethebots";
//https://www.reddit.com/r/nevertellmetheodds/

        // Accidentally I got the wrong URL for a funny subreddit. It's probably "odds" and not "bots"
        // Also, the URL is missing a crucial component, find out what it is and insert it too!
        // Try to solve it more than once using different String functions!

//        System.out.println(url);
//    }
//}
public class UrlFixer {
    public static void main(String[] args) {
        String url = "https//www.reddit.com/r/nevertellmethebots";
        url = url.replace("bot", "odd");
        url = url.substring(0,4) + ":" + url.substring(5, url.length());
        System.out.println(url);
    }
}
