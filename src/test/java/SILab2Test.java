import org.junit.jupiter.api.Test;

import java.lang.reflect.Array;
import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

class SILab2Test {

    private List<Angle> createList(Angle...elems) {
        return new ArrayList<Angle>(Arrays.asList(elems));
    }
    @Test
    void testEveryStatement()
    {
        Angle a = new Angle(120,72,14);
        RuntimeException ex;
        ex = assertThrows(RuntimeException.class, () -> SILab2.function(createList(a)));
        assertTrue(ex.getMessage().contains("The minutes of the angle are not valid!"));

        Angle a1 = new Angle(360,-20,18);
        ex = assertThrows(RuntimeException.class, ()-> SILab2.function(createList(a1)));
        assertTrue(ex.getMessage().contains("The angle is greater then the maximum"));


        Angle a2 = new Angle(420,30,48);
        ex = assertThrows(RuntimeException.class, () -> SILab2.function(createList(a2)));
        assertTrue(ex.getMessage().contains("The angle is smaller or greater then the minimum"));

        Angle a3 = new Angle(360,0,0);
        ArrayList<Integer> rezLista = new ArrayList<Integer>();
        rezLista.add(1296000);
        assertEquals(rezLista,SILab2.function(createList(a3)));

        Angle a4 = new Angle(120,28,64);
        ex = assertThrows(RuntimeException.class, () -> SILab2.function(createList(a4)));
        assertTrue(ex.getMessage().contains("The seconds of the angle are not valid"));

        Angle a5 = new Angle(120,40,24);
        Angle a6 = new Angle(84,32,14);
        ArrayList<Integer> rezLista1 = new ArrayList<Integer>();
        rezLista1.add(434424);
        rezLista1.add(304334);
        assertEquals(rezLista1,SILab2.function(createList(a5,a6)));


    }
    @Test
    void testEveryBranch(){
        //Isti test cases kako i kaj test every statement kriteriumot
        RuntimeException ex;
        Angle a = new Angle(120,72,14);
        RuntimeException ex1;
        ex1 = assertThrows(RuntimeException.class, () -> SILab2.function(createList(a)));
        assertTrue(ex1.getMessage().contains("The minutes of the angle are not valid!"));

        Angle a1 = new Angle(360,-20,18);
        ex1 = assertThrows(RuntimeException.class, ()-> SILab2.function(createList(a1)));
        assertTrue(ex1.getMessage().contains("The angle is greater then the maximum"));


        Angle a2 = new Angle(420,30,48);
        ex1 = assertThrows(RuntimeException.class, () -> SILab2.function(createList(a2)));
        assertTrue(ex1.getMessage().contains("The angle is smaller or greater then the minimum"));

        Angle a3 = new Angle(360,0,0);
        ArrayList<Integer> rezLista = new ArrayList<Integer>();
        rezLista.add(1296000);
        assertEquals(rezLista,SILab2.function(createList(a3)));

        Angle a4 = new Angle(120,28,64);
        ex1 = assertThrows(RuntimeException.class, () -> SILab2.function(createList(a4)));
        assertTrue(ex1.getMessage().contains("The seconds of the angle are not valid"));

        Angle a5 = new Angle(120,40,24);
        Angle a6 = new Angle(84,32,14);
        ArrayList<Integer> rezLista1 = new ArrayList<Integer>();
        rezLista1.add(434424);
        rezLista1.add(304334);
        assertEquals(rezLista1,SILab2.function(createList(a5,a6)));

    }

}