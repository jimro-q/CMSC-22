

import java.util.*;


public class Date
{
	

		private int day = 1;
		private int month = 1;
		private int year = 1000;

	    Date(){

	    }     

	    Date(int z, int y, int x){
	    	this.day = x;
	    	this.month = y;
            this.year = z;
	    }

	    public int getYear(){
	    	return year;
	    }

	    public int getDay(){
	    	return day;
	    }

	    public int getMonth(){
	    	return month;
	    }

	    public void setYear(int year){ 
	    if (year < 1000 || year > 9999)
                throw new IllegalArgumentException("Invalid Year!");
                else
	    	this.year = year;
	    }

	    public void setDay(int day){
                if (day < 1 || day > 31)
                throw new IllegalArgumentException("Invalid Day!");
                else
	    	this.day = day;
	    }

	    public void setMonth(int  month){
                if (month < 1 || month > 12)
                throw new IllegalArgumentException("Invalid Month!");
                else
	    	this.month = month;
	    }

	    public String toString(){
	    	String date = String.format("%02d / %02d / %04d", day, month, year);
	    	return date;
	    }

	    public void setDate(int year, int month, int day){
	    	this.day = day;
	    	this.month = month;
            this.year = year;
	    }
}
