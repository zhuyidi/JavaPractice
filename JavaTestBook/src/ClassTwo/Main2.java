package ClassTwo;

import java.util.Scanner;

/**
 * Created by dela on 11/14/17.
 */
public class Main2 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int hour = scanner.nextInt();
        int minute = scanner.nextInt();
        int second = scanner.nextInt();
        BeijingTime beijingTime = new BeijingTime();

        beijingTime.setHour(hour);
        beijingTime.setMinute(minute);
        beijingTime.setSecond(second);
        beijingTime.showTime();
    }
}
class BeijingTime{
    private int hour;
    private int minute;
    private int second;

    public BeijingTime(int hour, int minute, int second){
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public BeijingTime(){}

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        if (hour < 0 || hour > 23){
            this.hour = 0;
            return;
        }
        this.hour = hour;
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        if(minute < 0 || minute > 59){
            this.minute = 0;
            return;
        }
        this.minute = minute;
    }

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        if(second < 0 || second > 59){
            this.second = 0;
            return;
        }
        this.second = second;
    }

    public void showTime(){
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "now BeijingTime is " + this.getHour() + ":" + this.getMinute() + ":" + this.getSecond();
    }
}