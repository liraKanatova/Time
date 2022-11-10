import java.util.Scanner;

public class Time {
    private int hour;
    private int minute;
    private int second;

    public Time(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public Time() {
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        this.second = second;
    }

    @Override
    public String toString() {
        String hour1 = "";
        String min1 = "";
        String sek1 = "";
        String result = null;
        if (hour >= 0 && hour <= 23) {
            if (minute >= 0 && minute <= 59) {
                if (second >= 0 && second <= 59) {
                    if (this.hour <= 9) {
                        hour1 = "0";
                    }
                    if (this.minute <= 9) {
                        min1 = "0";
                    }
                    if (this.second <= 9) {
                        sek1 = "0";
                    }
                    result = hour1 + hour + ":" + min1 + minute + ":" + sek1 + second;
                } else {
                    result = " Invalid your number";
                }
            } else {
                result = " Invalid your number";
            }
        } else {
            result = " Invalid your number";
        }

        return result;
    }

    public void nextSecond() {
        if (second == 59) {
            if (minute == 59) {
                if (hour == 23) {
                    hour = 0;
                } else {
                    hour++;
                }
                minute = 0;
            } else {
                minute++;
            }
            second = 0;
        } else {
            second++;
        }

    }

    public void previousSecond() {
    if(second==0){
        if(minute==0){
            if(hour==0){
                hour=23;
            }else {
                hour--;
            }
            minute=59;
        }else{
            minute--;
        }
        second=59;
    }else {
        second--;
    }
    }
}
