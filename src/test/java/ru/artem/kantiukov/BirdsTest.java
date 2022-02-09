package ru.artem.kantiukov;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import ru.artem.kantukov.ComparePracticec.birds.Birds;

@DisplayName("Класс Birds должен:")
public class BirdsTest {

    public static final String DEFAULT_NAME = "Соловей";
    public static final String DEFAULT_CRY = "Свист";
    public static final boolean DEFAULT_VOICE = false;
    @DisplayName(" корректно создается конструктором")
    @Test
    public void shouldCorrectConstructor(){
        Birds solovei = new Birds(DEFAULT_NAME, DEFAULT_CRY, DEFAULT_VOICE);

        Assertions.assertEquals(DEFAULT_NAME, solovei.getName());
        Assertions.assertEquals(DEFAULT_CRY, solovei.getCry());
        Assertions.assertEquals(DEFAULT_VOICE, solovei.isVoice());
    }
    @DisplayName("корректно изменяет поля")
    @Test
    public  void shouldHaveCorrectUpdateBirds(){
        Birds solovei = new Birds(DEFAULT_NAME, DEFAULT_CRY, DEFAULT_VOICE);
        solovei.setVoice(true);

        Assertions.assertTrue(solovei.isVoice());


    }
}
