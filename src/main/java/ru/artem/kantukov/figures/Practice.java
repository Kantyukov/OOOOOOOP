package ru.artem.kantukov.figures;

public class Practice {
    public static void main(String[] args) {

        Quadrate box = new Quadrate(10);
        Triangle partOfPizza = new Triangle(15, 10);
        Circles circle = new Circles(7);
        Triangle partOfPizzaPerimeter = new Triangle(6,6,10);



        circle.showFigure();
        circle.square();
        circle.perimeter();
        box.showFigure();
        box.perimeter();
        box.square();
        partOfPizza.showFigure();
        partOfPizza.square();
        partOfPizzaPerimeter.perimeter();


    }
}
