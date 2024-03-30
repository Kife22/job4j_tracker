package ru.job4j.search;

import org.junit.jupiter.api.Test;

import javax.swing.plaf.PanelUI;
import java.util.ArrayList;

import static org.assertj.core.api.Assertions.assertThat;

public class PhoneDictionaryTest {
    @Test
    public void whenFindByName() {
        PhoneDictionary phones = new PhoneDictionary();
        phones.add(
                new Person("Petr", "Arsentev", "534872", "Bryansk")
        );
        ArrayList<Person> persons = phones.find("Petr");
        assertThat(persons.get(0).getSurname()).isEqualTo("Arsentev");
    }

    @Test
    public void whenListEmpty() {
        PhoneDictionary phones1 = new PhoneDictionary();
        phones1.add(
                new Person("Kirill", "Gutnik", "432425", "Chita")
        );
        ArrayList<Person> persons = phones1.find("Artem");
        assertThat(persons).isEmpty();
    }
}