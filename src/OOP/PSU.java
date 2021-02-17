package OOP;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class PSU extends Motherboard  {




    public PSU(int id, String producer, String model, String serialNumber, ConnectionType connectionType) {
        super(id, producer, model, serialNumber, connectionType);


    }


    public void powerOn(List<Motherboard> a) {


        System.out.println("Power ON ");
        for (int i = 0; i < a.size(); i++) {
             if (a.get(i).getClass().equals(PSU.class)) {
                int position = a.indexOf(a.get(i));
                Collections.swap(a, 0, position);
            } else if (a.get(i).getClass().equals(Motherboard.class)) {
                int position = a.indexOf(a.get(i));
                Collections.swap(a, 1, position);
            } else if (a.get(i).getClass().equals(CPU.class)) {
                int position = a.indexOf(a.get(i));
                Collections.swap(a, 2, position);
            } else if (a.get(i).getClass().equals(RAM.class)) {
                int position = a.indexOf(a.get(i));
                Collections.swap(a,3, position);
            }
        }



        for(int i = a.size()-1 ; i > 4 ; i--){
            for(int j = 4 ; j < i ; j++){

            if( a.get(j).getId() > a.get(j+1).getId()){
                Motherboard motherboardTemp = a.get(j);
                a.set(j,a.get(j+1));
                a.set(j+1,motherboardTemp) ;
            }
        }
    }


            a.forEach(System.out::println);



    }


    @Override
    public String toString() {
        return "PSU connected : " +
                "id=" + id +
                ", producer='" + producer + '\'' +
                ", model='" + model + '\'';
    }
}
