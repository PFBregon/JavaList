import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.contains;
import java.util.List;

class WeekDayHandlerTest {

    @Test
    @DisplayName("weekDayHandlerTest")
    void weekDayHandlerList() {
        WeekDayHandler weekList = new WeekDayHandler();
        assertThat(days, contains(
                "Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado", "Domingo"
        ));
    }


}
