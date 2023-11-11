package pl.javastart.task;

public class Main {

    public static void main(String[] args) {
        PlayStationFive playStationFive1 = new PlayStationFive(true, 40, 8,
                20, "DualShock", 3, 2, 750, 3000);
        playStationFive1.printInfo();

        PlayStationFive playStationFive2 = new PlayStationFive(false, 40, 8,
                20, "DualShock", 2, 1, 500, 2000);
        playStationFive2.printInfo();
    }
}
