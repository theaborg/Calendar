package se.liu.thebo717.calendar;

import java.util.ArrayList;
import java.util.List;

public class Cal
{
    private List<Appointment> appointments;

    public Cal() {
        appointments = new ArrayList<>();
    }

    public void show(){
        for (Appointment appointment : appointments) {
            System.out.println(appointment);
        }
    }

    public void book(int year, String month, int day,
                     int startHour, int startMinute, int endHour,
                     int endMinute, String subject){
        if (23<startHour || startHour<0 || 23<endHour || endHour<0 ||
            59< startMinute || startMinute<0 || 59<endMinute || endMinute <0){
            throw new IllegalArgumentException("Invalid time");
        }
        else if (year<=1970){
            throw new IllegalArgumentException("Invalid year");
        }
        Month appointmentMonth = new Month(month);
        if (day > appointmentMonth.getDays()){
            throw new IllegalArgumentException("Invalid day of month");
        }
        SimpleDate date = new SimpleDate(year, appointmentMonth, day);
        TimePoint startTime = new TimePoint(startHour, startMinute);
        TimePoint endTime = new TimePoint(endHour, endMinute);
        TimeSpan timeSpan = new TimeSpan(startTime, endTime);
        Appointment appointment = new Appointment(subject, date, timeSpan);
        appointments.add(appointment);
    }

    public static void main(String[] args) {

    }
}

