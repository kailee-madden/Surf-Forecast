package url;

import java.io.File;

public class Main {

    public static void main(String[] args) {
        String link = "https://www.ndbc.noaa.gov/data/realtime2/46254.spec";

        File out = new File("/Users/kailee/Documents/Surf Forecast/Surf-Forecast/Scripps Spectral Data/test.csv");

        new Thread(new Download(link, out)).start();
    }
}