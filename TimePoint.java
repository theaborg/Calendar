package se.liu.thebo717.calendar;

import com.google.gson.JsonObject;

public class TimePoint
{
    private int hour;
    private int minute;

    public TimePoint(int hour, int minute) {
        this.hour = hour;
        this.minute = minute;
    }

    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    @Override public String toString() {
        return String.format("%02d:%02d", getHour(),  getMinute());
    }

    public int compareTo(TimePoint other){
        if (other.hour == getHour() && other.minute == getMinute()){
            return 0;
        }
        else if (other.hour <= getHour() && other.minute <= getMinute()){
            return 1;
        }
        else{
            return -1;
        }
    }
}
