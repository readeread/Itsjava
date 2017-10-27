package com823.E;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexH {

	public static void main(String[] args) {
		RegexH reg=new RegexH();
		reg.no1();
	}
	
	public void no4()
	{
		String reg1=".+\\.xml$";//xml文件
		String reg2="[\u4e00-\u9fa5]+";//中文字符的正则表达式
		String reg3="[^\\x00-\\xff]+";//双字节字符
		String reg4="\\s+";//空白行的正则表达式
		String reg5="<(.*)>(.*)<\\/(.*)>|<(.*)\\/>";//HTML标记的正则表达式
		String reg6="[1-9]d{5}(?!d)";//中国邮政编码
		String reg7="^(1\\d{2}|2[0-4]\\d|25[0-5]|[1-9]\\d|[1-9])\\."

+"(1\\d{2}|2[0-4]\\d|25[0-5]|[1-9]\\d|\\d)\\."

+"(1\\d{2}|2[0-4]\\d|25[0-5]|[1-9]\\d|\\d)\\."

+"(1\\d{2}|2[0-4]\\d|25[0-5]|[1-9]\\d|\\d)$";//IP地址
		
		String aa="dsad..xml";		
		System.out.println(aa.matches(reg1));
		
		Matcher m=Pattern.compile(reg3).matcher(aa);
		System.out.println(m.matches());
	}
	
	public void no3()
	{
		String reg1="\\w+([\\w-]+)*@[a-zA-Z0-9]+com";//Email地址
		String reg2="[a-z]+://www\\.[a-zA-Z]+\\.[a-zA-Z]+";//域名
		String reg3="[a-zA-z]+://[^s]*";//InternetURL
		String reg4="^[1][3578]\\d{9}";//手机号码
		String reg5="(\\d{14}[x|0-9])|(\\d{17}[x|0-9])";//身份证号(15位、18位数字)，最后一位是校验位，可能为数字或字符X
		String reg6="^[a-zA-Z]\\w{4,15}";//帐号是否合法(字母开头，允许5-16字节，允许字母数字下划线)
		String reg7="^[a-zA-Z]\\w{5,17}";//密码(以字母开头，长度在6~18之间，只能包含字母、数字和下划线)
		String reg8="";//强密码(必须包含大小写字母和数字的组合，不能使用特殊字符，长度在8-10之间)
		String reg9="\\d{4}((0?[1-9])|(1[0-2]))((0?[1-9])|([12][0-9])|(3[01]))";//日期格式
		String reg10="0?[1-9]|1[0-2]";//一年的12个月
		String reg11="(0?[1-9])|([12][0-9])|(3[01])";//一个月的31天
	
		String aa="https://www.da.d";		
		System.out.println(aa.matches(reg2));		
	}
	
	public void no2()
	{
		String reg1="[\u4e00-\u9fa5]+";//汉字
		
		String reg2="[a-zA-Z0-9]";//英文和数字
		
		String reg3=".{3,20}";//长度为3-20的所有字符
		
		String reg4="[a-zA-Z]+";//由26个英文字母组成的字符串
		
		String reg5="[A-Z]+";//由26个大写英文字母组成的字符串
		
		String reg6="[a-z]+";//由26个小写英文字母组成的字符串
		
		String reg7="[a-zA-Z0-9]+";//由数字和26个英文字母组成的字符串
		
		String reg8="\\w+";//由数字、26个英文字母或者下划线组成的字符串
		
		String reg9="([\\u4e00-\\u9fa5]||\\w)+";//中文、英文、数字包括下划线
		
		String reg10="([[\\u4e00-\\u9fa5]||\\w&&[^_]])+";//中文、英文、数字但不包括下划线等符号
		
		String reg11="[\\^%&',;=$?\\\\]+";//可以输入含有^%&',;=?$\"等字符
		String reg12="[^~]+";//禁止输入含有~的字符
		
		String aa="f";
		
		System.out.println(aa.matches(reg12));
	}
	
	
	public void no1()
	{
		
		
		String str="\\d";//数字
		
		String str1="\\d{n}";//n位的数字
				
		String str2="\\d{n,}";//至少n位的数字
		
		String str3="\\d{m,n}";//m-n位的数字
		
		String str4="^\\d";//零和非零开头的数字
		
		String str5="^[1-9]+\\.\\d{1,2}";//非零开头的最多带两位小数的数字
		
		String str6="-?(0|\\d+)\\.\\d{1,2}";//带1-2位小数的正数或负数
		
		String str7="\\+?\\d+";//正数
		String str7_1="-\\d+";//负数
		String str7_2="(0|[0-9]+)\\.\\d+";//小数
		
		String str8="\\+?(0|[0-9]+)\\.\\d{2}";//有两位小数的正实数
		
		String str9="\\+?(0|[0-9]+)\\\\.\\\\d{1,3}";//有1~3位小数的正实数
		
		String str10="\\+?[1-9]\\d*";//非零的正整数
		
		String str11="-[1-9]\\d*";//非零的负整数
		
		String str12="\\+?\\d+";//非负整数
		
		String str13="-\\d+";//非正整数
		
		String str14="(0|[1-9]+)\\.\\d*";//非负浮点数
		
		String str15="-\\d+\\.\\d*";//非正浮点数
		
		String Str16="\\+?(0|[0-9]+)\\.\\d+";//正浮点数
		
		String Str17="-(0|[0-9]+)\\.\\d+";//负浮点数
		
		String Str18="(0|[0-9]+)\\.\\d+";//浮点数		
		
		String aa="120.10";
		System.out.println(aa.matches(str14));
		
	}

}
