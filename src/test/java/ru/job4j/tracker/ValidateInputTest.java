package ru.job4j.tracker;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

class ValidateInputTest {

    @Test
    void whenInvalidInput() {
        Output output = new StubOutput();
        Input in = new MockInput(
                new String[] {"one", "1"}
        );
        ValidateInput input = new ValidateInput(output, in);
        int selected = input.askInt("Enter menu:");
        assertThat(selected).isEqualTo(1);
    }

    @Test
    void whenInvalidInput1() {
        Output output = new StubOutput();
        Input in = new MockInput(
                new String[] {"one", "1", "two", "2", "three", "3", "four", "4"}
        );
        ValidateInput input = new ValidateInput(output, in);
        int select = input.askInt("Enter menu");
        assertThat(select).isEqualTo(1);
        int select2 = input.askInt("Enter menu");
        assertThat(select2).isEqualTo(2);
        int select3 = input.askInt("Enter menu");
        assertThat(select3).isEqualTo(3);
        int select4 = input.askInt("Enter menu");
        assertThat(select4).isEqualTo(4);
    }

    @Test
    void whenInvalidInput2() {
        Output output = new StubOutput();
        Input in = new MockInput(
                new String[] {"minus one", "-1"}
        );
        ValidateInput input = new ValidateInput(output, in);
        int selected = input.askInt("Enter menu:");
        assertThat(selected).isEqualTo(-1);
    }
}