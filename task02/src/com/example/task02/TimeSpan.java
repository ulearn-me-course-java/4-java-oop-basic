package com.example.task02;

public class TimeSpan {
        private int hour;
        private int minute;
        private int second;

        public TimeSpan(int hour, int minute, int second) {
            this.hour = hour;
            this.minute = minute;
            this.second = second;
        }

        public int getHour()
        {
            return this.hour;
        }
        public void setHour(int hour)
        {
            this.hour = hour;
        }

        public int getMinute()
        {
            return this.minute;
        }
        public void setMinute(int minute)
        {
            this.minute = minute;
        }

        public int getSecond()
        {
            return this.second;
        }
        public void setSecond(int second)
        {
            this.second = second;
        }

        // Method for adding
        void add(TimeSpan time)
        {
            this.hour += time.hour;
            this.minute += time.minute;
            this.second += time.second;
            //to be continuing :->

        }

        // Method for substraction
        void subtract(TimeSpan time)
        {
            this.hour -= time.hour;
            this.minute -= time.minute;
            this.second -= time.second;
            //to be continuing :->
        }

        //Formatting time
        public String toString()
        {
            return this.hour + ":" + this.minute + ":" + this.second;
        }
    }

}
