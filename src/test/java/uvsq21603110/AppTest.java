package uvsq21603110;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    @Test
    public void testInitperso() {
        Personnel personnel = new Personnel.Builder("Test", "Test", "Testeur").build();
        assertEquals("Test", personnel.getNom());
        assertEquals("Test", personnel.getPrenom());
        assertEquals("Testeur", personnel.getFonction());
    }
}
