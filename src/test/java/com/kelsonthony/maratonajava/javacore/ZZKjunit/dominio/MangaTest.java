package com.kelsonthony.maratonajava.javacore.ZZKjunit.dominio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MangaTest {
    private Manga manga1;
    private Manga manga2;

    private Manga manga3;
    @BeforeEach
    public void setUp() {
        manga1 = new Manga("DBZ", 300);
        manga2 = new Manga("DBZ", 300);
        manga3 = new Manga("Pokemon", 400);
    }

    @Test
    @DisplayName("Accessors should rReturn data whhen initialized")
    public void accessors_ReturnData_WhhenInitialized() {
        Assertions.assertEquals("DBZ", manga1.name());
        Assertions.assertEquals(300, manga1.episodes());
    }

    @Test
    @DisplayName("Equals Return True When Objects Are The Same")
    public void equals_ReturnTrue_WhenObjectsAreTheSame() {
        Assertions.assertEquals(manga1, manga2);

    }

    @Test
    @DisplayName("Constructor Throw Null Pointer Exception When Name Is Null")
    public void constructor_ThrowNullPointerException_WhenNameIsNull() {
        Assertions.assertThrows(NullPointerException.class,
                () -> new Manga(null, 12));

    }

    @Test
    @DisplayName("It is Record Return True When Called From Manga")
    public void isRecord_ReturnTrue_WhenCalledFromManga() {
        Assertions.assertTrue(Manga.class.isRecord());

    }

}