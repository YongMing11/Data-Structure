/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LAB3;

import java.util.Scanner;

/**
 *
 * @author Forge-15 1650
 */
public class Q4 {

    final static int[] notleap = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    final static int[] leap = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    final static String[] dayname = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday",
        "Saturday", "Sunday"};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = "13/4/2016";
        System.out.println("Today Date (dd/mm/yyyy): " + str);
//        String str = sc.nextLine();
        String d = "Wednesday";
        System.out.println("Today is on " + d);
//        String d = sc.nextLine();
        int i = 0;
        for (i = 0; i < dayname.length; i++) {
            if (dayname[i].equals(d)) {
                break;
            }
        }
        String search = "20/8/2015";
        System.out.println("Search Date (dd/mm/yyyy): " + search);
//        String search = sc.nextLine();
        String[] current = str.split("/");
        int[] now = new int[current.length];
        for(int j=0;j<current.length;j++){
            now[j]= Integer.parseInt(current[j]);
        }
        current = search.split("/");
        int[] check = new int[current.length];
        for(int j=0;j<current.length;j++){
            check[j]= Integer.parseInt(current[j]);
        }
        int dif = display(check[0],now[0],
                check[1],now[1],
                check[2],now[2]);
        System.out.println("Search Date is on " + day(dif, i));
    }

    public static boolean leap(int year) {
        return (year % 4 == 0 || year % 100 == 0 || year % 400 == 0);
    }

    public static String day(int daydifference, int ori) {
        int x = daydifference % 7;
//        System.out.println(daydifference);
//        System.out.println(x);
        if (ori - x < 0) {
            x = 7 - Math.abs(ori - x);
        } else {
            x = ori - x;
        }
        return dayname[x];
    }
    static int day = 1;

    public static int display(int d, int dd, int m, int mm, int y, int yy) {
        if (y < yy) {
            if (leap(y)) {
                if (day == 1) {
                    if (m > 1) {
                        day += 365;
                    } else {
                        day += 366;
                    }
                } else {
                    day += 366;
                }
            } else {
                day += 365;
            }
            y++;
//            System.out.println("year " + day);
//            System.out.println(y);
            display(d, dd, m, mm, y, yy);
        } else if (m < mm) {
            if (!leap(y)) {
                day += notleap[m - 1];
            } else {
                day += leap[m - 1];
            }
            m++;
//            System.out.println("month " + day);
//            System.out.println(m);
            display(d, dd, m, mm, y, yy);
        } else if (m > mm) {
            if (!leap(y)) {
                day -= notleap[mm - 1];
            } else {
                day -= leap[mm - 1];
            }
            mm++;
//            System.out.println("month " + day);
//            System.out.println(mm);
            display(d, dd, m, mm, y, yy);
        } else if (d < dd) {
            day += (dd - d);
//            System.out.println("day " + day);
        } else if (d > dd) {
            day -= (d - dd);
//            System.out.println("day " + day);
        }

        return day;
    }
}
