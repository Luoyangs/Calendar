package com.haoxue.calendar;

import java.util.regex.Pattern;

/**
 * 说明:正则表达式
 * 作者:Luoyangs
 * 时间:2015-9-25
 */
public class RexUtil {

	/**判断字符串是否为数字*/
	public static boolean isNumeric(String str){ 
	    Pattern pattern = Pattern.compile("[0-9]*"); 
	    return pattern.matcher(str).matches();    
	 } 
}
