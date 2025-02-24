package dev.patriciafb.javalist;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.contains;
import static org.hamcrest.Matchers.is;

import java.util.List;

class WeekDayHandlerTest {

    @Test
    @DisplayName("createListTest")
    void createListTest() {
        WeekDayHandler weekDayHandler = new WeekDayHandler();
        List<String> weekDays = weekDayHandler.createList();
        assertThat(weekDays, contains("Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"));
    }

    @Test
    @DisplayName("getDaysTest")
    void getDaysTest() {
        WeekDayHandler weekDayHandler = new WeekDayHandler();
        List<String> weekDays = weekDayHandler.getDays();
        assertThat(weekDays, contains("Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"));

    }

    @Test
    @DisplayName("getSizeListTest")
    void getSizeListTest() {
        int SizeExpected = 7;
        WeekDayHandler weekDayHandler = new WeekDayHandler();
        List<String> weekDays = weekDayHandler.getDays();
        assertThat(weekDays.size(), is(7));
    }

    @Test
    @DisplayName("deleteDayTest")
    void deleteDayTest() {
        WeekDayHandler weekDayHandler = new WeekDayHandler();
        weekDayHandler.removeDay("Monday");

        List<String> expectedDays = List.of("Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday");

        assertThat(weekDayHandler.getDays(), contains(expectedDays.toArray()));
    }

    @Test
    @DisplayName("getSpecificDayTest")
    void getSpecificDayTest() {
        WeekDayHandler weekDayHandler = new WeekDayHandler();
        String day = weekDayHandler.getSpecificDay("Wednesday");
        assertThat(day, is("Wednesday"));
    }

    }

}

