package StructuralDP.CompositeDP;

import java.util.Arrays;
import java.util.List;

public class Arge implements Department{
    @Override
    public String getName() {
        return "Arge Sonradan Actim ";
    }

    @Override
    public List<String> getEmployes() {
        return Arrays.asList("Arrays","Arrays1","Arrays2");
    }
}
