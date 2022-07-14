package _04_InterfacesAndAbstraction._10_CollectionHierarchy_excs;

public class MyListImpl extends Collection implements MyList, Addable, AddRemovable {
    @Override
    public int getUsed() {
        return items.size();
    }

    @Override
    public String remove() {
        return items.remove(0);
    }

    @Override
    public int add(String index) {
        items.add(0, index);
        return 0;
    }
}
