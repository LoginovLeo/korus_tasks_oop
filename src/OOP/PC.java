package OOP;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class PC {
    RAM ram;
    CPU cpu;
    Motherboard motherboard;
    PSU psu;
    SSD ssd;
    HDD hdd;
    List<Motherboard> pc;
    String nameOfAssembly;



    public PC(List<Motherboard> pc, String nameOfAssembly) {
        this.pc = pc;

        this.nameOfAssembly = nameOfAssembly;
    }

    public PC() {


    }

    public PC(RAM ram) {
        this.ram = ram;
    }

      public PC(RAM ram, CPU cpu, Motherboard motherboard, PSU psu, SSD ssd, HDD hdd) {
        this.ram = ram;
        this.cpu = cpu;
        this.motherboard = motherboard;
        this.psu = psu;
        this.ssd = ssd;
        this.hdd = hdd;
    }



    public void discover(PC pc) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {


        Class<?> elem = ram.getClass();
        Method toString;
        toString = elem.getMethod("toString");
        System.out.println(toString.invoke(ram));


    }

    public void discover1(PC pc) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException, NoSuchFieldException {

        Field[] elem = pc.motherboard.getClass().getDeclaredFields();
        for (Field field : elem) {
            String name =  field.getName();
            Field ff = pc.motherboard.getClass().getDeclaredField(name);
            ff.setAccessible(true);
            System.out.println(ff.get(motherboard));

        }

        Field field = pc.ram.getClass().getDeclaredField("serialNumber");
        field.setAccessible(true);
        Object a = field.get(ram);
        System.out.println(a);


    }

}
