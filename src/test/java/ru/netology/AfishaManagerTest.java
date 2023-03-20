package ru.netology;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class AfishaManagerTest {
    @Test
    public void testFindAllMovies() {
        AfishaManager manager = new AfishaManager();
        manager.add("Film one");
        manager.add("Film second");
        manager.add("Film third");
        manager.add("Film fourth");
        manager.add("Film fifth");

        String[] expected = {"Film one", "Film second", "Film third", "Film fourth","Film fifth"};
        String[] actual = manager.findAllMovie();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testEmpty() {
        AfishaManager manager = new AfishaManager();
        manager.add("");
        String[] expected = {""};
        String[] actual = manager.findAllMovie();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testOne() {
        AfishaManager manager = new AfishaManager();
        manager.add("Film one");
        String[] expected = {"Film one"};
        String[] actual = manager.findAllMovie();
        Assertions.assertArrayEquals(expected, actual);
    }
    @Test
    public void findLast(){
        AfishaManager manager = new AfishaManager();
        manager.add("Film one");
        manager.add("Film second");
        manager.add("Film third");
        manager.add("Film fourth");
        manager.add("Film fifth");
        String[] expected = {"Film fifth"};
        String[] actual = manager.findLastMovie();
        Assertions.assertArrayEquals(expected, actual);
    }

}
