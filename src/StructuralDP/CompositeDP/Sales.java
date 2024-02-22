package StructuralDP.CompositeDP;

import java.util.Arrays;
import java.util.List;

public class Sales implements Department{
    @Override
    public String getName() {
        return "Sales";
    }

    @Override
    public List<String> getEmployes() {
        return Arrays.asList("Sales", "Sales1","Sales2");
    }
}
