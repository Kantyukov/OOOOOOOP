package ru.artem.kantukov.figures;

public class Triangle extends AllFigures {
    private int height;
    private final int a;
    private int b;
    private int c;



    public Triangle(int a, int height){

        this.height = height;
        this.a = a;
    }
    public Triangle (int a, int b, int c){

        this.a = a;
        this.b =b;
        this.c =c ;
    }
    public void square (){
        double s = 0.5*height*a;
        System.out.println("Square of triangle = " +s);
    }
    public void perimeter (){
        double p = a+b+c;
        System.out.println("Perimeter of triangle = " +p);

    }
    @Override
    public void showFigure() {
        System.out.println("Находим параметры треугольника");}
}
