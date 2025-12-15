package com.testing.models;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

/*Para esta clase lo que crea  */
public class DefinitionTest {
    Definition def = new Definition(null, null,null);

    @BeforeEach
    void setUp(){
        def = null;
    }

    @AfterEach
    void clanUp(){
        def = null;
    }


    @Test
    @Tag("regression")
    @DisplayName("Este test verifica que tanto los métodos get y set de Definition están funcionando correctamente")
    void correctGetAndSet() {
        def = new Definition(null, null,null);
        def.setCharacter("一");
        def.setDefinition("1,uno");
        def.setPinyin("yī");
        assertTrue(def.getCharacter().equals("一") && def.getDefinition().equals("1,uno") && def.getPinyin().equals("yī"));
    }
    
    @Test
    @Tag("regression")
    @DisplayName("Si esta funcionando de forma correcta el método .toString de Definition ")
    void correctToString(){
        def = new Definition("一", "yī", "1,uno");
        assertEquals(def.toString(), "| 一 | yī | 1,uno |");
    }
}
