package pl.javastart.task;

class PlayStationFive {
    boolean blurayDrive;
    double height;
    double width;
    double length;
    String pad;
    int hdmiInputs;
    int usbInputs;
    double sizeDisc;
    double price;

    PlayStationFive(boolean blurayDrive, double height, double width, double length,
                     String pad, int hdmiInputs, int usbInputs, double sizeDisc, double price) {
        this.blurayDrive = blurayDrive;
        this.height = height;
        this.width = width;
        this.length = length;
        this.pad = pad;
        this.hdmiInputs = hdmiInputs;
        this.usbInputs = usbInputs;
        this.sizeDisc = sizeDisc;
        this.price = price;
    }

    void printInfo() {
        System.out.println("Cena: " + price + " zł");
        System.out.println("Konsola posiada naped bluray: " + blurayDrive);
        System.out.println("Wymiary konsoli: " + height + "cmx" + width + "cmx" + length + "cm");
        System.out.println("Konsola jest w sprzedazy wraz z padem: " + pad);
        System.out.println("Konsola posiada " + hdmiInputs + " wejscia hdmi");
        System.out.println("Konsola posiada " + usbInputs + " wejscia usb");
        System.out.println("Konsola posiada dysk o rozmiarze " + sizeDisc + " GB");
    }
}
