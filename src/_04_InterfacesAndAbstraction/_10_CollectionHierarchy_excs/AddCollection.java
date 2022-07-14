package _04_InterfacesAndAbstraction._10_CollectionHierarchy_excs;

public class AddCollection extends Collection implements Addable{
    @Override
    public int add(String index) {
        items.add(index);
        return items.indexOf(index);
    }
}
