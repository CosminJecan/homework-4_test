package ro.siit.homework10;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class SamsungGalaxyS10 extends Samsung {

    public SamsungGalaxyS10(int batteryLife, Color color, String material, String imei) {
        super(batteryLife, color, material, imei);
    }

    private List<SamsungGalaxyS10> contacts = new ArrayList<>();

    @Override
    public void addContact(String nrCrt, String phoneNumber, String firstName, String secondName) {
        super.addContact(nrCrt, phoneNumber, firstName, secondName);
    }

}
