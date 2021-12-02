package ru.artem.kantukov.instruments;

public class Instruments {
    private final String name;
    private final String melody;
    private final double price;
    private String size;

    public Instruments (String name,String melody, double price, String size){
        this.melody = melody;
        this.name=name;
        this.price = price;
        this.size = size;
    }
    public String toString (){
        return  " [ " + name+ " :  " +melody+ "  по цене: " +price+ "$ и имеет размер: " +size+ "]";
    }

}
