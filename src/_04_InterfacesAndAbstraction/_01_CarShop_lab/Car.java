package _04_InterfacesAndAbstraction._01_CarShop_lab;

import java.io.Serializable;

public interface Car extends Serializable {
    int TIRE = 4;

    String getModel();
    String getColor();
    Integer getHorsePower();
    String countryProduced();
}
