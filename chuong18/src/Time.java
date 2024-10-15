public class Time {
    private int hour;
    private int minute;
    private int second;
    public Time(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;

    }
    public void setHour(int hour) {
        this.hour = hour;

    }
    public void setMinute(int minute) {
        this.minute = minute;
    }
    public void setSecond(int second) {
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
        return hour + ":" + minute + ":" + second;
    }
    public void setTime(int hour, int minute, int second) {
        setHour(hour);
        setMinute(minute);
        setSecond(second);
    }
    public  Time nextSecond(){
        second++;
        if (second<=0) {
            second += 60;
            minute--;
        }
        if (second>59){
            second=0;
            minute++;
        }
        if (minute<=0){
            minute+=60;
            hour--;
        }
        if (minute>59){
            minute=0;
            hour++;
        }
        if (hour<=0){
            hour+=24;
        }
        if (hour>23){
            hour=0;
        }
        return this;


    }
    public Time previousSecond() {
        second--;
        if (second<=0) {
            second += 60;
            minute--;
        }
        if (second>59){
            second=0;
            minute++;
        }
        if (minute<=0){
            minute+=60;
            hour--;
        }
        if (minute>59){
            minute=0;
            hour++;
        }
        if (hour<=0){
            hour+=24;
        }
        if (hour>23){
            hour=0;
        }
        return this;
    }

}
