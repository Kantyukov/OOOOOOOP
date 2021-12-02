package ru.artem.kantukov.birds;

public class Birds {

        private final String name;
        private final String cry;
        private boolean voice;

        public Birds(String name, String cry, boolean voice) {
            this.name = name;
            this.cry = cry;
            this.voice =voice;

        }
        public String toString(){
            return  "{ " +name+ ": " +cry+ "} { voice: " +voice+ " }";
        }


}
