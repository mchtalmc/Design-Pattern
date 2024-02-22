package StructuralDP.CompositeDP;

import java.util.Arrays;

public class Runner {

    public static void main(String[] args) {

        //Tum calisanlari listelemek istersem.
        //Objeleri cagirip getEmpoleyes methodlarini toplamam lazim.

        HeadDepartment headDepartment= new HeadDepartment();
        Finance finance = new Finance();
        Sales sales= new Sales();
        Arge arge= new Arge();
        headDepartment.add(finance);
        headDepartment.add(sales);
        headDepartment.add(arge);
        System.out.println("Tum calisanlar: "+headDepartment.getEmployes());
        System.out.println("Tum Departmanlar: "+ headDepartment.getName());


    }
}
