package ru.artem.kantukov.instruments;

public class Generals {
    public static void main(String[] args) {

        Instruments pianino = new Pianino();
        System.out.println(pianino.toString());
        Instruments violin = new Violin();
        System.out.println(violin.toString());
        Instruments flute = new Flute();
        System.out.println(flute.toString());
        Instruments drum = new Drum();
        System.out.println(drum.toString());
    }
}
