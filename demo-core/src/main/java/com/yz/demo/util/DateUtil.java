package com.yz.demo.util;

import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.TimeZone;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;


public class DateUtil {
	
	public static final long MILLI_SECONDS_IN_ONE_DAY = 24 * 3600 * 1000;
	
	//2001-07-04T12:08:56.235-07或2001-07-04T12:08:56.235Z
    public static final String PATTERN_ISO8601_ONELETTER = "yyyy-MM-dd'T'HH:mm:ss.SSSX";
    //2001-07-04T12:08:56.235-0700或2001-07-04T12:08:56.235Z
	public static final String PATTERN_ISO8601_TWOLETTER = "yyyy-MM-dd'T'HH:mm:ss.SSSXX";
	//2001-07-04T12:08:56.235-07:00或2001-07-04T12:08:56.235Z
	public static final String PATTERN_ISO8601_THREELETTER = "yyyy-MM-dd'T'HH:mm:ss.SSSXXX";
	
	//2001-07-04T12:08:56.235-0700或2001-07-04T12:08:56.235+0000
	public static final String PATTERN_RFC822 = "yyyy-MM-dd'T'HH:mm:ss.SSSZ";
	
	public static final String LOCAL_TIMESTAMP_PATTERN = "yyyy/MM/dd HH:mm:ss";
	public static final String LOCAL_DATE_PATTERN = "yyyy/MM/dd";
	
	public static final String DEFAULT_TIMESTAMP_PATTERN = "yyyy-MM-dd HH:mm:ss";
	public static final String DEFAULT_TIMESTAMP_PATTERN_NO_SEONCDS = "yyyy-MM-dd HH:mm";
	public static final String DEFAULT_TIMESTAMP_PATTERN_NO_SEONCDS2 = "yyyy-MM-dd HHmm";
	public static final String DEFAULT_DATE_PATTERN = "yyyy-MM-dd";
	public static final String DEFAULT_TIME_PATTERN = "HH:mm:ss";
	public static final String DEFAULT_TIME_PATTERN_NO_SEONCDS = "HH:mm";
	
	public static final String DEFAULT_TIME_ZONE_ID = TimeZone.getDefault().getID();
	
	private static final DatatypeFactory dtf;
	
	static {
		 try {
			dtf = DatatypeFactory.newInstance();
		} catch (DatatypeConfigurationException e) {
			throw new RuntimeException(e);
		}
	}
	
	/**
	 * 
	 * @param s
	 * @return
	 */
	public static Date parseTimestampWithoutSeconds(String s) {
		return parse(s, DEFAULT_TIMESTAMP_PATTERN_NO_SEONCDS);
	}
	
	/**
	 * 
	 * @param s
	 * @return
	 */
	public static Date parseTimestamp(String s) {
		return parse(s, DEFAULT_TIMESTAMP_PATTERN);
	}
	
	/**
	 * 
	 * @param s
	 * @return
	 */
	public static Date parseDate(String s) {
		return parse(s, DEFAULT_DATE_PATTERN);
	}
	
	/**
	 * 
	 * @param s
	 * @return
	 */
	public static Date parseTime(String s) {
		return parse(s, DEFAULT_TIME_PATTERN);
	}
	
	/**
	 * 
	 * @param s
	 * @return
	 */
	public static Date parseTimeWithoutSeconds(String s) {
		return parse(s, DEFAULT_TIME_PATTERN_NO_SEONCDS);
	}
	
	/**
	 * 
	 * @param s
	 * @param pattern
	 * @return
	 */
	public static Date parse(String s, String pattern) {
		if(StringUtil.isNullorEmpty(s) || StringUtil.isNullorEmpty(pattern)) {
			return null;
		}
		
		try {
			return new SimpleDateFormat(pattern).parse(s);
		} catch (ParseException e) {
			//ignore
			return null;
		}
	}
	
	/**
	 * 
	 * @param date
	 * @return
	 */
	public static String formatTimestamp(Date date) {
		return format(date, DEFAULT_TIMESTAMP_PATTERN);
	}
	
	/**
	 * 
	 * @param date
	 * @return
	 */
	public static String formatTimestampWithoutSeconds(Date date) {
		return format(date, DEFAULT_TIMESTAMP_PATTERN_NO_SEONCDS);
	}
	
	/**
	 * 
	 * @param date
	 * @return
	 */
	public static String formatDate(Date date) {
		return format(date, DEFAULT_DATE_PATTERN);
	}
	
	/**
	 * 
	 * @param date
	 * @return
	 */
	public static String formatTime(Date date) {
		return format(date, DEFAULT_TIME_PATTERN);
	}
	
	/**
	 * 
	 * @param date
	 * @return
	 */
	public static String formatTimeWithoutSeconds(Date date){
		return format(date, DEFAULT_TIME_PATTERN_NO_SEONCDS);
	}
	
	/**
	 * 
	 * @param date
	 * @param pattern
	 * @return
	 */
	public static String format(Date date, String pattern) {
		if(date == null || StringUtil.isNullorEmpty(pattern)) {
			return null;
		}
		return new SimpleDateFormat(pattern).format(date);
	}
	
	/**
	 * 
	 * @return
	 */
	public static Timestamp GetCurrentTimeStamp()
	{
		return new Timestamp(new Date().getTime());
	}
	
	public static Date now(){
		return new Date();
	}
	
	/**
	 * 
	 * @param date
	 * @return
	 */
	public static Date minInDay(Date date) {
		if(date == null) return null;
		
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		calendar.set(Calendar.HOUR_OF_DAY, 0);
		calendar.set(Calendar.MINUTE, 0);
		calendar.set(Calendar.SECOND, 0);
		calendar.set(Calendar.MILLISECOND, 0);
		return calendar.getTime();
	}
	
	/**
	 * 
	 * @param date
	 * @return
	 */
	public static java.sql.Date toSqlDate(Date date){
		if(date == null) return null;
		
		return new java.sql.Date(date.getTime());
	}
	
	/**
	 * 
	 * @param date
	 * @return
	 */
	public static java.sql.Time toSqlTime(Date date){
		if(date == null) return null;
		
		return new java.sql.Time(date.getTime());
	}
	
	/**
	 * 使用date的年月日和time的时分秒，拼接成timestamp
	 * @param date
	 * @param time
	 * @return
	 */
	public static java.sql.Timestamp toSqlTimeStamp(Date date, Date time){
		Calendar tmp = Calendar.getInstance();
		tmp.setTime(time);
		
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		calendar.set(Calendar.HOUR_OF_DAY, tmp.get(Calendar.HOUR_OF_DAY));
        calendar.set(Calendar.MINUTE, tmp.get(Calendar.MINUTE));
        calendar.set(Calendar.SECOND, tmp.get(Calendar.SECOND));
        calendar.set(Calendar.MILLISECOND, tmp.get(Calendar.MILLISECOND));
		
		return new java.sql.Timestamp(calendar.getTimeInMillis());
	}
	
	/**
	 * 
	 * @param date
	 * @return
	 */
	public static java.sql.Timestamp toSqlTimeStamp(Date date){
		if(date == null) return null;
		
		return new java.sql.Timestamp(date.getTime());
	}
	
	/**
	 * 
	 * @param date
	 * @return
	 */
	public static java.util.Date toUtilDate(java.sql.Date date){
		if(date == null) return null;
		
		return new java.util.Date (date.getTime());
	}
	
	/**
	 * 
	 * @param time
	 * @return
	 */
	public static java.util.Date toUtilDate(java.sql.Time time){
		if(time == null) return null;
		
		return new java.util.Date (time.getTime());
	}
	
	/**
	 * 
	 * @param timestamp
	 * @return
	 */
	public static java.util.Date toUtilDate(java.sql.Timestamp timestamp){
		if(timestamp == null) return null;
		
		return new java.util.Date (timestamp.getTime());
	}
	
	/**
	 * 
	 * @param date
	 * @return
	 */
	public static Calendar toCalendar(Date date){
		if(date == null) return null;
		
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		return calendar;
	}
	
	/**
	 * 
	 * @param date
	 * @return
	 */
	public static XMLGregorianCalendar toXMLGregorianCalendar(Date date){
		if(date == null) return null;
		
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
	    XMLGregorianCalendar ret =  dtf.newXMLGregorianCalendar(
	    	calendar.get(Calendar.YEAR),
	        calendar.get(Calendar.MONTH) + 1,
	        calendar.get(Calendar.DAY_OF_MONTH),
	        calendar.get(Calendar.HOUR_OF_DAY),
	        calendar.get(Calendar.MINUTE),
	        calendar.get(Calendar.SECOND),
	        calendar.get(Calendar.MILLISECOND),
	        calendar.get(Calendar.ZONE_OFFSET)/(1000*60));
	    
	    return ret;
	}
	
	/**
	 * 
	 * @param calendar
	 * @return
	 */
	public static Date toDate(Calendar calendar) {
		if(calendar == null) return null;
		
		return calendar.getTime();
	}
	
	/**
	 * 
	 * @param xmlGregorianCalendar
	 * @return
	 */
	public static Date toDate(XMLGregorianCalendar xmlGregorianCalendar){
		if(xmlGregorianCalendar == null) return null;
		
		return xmlGregorianCalendar.toGregorianCalendar().getTime();  
	}
	
	/**
	 * 
	 * @param day1 不能为空
	 * @param day2 不能为空
	 * @return
	 */
	public static boolean isSameDay(Date day1, Date day2) {
	    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
	    String ds1 = sdf.format(day1);
	    String ds2 = sdf.format(day2);
	    if (ds1.equals(ds2)) {
	        return true;
	    } else {
	        return false;
	    }
	}
	
    /**  
     * 计算两个日期之间相差的天数  
     * @param smdate 较小的时间 ，不能为空
     * @param bdate  较大的时间 ，不能为空
     * @return 相差天数 
     * @throws ParseException  
     */    
    public static long daysBetween(Date smdate,Date bdate)
    {          
        long time1 = minInDay(smdate).getTime();  
        long time2 = minInDay(bdate).getTime();         
        long between_days=(time2-time1)/(1000*3600*24);  
            
       return between_days;           
    } 
    
    public static String getHour(long time) {
		 float hour = (float)((float)(time)/(float)(60*60*1000));
		 hour = (float)(Math.round(hour*10) / (float)10);
		 return hour + "";
	}
    
    public static Date addDay(Date date,int dayNum) {	   
	    Calendar   calendar   =   new   GregorianCalendar(); 
	    calendar.setTime(date); 
	    calendar.add(calendar.DATE,dayNum);//把日期往后增加一天.整数往后推,负数往前移动 
	    return calendar.getTime();   //这个时间就是日期往后推一天的结果		
    }
    
    /***
     * 去掉时分秒信息
     * @throws ParseException 
     */
    public static Date getDate(Date date) throws ParseException{
    	SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
    	String s = sdf.format(date);
    	return sdf.parse(s);
    }
}
