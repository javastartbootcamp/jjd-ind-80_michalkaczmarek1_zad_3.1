package pl.javastart.task;

public class Main {

    public static void main(String[] args) {
        PlayStationFive playStationFive1 = new PlayStationFive();
        playStationFive1.blurayDrive = true;
        playStationFive1.hdmiInputs = 3;
        playStationFive1.height = 40;
        playStationFive1.width = 8;
        playStationFive1.length = 20;
        playStationFive1.sizeDisc = 750;
        playStationFive1.pad = "DualShock";
        playStationFive1.usbInputs = 2;
        playStationFive1.price = 3000;
        playStationFive1.printInfo();

        PlayStationFive playStationFive2 = new PlayStationFive();
        playStationFive2.blurayDrive = false;
        playStationFive2.hdmiInputs = 2;
        playStationFive2.height = 40;
        playStationFive2.width = 8;
        playStationFive2.length = 20;
        playStationFive2.sizeDisc = 500;
        playStationFive2.pad = "DualShock";
        playStationFive2.usbInputs = 1;
        playStationFive2.price = 2000;
        playStationFive2.printInfo();
    }
}
