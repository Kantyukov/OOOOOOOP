package ru.artem.kantukov.figures;

public class Quadrate extends AllFigures {
    private final int length;

    public Quadrate (int length){

        this.length = length;
    }
    public void square (){
        double s = length*length;
        System.out.println("Square of quadrate = " +s);
    }
    public void perimeter(){
        double p = 4*length;
        System.out.println("Perimeter of quadrate = " +p);
    }
    @Override
    public void showFigure() {
        System.out.println("Находим параметры квадрата");
    }
}
