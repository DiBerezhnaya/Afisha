package ru.netology.manager;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

class MovieManagerTest {

    String first = "Бладшот";
    String second = "Вперёд";
    String third = "Отель 'Белград'";
    String fourth = "Джентльмены";
    String fifth = "Человек-невидимка";
    String sixth = "Тролли. Мировой тур";
    String seventh = "Номер один";


    @Test
    public void add() {
        String eighth = "Аладдин";
        String ninth = "Домовой";
        MovieManager manager = new MovieManager();
        manager.add(first);
        manager.add(second);
        manager.add(third);
        manager.add(fourth);
        manager.add(fifth);
        manager.add(sixth);
        manager.add(seventh);
        manager.add(eighth);
        manager.add(ninth);

        int expected = 9;
        int actual = manager.findAll().length;

        assertEquals(expected, actual);
    }

    @Test
    public void findAll() {
        MovieManager manager = new MovieManager();
        manager.add(first);
        manager.add(second);
        manager.add(third);
        manager.add(fourth);
        manager.add(fifth);
        manager.add(sixth);
        manager.add(seventh);

        String[] expected = {first, second, third, fourth, fifth, sixth, seventh};
        String[] actual = manager.findAll();

        assertArrayEquals(expected, actual);
    }

    @Test
    public void findLastLimit() {
        MovieManager manager = new MovieManager(3);
        manager.add(first);
        manager.add(second);
        manager.add(third);
        manager.add(fourth);
        manager.add(fifth);
        manager.add(sixth);
        manager.add(seventh);

        String[] expected = {seventh, sixth, fifth};
        String[] actual = manager.findLast();

        assertArrayEquals(expected, actual);
    }

    @Test
    public void findLastOverLimit() {
        String eighth = "Аладдин";
        String ninth = "Домовой";
        String tenth = "Толкин";
        String eleventh = "Z";

        MovieManager manager = new MovieManager();
        manager.add(first);
        manager.add(second);
        manager.add(third);
        manager.add(fourth);
        manager.add(fifth);
        manager.add(sixth);
        manager.add(seventh);
        manager.add(eighth);
        manager.add(ninth);
        manager.add(tenth);
        manager.add(eleventh);

        String[] expected = {eleventh, tenth, ninth, eighth, seventh, sixth, fifth, fourth, third, second};
        String[] actual = manager.findLast();

        assertArrayEquals(expected, actual);
    }
}