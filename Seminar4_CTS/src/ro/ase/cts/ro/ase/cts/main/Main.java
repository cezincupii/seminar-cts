package ro.ase.cts.ro.ase.cts.main;

import ro.ase.cts.ro.ase.cts.classes.ClinicaVeterinaraLazy;
import ro.ase.cts.ro.ase.cts.classes.ClinicaVeterniara;
import ro.ase.cts.ro.ase.cts.classes.Vaccin;

public class Main {

    public static void main(String[] args) {
//        ClinicaVeterniara clinica1=  ClinicaVeterniara.getInstance();
//        ClinicaVeterniara clinica2= ClinicaVeterniara.getInstance();
//
//        System.out.println(clinica1.toString());
//        System.out.println(clinica2.toString());

//        ClinicaVeterinaraLazy cl1=ClinicaVeterinaraLazy.getInstance("OkMed","Str Poli",4,300);
//        ClinicaVeterinaraLazy cl2=ClinicaVeterinaraLazy.getInstance("LogiMed","Str buzesti",3,500);
//
//        System.out.println(cl1);
//        System.out.println(cl2);
//
//        cl1.setNume("Clinica 1");
//        cl2.setNumeMedici(45);
//
//        System.out.println(cl1);
//        System.out.println(cl2);


        Vaccin v1=Vaccin.getInstance("Pfizer",2,225);

        System.out.println(v1);

        v1.setpret(555);

        System.out.println(v1);


    }
}
