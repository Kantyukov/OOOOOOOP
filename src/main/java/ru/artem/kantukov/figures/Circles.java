package ru.artem.kantukov.figures;

public class Circles extends AllFigures{
    private final double diameter;
    public static final double PI = 3.1415926535;



    public Circles (double diameter){

        this.diameter = diameter;

    }

    @Override
    public void showFigure() {
        System.out.println("Находим параметры круга");
    }
    @Override
    public void square(){
        double s = (PI*diameter)/4;
        System.out.println("Square of circle = " +s);
    }
    public void perimeter(){
        double p = PI*diameter;
        System.out.println("Perimeter of circle = " +p);
    }
}
