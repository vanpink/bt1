public class Date {
    private int year;
    private int month;
    private int day;
    public Date(int day, int month, int year) {
        this.year = year;
        this.month = month;
        this.day = day;
    }
    public void setDay(int day) {
        this.day = day;
    }
    public int getDay() {
        return day;
    }
    public void setMonth(int month) {
        this.month = month;
    }
    public int getMonth() {
        return month;
    }
    public void setYear(int year) {
        this.year = year;
    }
    public int getYear() {
        return year;
    }
    public void setDate(int day, int month, int year) {
        this.year = year;
        this.month = month;
        this.day = day;
    }
    public String toString() {
        return day + "/" + month + "/" + year;
    }

}
