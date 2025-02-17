package dev.patriciafb.javalist;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import java.util.List;

public class weeekDayHandlerTest {

    @Test
    @DisplayName ("weeekDayHandlerTest")
    void weeekDayHandler() {
        WeekList weekList = new WeekList();

        List<String> days = weekList.getDaysofTheWeek();

        assertThat(days, contains(
                "Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado", "Domingo"
        ));
        
    }

}
