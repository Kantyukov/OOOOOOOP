package ru.artem.kantukov.instruments;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Instruments {
    private final String name;
    private final String melody;
    private final double price;
    private String size;

    public String toString (){
        return  " [ " + name+ " :  " +melody+ "  по цене: " +price+ "$ и имеет размер: " +size+ "]";
    }

}
