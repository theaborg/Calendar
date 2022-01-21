package se.liu.thebo717.calendar;

public class Appointment
{
    private String subject;
    private SimpleDate date;
    private TimeSpan timeSpan;

    public Appointment(final String subject, final SimpleDate date, final TimeSpan timeSpan) {
        this.subject = subject;
        this.date = date;
        this.timeSpan = timeSpan;
    }

    public String getSubject() {
        return subject;
    }

    public SimpleDate getDate() {
        return date;
    }

    public TimeSpan getTimeSpan() {
        return timeSpan;
    }

    @Override public String toString() {
        return subject + " at " + timeSpan.toString() + " on the " + date.toString();
    }

    public static void main(String[] args) {
        TimePoint t1 = new TimePoint(12,15);
        TimePoint t2 = new TimePoint(12,55);
        TimeSpan ts = new TimeSpan(t1,t2);
        Month m = new Month("januari");
        SimpleDate d = new SimpleDate(2010,m,4);
        Appointment app = new Appointment("Häst", d, ts);
        System.out.println(app);
    }
}
