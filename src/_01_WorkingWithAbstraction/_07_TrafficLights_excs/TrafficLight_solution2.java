package _01_WorkingWithAbstraction._07_TrafficLights_excs;

public enum TrafficLight_solution2 {
    RED,
    GREEN,
    YELLOW;

    public TrafficLight_solution2 next() {
        return values()[(this.ordinal() + 1) % values().length];
    }
}

/*можем да използваме само този enum без другите (class TrafficLight и enum Color)*/
