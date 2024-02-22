package StructuralDP.CompositeDP;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class HeadDepartment implements Department{

    //Butun Depepartmanlari 1 field 'da tutmak istersem
    List<Department> departments =new ArrayList<>();

    //Depatmanlari list'e eklemek istiyorum.
    public void add(Department department){
        this.departments.add(department);
    }


    @Override
    public String getName() { // Firmada ki tum departmanlarin isimlerini listelesin
        return departments.stream().
                map(d-> d.getName()). // Departmanlar stream halinde = Finans, Sales
                collect(Collectors.joining(",")); // Bu metot, akıştaki öğeleri birleştirerek tek bir String oluşturur

    }

    @Override
    public List<String> getEmployes() { // Firmada calisan tum calisanlari listelesin.
        return this.departments.stream().
                                flatMap(d -> d.getEmployes().stream()).
                                collect(Collectors.toList());

    }
}
