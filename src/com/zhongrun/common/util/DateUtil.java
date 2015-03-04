package com.zhongrun.common.util;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateUtil {

	private static final DateFormat dfa = new SimpleDateFormat(
			"yyyy-MM-dd HH:mm:ss");
	/**
	 * 格式化日期 yyyy-MM-dd HH:mm:ss
	 * @param day
	 * @return
	 */
	public static String getFullDate(Date day) {
		
		return dfa.format(day);
	}
	
	public static String getFullDate(String day) {
		
		return dfa.format(day);
	}
	/**
	 * 字符转化为日期
	 * @param dateStr	格式化日期 yyyy-MM-dd HH:mm:ss
	 * @return Date
	 */
	public static Date parseDate(String dateStr){
		try {
			return dfa.parse(dateStr);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return null;
	}
	/**
	 * 字符转化为日期
	 * @param dateStr
	 * @param partten
	 * @return
	 */
	public static Date parseDate(String dateStr,String partten){
		SimpleDateFormat format = new SimpleDateFormat(partten);
		try {
			return format.parse(dateStr);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	/**
	 * 给给定时间加上N个月
	 * @param dy 所给时间
	 * @param n  需要加的月份
	 * @return
	 */
	public static Date AddMonthWithDate(Date dy,int n){ 
		Calendar c1 = Calendar.getInstance();  
		c1.setTime(dy);
		c1.add(Calendar.MONTH, n);    
		return c1.getTime();
	}
}
