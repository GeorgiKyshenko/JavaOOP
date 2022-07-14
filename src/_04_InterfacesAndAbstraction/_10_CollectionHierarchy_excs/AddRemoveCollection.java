package _04_InterfacesAndAbstraction._10_CollectionHierarchy_excs;

public class AddRemoveCollection extends Collection implements AddRemovable {
    @Override
    public String remove() {
        return items.remove(items.size() - 1);
    }

    @Override
    public int add(String index) {
        items.add(0, index);
        return 0;
    }
}
