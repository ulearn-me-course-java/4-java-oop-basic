package com.example.task02;

public class Task02Main {
    public static void main(String[] args) {
        TimeSpan time1 = new TimeSpan(20, 10, 2);
        TimeSpan time2 = new TimeSpan(40, 60, 3);
        time1.add(time2);
    }
}

class TimeSpan{
   private int second;
   private int minute;
   private int hours;

   public TimeSpan(int second, int minute, int hours){
       this.second = second;
       this.minute = minute;
       this.hours = hours;
       checkSecond();
       checkMinute();

   }

   private void checkSecond(){
       if (second >= 60){
           while (second >= 60){
               minute++;
               second -= 60;
           }
       }
   }

    private void checkMinute(){
        if (minute >= 60){
            while (minute >= 60){
                hours++;
                minute -= 60;
            }
        }
    }

   public int getSecond(){
       return second;
   }

   public void setSecond(int second){
       this.second = second;
   }

   public int getMinute(){
       return minute;
   }

   public void setMinute(int minute){
       this.minute = minute;
   }

   public int getHours(){
       return hours;
   }

   public void setHours(int hours){
       this.hours = hours;
   }

   public void add(TimeSpan time){
       hours += time.getHours();
       minute += time.getMinute();
       second += time.getSecond();

       checkSecond();
       checkMinute();
   }

   public void subtract(TimeSpan time){
       if (second < time.getSecond()){
           while (second >= time.getSecond()){
               if(minute != 0){
                   minute--;
                   second += 60;
               }
               else System.out.println("Больше минут нет");
           }
       }
       second -= time.getSecond();

       if (minute < time.getMinute()){
           while (minute >= time.getMinute()){
               if(hours != 0){
                   hours--;
                   minute += 60;
               }
               else System.out.println("Больше часов нет");

           }
       }

       if (hours >= time.getHours()){
           hours -= time.getHours();
       }
       else{
           System.out.println("Часы невозможно вычислить");
       }
   }

   public String toString(){
       return String.format("Часы: %d, минуты: %d, секунды: %d", hours, minute, second);
   }
}
