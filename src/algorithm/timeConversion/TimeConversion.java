package algorithm.timeConversion;

public class TimeConversion {
    public static String timeConversion(String s) {
        String newFormat = "";
        if (s.contains("PM")) {
            int hour = Integer.parseInt(s.substring(0, 2));
            if (hour == 12){
                newFormat = hour + s.substring(2, 8);
            }
            else {
                hour += 12;
                newFormat = hour + s.substring(2, 8);
            }
        } else if (s.contains("AM")) {
            int hour = Integer.parseInt(s.substring(0, 2));
            if (hour == 12) {
                hour = 0;
                newFormat = hour + "0" + s.substring(2, 8);
            } else {
                newFormat = "0" + hour + s.substring(2, 8);
            }
        }
        return newFormat;
    }

    public static void main(String[] args) {
        String time = "12:45:54PM";
        System.out.println(timeConversion(time));
    }
}
