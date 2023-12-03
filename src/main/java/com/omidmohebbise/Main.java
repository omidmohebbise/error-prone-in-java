package com.omidmohebbise;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main (String[] args) {
        //fromArgumentError();
        formatDate();
    }

    private static void fromArgumentError() {
        Set<Short> s = new HashSet<>();
        for (short i = 0; i < 100; i++) {
            s.add(i);
            s.remove(i - 1);
        }
        System.out.println(s.size());
    }

    public static void formatDate() {
        Date date = new Date();
        SimpleDateFormat ft = new SimpleDateFormat("MM-dd-yyyy");
        System.out.println("Format Date: " + ft.format(date));
    }
}