package dev.patriciafb.javalist;

import java.util.Arrays;
import java.util.List;

public class WeekDayHandler {
    private List<String> weekDays;

    public List<String> createList() {
        return Arrays.asList("Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday");
    }


public List<String> getDays() {
      return weekDays();
          }


      private List<String> weekDays() {
        this.weekDays = Arrays.asList("Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday");
        return weekDays;
      }

}
