package de.mytfg.jufo.ibis.util;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Utils {

    // Reads an InputStream and converts it to a String.
    public static String readStream(InputStream stream) throws IOException {
        BufferedReader r = new BufferedReader(new InputStreamReader(stream));
        StringBuilder total = new StringBuilder();
        String line;
        while ((line = r.readLine()) != null) {
            total.append(line);
        }
        return total.toString();
    }

    public static String roundDecimals(double d) {
        return String.format("%.2f", d);
    }

    public static String formatTime(double secondsInput) {
        String time;
        //calculate hours, seconds and minutes
        int seconds = (int) Math.round(secondsInput % 60);
        int minutes = (int) Math.round(((secondsInput - seconds) % 3600) / 60);
        int hours = (int) Math.round((secondsInput - seconds - minutes * 60) / 3600);
        String hoursStrg = putZero(hours);
        String minutesStrg = putZero(minutes);
        String secondsStrg = putZero(seconds);
        time = hoursStrg + "h " + minutesStrg + "min " + secondsStrg + "s";
        return time;
    }

    //put 0 before value, if != 0 and < 10
    private static String putZero(int time_value_in) {
        String time_value_out;
        if ((time_value_in != 0) && (time_value_in < 10)) {
            time_value_out = "0" + time_value_in;
        } else {
            time_value_out = Integer.toString(time_value_in);
        }
        return time_value_out;
    }

}