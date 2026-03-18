import java.net.URL;

public class TestURL {
    public static void main(String[] args) throws Exception {
        URL url = new URL("https://www.wikipedia.org");

        System.out.println("Protocol: " + url.getProtocol());
        System.out.println("Host: " + url.getHost());
        System.out.println("Path: " + url.getPath());
    }
}
