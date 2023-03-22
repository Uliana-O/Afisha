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
        manager.add("Film sixth");
        manager.add("Film seventh");
        manager.add("Film eighth");
        manager.add("Film  ninth");
        manager.add("Film tenth");

        String[] expected = {"Film one", "Film second", "Film third", "Film fourth", "Film fifth",
                "Film sixth", "Film seventh", "Film eighth", "Film  ninth", "Film tenth"};
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
    public void testUnderLimit() {
        AfishaManager manager = new AfishaManager();
        manager.add("Film one");
        String[] expected = {"Film one"};
        String[] actual = manager.findAllMovie();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void findLast() {
        AfishaManager manager = new AfishaManager();
        manager.add("Film one");
        manager.add("Film second");
        manager.add("Film third");
        manager.add("Film fourth");
        manager.add("Film fifth");
        manager.add("Film sixth");
        manager.add("Film seventh");
        manager.add("Film eighth");
        manager.add("Film  ninth");
        manager.add("Film tenth");

        String[] expected = {"Film tenth", "Film  ninth", "Film eighth", "Film seventh", "Film sixth", "Film fifth",
                "Film fourth", "Film third", "Film second", "Film one"};
        String[] actual = manager.findLastMovie();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void findAboveLimit() {
        AfishaManager manager = new AfishaManager();
        manager.add("Film one");
        manager.add("Film second");
        manager.add("Film third");
        manager.add("Film fourth");
        manager.add("Film fifth");
        manager.add("Film sixth");
        manager.add("Film seventh");
        manager.add("Film eighth");
        manager.add("Film  ninth");
        manager.add("Film tenth");
        manager.add("Film eleventh");
        String[] expected = {"Film one", "Film second", "Film third", "Film fourth", "Film fifth",
                "Film sixth", "Film seventh", "Film eighth", "Film  ninth", "Film tenth","Film eleventh"};
        String[] actual = manager.findAllMovie();
        Assertions.assertArrayEquals(expected, actual);

    }
}