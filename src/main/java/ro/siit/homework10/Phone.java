package ro.siit.homework10;

import javax.swing.event.ListDataListener;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Phone implements PhonesBehavior{
    private int batteryLife;
    private Color color;
    private String material;
    private String imei;

    public Phone(int batteryLife, Color color, String material, String imei) {
        this.batteryLife = batteryLife;
        this.color = color;
        this.material = material;
        this.imei = imei;
    }

    Phone phone1 = new SamsungGalaxyS10(24, Color.red, "plastic", "123456789123456");
    Phone phone2 = new SamsungGalaxyNote20(48, Color.black, "metal", "475869123456789");
    Phone phone3 = new HuaweiP30(36,Color.white, "plastic", "322135795174185");
    Phone phone4 = new HuaweiY7_2019(30, Color.blue, "metal", "322135795178945");



    @Override
    public void addContact(String nrCrt, String phoneNumber, String firstName, String secondName) {

    }


}