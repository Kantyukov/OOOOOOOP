package ru.artem.kantukov.strings;

public class StringsPractice {
    public static void main(String[] args) {
        String str = "Artem";
        String copyStr = "Artem";
        String strArrays = new String("Artem");
        System.out.println("(str == copyStr) = " + (str == copyStr)); // Сравнил два стринга
        String strInternArrays = strArrays.intern(); // Добавил новый стринг и засунул из кучи в стринг пул strArray
        System.out.println("(str == strArrays) = " + (str == strInternArrays)); // Сравнил уже из стринг пула strArray со стрингом
        System.out.println("str.charAt(4) = " + str.charAt(4)); // Вывел 4ую букву
        String strMethodsTest = """
                Дождались меня белые ночи
                Над простором густых островов…
                Снова смотрят знакомые очи,
                И...""";                                 // Добавил стринг стих
        System.out.println("strMethodsTest.length() = " + strMethodsTest.length()); // Вывел его длину
        System.out.println("strMethodsTest.subSequence(1,30) = " + strMethodsTest.subSequence(0, 26)); //Вывел 26 индексов

        //Создал стрингбуилд
        StringBuilder builtString = new StringBuilder("""
                "Дождались меня белые ночи\\n" +
                "Над простором густых островов…\\n" +
                "Снова смотрят знакомые очи,\\n" +
                "И...\"""");
        for (int i = 0; i < 2; i++) {   //Пробежался и вывел два изменения объекта builtString с добавлением новго поля
            builtString.append("В этот лес завороженный");
            System.out.println("builtString = " + builtString);

        }
        System.out.println("getFirstLine(strMethodsTest) = " + getFirstLine(strMethodsTest));
    }
    public static String getFirstLine(String strMethodsTest){
        String [] data = strMethodsTest.split(" ");
        return data[0];


    }
}
