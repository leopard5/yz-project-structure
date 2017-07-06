package com.yz.demo.util;

import java.util.Calendar;

public class ThreadNow {

	public static Calendar now() {
		return Calendar.getInstance();
	}

	public static long nowInMs() {
		return now().getTimeInMillis();
	}

	public static String yyyyMMddHHmmss() {
		return FormatUtil.formatYYYYMMDDHHMMSS(now().getTime());
	}

	public static String yyyyMMdd() {
		return FormatUtil.formatYYYYMMDD(now().getTime());
	}
}
