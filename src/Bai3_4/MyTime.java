package Bai3_4;

public class MyTime {
    private int hour;
    private int minute;
    private int second;

    public MyTime() {
        this.hour = 0;
        this.minute = 0;
        this.second = 0;
    }

    public MyTime(int hour, int minute, int second) {
        setTime(hour, minute, second);
    }

    public void setTime(int hour, int minute, int second) {
        setHour(hour);
        setMinute(minute);
        setSecond(second);
    }

    public int getHour() {
        return this.hour;
    }

    public int getMinute() {
        return this.minute;
    }

    public int getSecond() {
        return this.second;
    }

    public void setHour(int hour) {
        if (hour >= 0 && hour <= 23) {
            this.hour = hour;
        }
    }

    public void setMinute(int minute) {
        if (minute >= 0 && minute <= 59) {
            this.minute = minute;
        }
    }

    public void setSecond(int second) {
        if (second >= 0 && second <= 59) {
            this.second = second;
        }
    }

    public String toString() {
        return String.format("%02d:%02d:%02d", this.hour, this.minute, this.second);
    }

    public MyTime nextSecond() {
        this.second++;
        if (this.second > 59) {
            this.second = 0;
            nextMinute();
        }
        return this;
    }

    public MyTime nextMinute() {
        this.minute++;
        if (this.minute > 59) {
            this.minute = 0;
            nextHour();
        }
        return this;
    }

    public MyTime nextHour() {
        this.hour++;
        if (this.hour > 23) {
            this.hour = 0;
        }
        return this;
    }


    public MyTime previousSecond() {
        this.second--;
        if (this.second < 0) {
            this.second = 59;
            previousMinute();
        }
        return this;
    }

    public MyTime previousMinute() {
        this.minute--;
        if (this.minute < 0) {
            this.minute = 59;
            previousHour();
        }
        return this;
    }

    public MyTime previousHour() {
        this.hour--;
        if (this.hour < 0) {
            this.hour = 23;
        }
        return this;
    }
}
