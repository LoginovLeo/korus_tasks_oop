package OOP;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;


public class PCMain {

    public static void main(String[] args)  {


        List<Motherboard> components = new ArrayList<>();
        List<PC> pc1 = new ArrayList<>();



        PSU psu = new PSU(3, "Power Supply", " VA-PSU-US1", "564665sfa", ConnectionType.POWER);
        Motherboard motherboard = new Motherboard(4, "Asus", "ROG STRIX B550-XE GAMING", "45318551134-662aA4D45", ConnectionType.POWER);
        RAM ram = new RAM(1, "Kingston", "DDR4 32Gb 2400MHz", "805353-B21", ConnectionType.DDR4);
        HDD hdd = new HDD(5, "Kingston", "HDD512", "1256aAS-512", ConnectionType.SATA);
        CPU cpu = new CPU(2, "Intel", "I9", "asd5f5", ConnectionType.Socket1155);
        SSD ssd = new SSD(6, "Samsung", "SSD512", "asd5f5", ConnectionType.PCI_E);
        components.add(ram);
        components.add(psu);
        components.add(hdd);
        components.add(ssd);
        components.add(cpu);
        components.add(motherboard);

        PC computer1 = new PC(ram,cpu,motherboard,psu,ssd,hdd);

        computer1.getPCInformation(computer1);




        //pc.forEach(System.out::println);
        System.out.println(" ");
        // psu.powerOn(pc);
        //motherboard.deleteComponent(components, components.get(1));
        //motherboard.addComponent(components, new PSU(33, "Power Supply", " VA-PSU-US1", "564665sfa", ConnectionType.POWER));
        System.out.println(" ");
        //psu.powerOn(components);


    }
}
