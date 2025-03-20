package com.farrel.lombok;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

class PersonTest {

    @Test
    void testConstructor() {
        List<String> hobbies = new ArrayList<>();
        hobbies.add("Game");
        hobbies.add("Gundam");
        hobbies.add("Movie");
        hobbies.add("Anime");
        hobbies.add("Guitar");

        Person farrel = new Person(1L, "Farrel", 25, hobbies);

        Assertions.assertEquals(1L, farrel.getId());
        Assertions.assertEquals("Farrel", farrel.getName());
        Assertions.assertEquals(25, farrel.getAge());
        Assertions.assertEquals(5, farrel.getHobbies().size());
        Assertions.assertSame(hobbies, farrel.getHobbies());
        Assertions.assertArrayEquals(new List[]{hobbies}, new List[]{farrel.getHobbies()});
        Assertions.assertArrayEquals(hobbies.toArray(new String[0]), farrel.getHobbies().toArray(new String[0]));
    }

    @Test
    void testSetter() {
        List<String> hobbies = new ArrayList<>();
        hobbies.add("Game");
        hobbies.add("Gundam");
        hobbies.add("Movie");
        hobbies.add("Anime");
        hobbies.add("Guitar");

        Person farrel = new Person();

        farrel.setId(1L);
        farrel.setName("Farrel");
        farrel.setAge(25);
        farrel.setHobbies(hobbies);

        Assertions.assertEquals(1L, farrel.getId());
        Assertions.assertEquals("Farrel", farrel.getName());
        Assertions.assertEquals(25, farrel.getAge());
        Assertions.assertEquals(5, farrel.getHobbies().size());
        Assertions.assertSame(hobbies, farrel.getHobbies());
        Assertions.assertArrayEquals(new List[]{hobbies}, new List[]{farrel.getHobbies()});
        Assertions.assertArrayEquals(hobbies.toArray(new String[0]), farrel.getHobbies().toArray(new String[0]));
    }

    @Test
    void testBuilder() {
        List<String> hobbies = new ArrayList<>();
        hobbies.add("Game");
        hobbies.add("Gundam");
        hobbies.add("Movie");
        hobbies.add("Anime");
        hobbies.add("Guitar");

        Person farrel = Person.builder()
                .id(1L)
                .name("Farrel")
                .age(25)
                .hobbies(hobbies)
                .build();

        Assertions.assertEquals(1L, farrel.getId());
        Assertions.assertEquals("Farrel", farrel.getName());
        Assertions.assertEquals(25, farrel.getAge());
        Assertions.assertEquals(5, farrel.getHobbies().size());
        Assertions.assertArrayEquals(new List[]{hobbies}, new List[]{farrel.getHobbies()});
        Assertions.assertArrayEquals(hobbies.toArray(new String[0]), farrel.getHobbies().toArray(new String[0]));
    }

    @Test
    void testBuilderSingularHobbies() {
        List<String> hobbies = new ArrayList<>();
        hobbies.add("Game");
        hobbies.add("Gundam");
        hobbies.add("Movie");
        hobbies.add("Anime");
        hobbies.add("Guitar");

        Person farrel = Person.builder()
                .id(1L)
                .name("Farrel")
                .age(25)
                .hobby("Game")
                .hobby("Gundam")
                .hobby("Movie")
                .hobby("Anime")
                .hobby("Guitar")
                .build();

        Assertions.assertEquals(1L, farrel.getId());
        Assertions.assertEquals("Farrel", farrel.getName());
        Assertions.assertEquals(25, farrel.getAge());
        Assertions.assertEquals(5, farrel.getHobbies().size());
        Assertions.assertArrayEquals(new List[]{hobbies}, new List[]{farrel.getHobbies()});
        Assertions.assertArrayEquals(hobbies.toArray(new String[0]), farrel.getHobbies().toArray(new String[0]));
    }
}