package dev.patriciafb.javalist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class WeekDayHandler {
private List<String> days;

public WeekDayHandler() {
    this.days = new ArrayList<>(Arrays.asList("Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"));
}

public List<String> createList() {
    return new ArrayList<>(days);
}


public List<String> getDays() {
    return days();
    }

    private List<String> days() {
    return days;
    }

    private List<String> weekDays() {
    this.days = Arrays.asList("Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday");
    return days;
}

public int getSizeList() {
    return days.size();
}

public void removeDay(String day) {
    days.remove(day);
}

public String getSpecificDay(String string) {
    String day = string;
            return days.contains(day) ? day : null;
}

public boolean dayExists(String day) {
    return days.contains(day);
}
}


