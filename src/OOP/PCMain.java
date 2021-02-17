package OOP;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;


public class PCMain {

    public static void main(String[] args) {


        List<Motherboard> pc = new ArrayList<>();
        PSU psu = new PSU();
        Motherboard motherboard = new Motherboard();
        pc.add(new RAM(1, "Kingston", "DDR4 32Gb 2400MHz", "805353-B21", ConnectionType.DDR4));
        pc.add(new PSU(3, "Power Supply", " VA-PSU-US1", "564665sfa", ConnectionType.POWER));
        pc.add(new CPU(2, "Intel", "I9", "asd5f5", ConnectionType.Socket1155));
        pc.add(new HDD(5, "Kingston", "HDD512", "1256aAS-512", ConnectionType.SATA));
        pc.add(new SSD(6, "Samsung", "SSD512", "asd5f5", ConnectionType.PCI_E));
        pc.add(new Motherboard(4, "Asus", "ROG STRIX B550-XE GAMING", "45318551134-662aA4D45", ConnectionType.POWER));
        //pc.add(new Case(7, "Asus", "GAMING", "7820-87", ConnectionType.POWER));
        pc.add(new SSD(11, "Samsung", "SSD256", "21518", ConnectionType.PCI_E));
        pc.add(new SSD(11, "Samsung", "SSD256", "21518", ConnectionType.PCI_E));
        pc.add(new HDD(9, "Kingston", "HDD256", "8782AS-256", ConnectionType.SATA));
        //pc.forEach(System.out::println);
        System.out.println(" ");
       // psu.powerOn(pc);
        motherboard.deleteComponent(pc,pc.get(1));
        motherboard.addComponent(pc, new PSU(33, "Power Supply", " VA-PSU-US1", "564665sfa", ConnectionType.POWER));
        System.out.println(" ");
        psu.powerOn(pc);


    }


}
