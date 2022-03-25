package com.company;

import java.util.Date;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("1 để bắt đầu");
        String start = scanner.next();
        long time1 = System.currentTimeMillis();
        System.out.println("startTime = "+time1);
        System.out.println("0 để kết thúc");
        start = scanner.next();
        long time2 = System.currentTimeMillis();
        System.out.println("endTime = "+time2);
        StopWatch stopWatch = new StopWatch(time1,time2);
        System.out.println("time = "+stopWatch.elapsedTime()+"miligiay");

    }
}
