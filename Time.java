import java.util.Scanner;

class Time {
    int hour , minute , second;
    Scanner sc = new Scanner(System.in);
    public Time(int hour , int minute , int sec){
        this.hour = hour;
        this.minute = minute;
        this.second = sec;
    }
    void displayTime(){
        if(hour<=12){
            System.out.println(hour+" : "+minute+" : "+second+" AM");
        }else{
            System.out.println((hour%12)+" : "+minute+" : "+second+" PM");
        }
    }
	void time_Optimization(){
        int temp_sec =0 , temp_min =0 ;
        if(second>60){
            while(second>60){
                temp_sec++;
                second%=60;
            }
        }
        minute += temp_sec;
        if(minute>60){
            while(minute>60){
                temp_min++;
                minute%=60;
            }
        }
        hour += temp_min;
        if(hour>24){
            while(hour>24){
                hour%=24;
            }
        }
    }
    void addTime(Time t){
        hour += t.hour;
        minute += t.minute;
        second += t.second;
        time_Optimization();
    }

}
class time_checker{
    public static void main(String[] args) {
        Time time = new Time(14,22,10);
        Time time2 = new Time(14,88,66);
        time.displayTime();
        time.addTime(time2);
        System.out.println("After Addition ");
        time.displayTime();
    }
}
