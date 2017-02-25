package com.fred1900.bop.utils;

/**
 * 字符串的工具类
 * 
 * @author Fred
 * @since 2017年2月25日
 *
 */
public class StringUtil {

	/**
	 * 判断字符串是否为空
	 * 
	 * @param str
	 * @return
	 */
	public static boolean isEmpty(String str) {
		return (str == null || str.length() == 0);
	}

	/**
	 * 判断字符串是否不为空
	 * 
	 * @param str
	 * @return
	 */
	public static boolean isNotEmpty(String str) {
		return (str != null && str.length() > 0);
	}
}
