package Language.OOPs;

public class TimeClass {
    public static void main(String[] args) {
        Time t = new Time(12,00,00);
        System.out.println(t);
    }
}

/* Design a class */
class Time{
    private int hour;
    private int minute;
    private int second;

    public Time() {
        this.hour = 0;
        this.minute = 0;
        this.second = 0;
    }
    public Time(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    public int getSecond() {
        return second;
    }

    public String toString() {
        return ""+getHour()+":"+getMinute()+":"+getSecond()+"";
    }

    public String checkTime() {
        return toString();
    }
}
