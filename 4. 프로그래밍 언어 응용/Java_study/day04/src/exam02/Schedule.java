package exam02;

public class Schedule {
    private int year; // 년
    private int month; // 월
    private int day; // 일

    public void setYear(int _year) {
        year = _year;
    }

    public int getYear() {
        return year;
    }

    public void setMonth(int _month) {
        month = _month;
    }

    public int getMonth() {
        return month;
    }

    public void setDay(int _day) {

        if (month == 2 && _day > 28) {
            _day = 28;
        }

        day = _day;
    }

    public int getDay() {
        return day;
    }

    void showInfo() {
        System.out.println("year=" + year + ", month=" + month + ", day=" + day);
    }
}
