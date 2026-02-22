public class Time {
    private int hour;
    private int minute;

    public Time(String t) {
        String[] pieces = t.split(":");
        hour = Integer.parseInt(pieces[0]);
        minute = Integer.parseInt(pieces[1]);
    }

    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    public void setHour(int h) {
        hour = h;
    }

    public void setMinute(int m) {
        minute = m;

    }

    public String convert() {
        String retValue = "";
        if (hour > 12) {
            retValue = String.valueOf(hour - 12) + ":" + String.valueOf(minute) + "PM";
        } else if (hour == 12) {
            retValue = String.valueOf(hour) + ":" + String.valueOf(minute) + "PM";
        } else {
            retValue = String.valueOf(hour) + ":" + String.valueOf(minute) + "AM";
        }
        return retValue;
    }
}
