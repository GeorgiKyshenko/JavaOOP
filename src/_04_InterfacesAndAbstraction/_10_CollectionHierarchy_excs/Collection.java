package _04_InterfacesAndAbstraction._10_CollectionHierarchy_excs;

import java.util.ArrayList;
import java.util.List;

public abstract class Collection implements Addable{

    protected int maxSize;
    protected List<String> items;

    public Collection() {
        maxSize = 100;
        items = new ArrayList<>();
    }
}
