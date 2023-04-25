package DateUtil;

public class MyDate {
    private int day;
    private int month;
    private int year;

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        if(day<1) {
            this.day = 1;
        }else if (isMonth31days(getMonth())&&day>31 && (getMonth()!=2)) {
            this.day = 31;
        } else if (!isMonth31days(getMonth())&& day>30 && (getMonth()!=2)) {
            this.day = 30 ;
        } else if(isLeapYear(getYear())&&day>29 && (getMonth()==2)){
            this.day = 29;
        } else if (!isLeapYear(getYear())&&day>28  && (getMonth()==2)) {
            this.day = 28;
        } else{
            this.day = day;
        }

    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        if(month<1){
            this.month = 1;
        }else if (month>12){
            this.month =12;
        }else{
            this.month = month;
        }

    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        if(year<2023){
            this.year = 2023;
        } else if (year>2030) {
            this.year = 2030;
        }else{
            this.year = year;
        }
    }


    public boolean isLeapYear(int year){
        if(year%4==0){
            return true;
        }else {
            return false;
        }
    }

    public boolean isMonth31days (int month){
        if (month%2!=0){
            return true;
        }else{
            return false;
        }
    }



}
