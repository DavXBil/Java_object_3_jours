package TP2.heritage.ex04.mesMachines;

import java.time.LocalDate;
import java.util.ArrayList;

public class TestMachine {

    public static void main(String[] args) {

        ArrayList<Machine> machines = new ArrayList<Machine>();




        machines.add(new MachineElectrique(LocalDate.now(), "Toupouri", "Xv42", 40));
        machines.add(new MachineEssence(LocalDate.now(), "Toupouri", "Xv42", 56));
        machines.add(new BassinADecanter(LocalDate.now(), "Toupouri", "Xv42", 20));
        machines.add(new PompeAGravitation(LocalDate.now(), "Toupouri", "Xv42", 60, true));


        System.out.println(machines);



    }



}
