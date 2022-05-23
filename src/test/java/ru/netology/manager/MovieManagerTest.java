package ru.netology.manager;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

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
        String movie = "Африка";

        MovieManager manager = new MovieManager();
        manager.add(first);
        manager.add(second);
        manager.add(third);
        manager.add(fourth);
        manager.add(fifth);
        manager.add(sixth);
        manager.add(seventh);
        manager.add(movie);

        String[] expected = {first, second, third, fourth, fifth, sixth, seventh, movie};
        String[] actual = manager.add();

        assertArrayEquals(expected, actual);
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
    public void findLast() {
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
}