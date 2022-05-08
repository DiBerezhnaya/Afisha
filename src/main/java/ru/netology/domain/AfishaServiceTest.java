package ru.netology.manager;

import ru.netology.domain.Movie;

public class AfishaServiceTest {
        Movie first = new Movie(1, "Бладшот", "боевик");
    Movie second = new Movie(2, "Вперёд", "мультфильм");
    Movie third = new Movie(3, "Отель 'Белград'", "комедия");
    Movie fourth = new Movie(4, "Джентльмены", "боевик");
    Movie fifth = new Movie(5,"Человек-невидимка", "ужасы");
    Movie sixth = new Movie(6, "Тролли. Мировой тур", "мультфильм");
    Movie seventh = new Movie(7,"Номер один", "комедия");

@Test
    public void myTest() {
    AfishaRepository repo = new AfishaRepository();
    repo.save(first);
    repo.save(second);
    repo.save(third);
    repo.save(fourth);
    repo.save(fifth);
    repo.save(sixth);
    repo.save(seventh);

    repo.add(Movie movie);

    Movie[] expected = { first, second, third, fourth, fifth, sixth, seventh };
    Movie[] actual = repo.findAll();

    assertArrayEquals(expected, actual);
    }
}
