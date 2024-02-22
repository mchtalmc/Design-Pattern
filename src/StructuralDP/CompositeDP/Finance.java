package StructuralDP.CompositeDP;

import java.util.Arrays;
import java.util.List;

public class Finance implements Department{



    @Override
    public String getName() {
        return "Finance";
    }

    @Override
    public List<String> getEmployes() {
        return Arrays.asList("Finans", "Finans1","Finans2");
    }
}
