package dev.patriciafb.javalist;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.contains;
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




}
