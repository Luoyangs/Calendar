package com.haoxue.calendar;

import java.util.regex.Pattern;

/**
 * ˵��:������ʽ
 * ����:Luoyangs
 * ʱ��:2015-9-25
 */
public class RexUtil {

	/**�ж��ַ����Ƿ�Ϊ����*/
	public static boolean isNumeric(String str){ 
	    Pattern pattern = Pattern.compile("[0-9]*"); 
	    return pattern.matcher(str).matches();    
	 } 
}
