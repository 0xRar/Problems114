public class App {
    private String name = "New App";
    private double rate = 0.0;
    private int downloads = 5;

    public App() {
        this.name = name;
        this.rate = rate;
        this.downloads = downloads;
    }

    public void setApp(String name, double rate, int downloads) {
        this.name = name;
        this.rate = rate;
        this.downloads = downloads;

        if (rate < 0 || rate > 5) {
            System.out.println("Invalid");
        } else {
            this.rate = rate;
        }
    }

    public String getName() {
        return name;
    }

    public double getRate() {
        return rate;
    }

    public int getDownloads() {
        return downloads;
    }

    public boolean isTopApp() {
        if (rate == 5.0 && downloads > 100) {
            return true;
        } else {
            return false;
        }
    }
}
