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
		String reg1=".+\\.xml$";//xml�ļ�
		String reg2="[\u4e00-\u9fa5]+";//�����ַ���������ʽ
		String reg3="[^\\x00-\\xff]+";//˫�ֽ��ַ�
		String reg4="\\s+";//�հ��е�������ʽ
		String reg5="<(.*)>(.*)<\\/(.*)>|<(.*)\\/>";//HTML��ǵ�������ʽ
		String reg6="[1-9]d{5}(?!d)";//�й���������
		String reg7="^(1\\d{2}|2[0-4]\\d|25[0-5]|[1-9]\\d|[1-9])\\."

+"(1\\d{2}|2[0-4]\\d|25[0-5]|[1-9]\\d|\\d)\\."

+"(1\\d{2}|2[0-4]\\d|25[0-5]|[1-9]\\d|\\d)\\."

+"(1\\d{2}|2[0-4]\\d|25[0-5]|[1-9]\\d|\\d)$";//IP��ַ
		
		String aa="dsad..xml";		
		System.out.println(aa.matches(reg1));
		
		Matcher m=Pattern.compile(reg3).matcher(aa);
		System.out.println(m.matches());
	}
	
	public void no3()
	{
		String reg1="\\w+([\\w-]+)*@[a-zA-Z0-9]+com";//Email��ַ
		String reg2="[a-z]+://www\\.[a-zA-Z]+\\.[a-zA-Z]+";//����
		String reg3="[a-zA-z]+://[^s]*";//InternetURL
		String reg4="^[1][3578]\\d{9}";//�ֻ�����
		String reg5="(\\d{14}[x|0-9])|(\\d{17}[x|0-9])";//���֤��(15λ��18λ����)�����һλ��У��λ������Ϊ���ֻ��ַ�X
		String reg6="^[a-zA-Z]\\w{4,15}";//�ʺ��Ƿ�Ϸ�(��ĸ��ͷ������5-16�ֽڣ�������ĸ�����»���)
		String reg7="^[a-zA-Z]\\w{5,17}";//����(����ĸ��ͷ��������6~18֮�䣬ֻ�ܰ�����ĸ�����ֺ��»���)
		String reg8="";//ǿ����(���������Сд��ĸ�����ֵ���ϣ�����ʹ�������ַ���������8-10֮��)
		String reg9="\\d{4}((0?[1-9])|(1[0-2]))((0?[1-9])|([12][0-9])|(3[01]))";//���ڸ�ʽ
		String reg10="0?[1-9]|1[0-2]";//һ���12����
		String reg11="(0?[1-9])|([12][0-9])|(3[01])";//һ���µ�31��
	
		String aa="https://www.da.d";		
		System.out.println(aa.matches(reg2));		
	}
	
	public void no2()
	{
		String reg1="[\u4e00-\u9fa5]+";//����
		
		String reg2="[a-zA-Z0-9]";//Ӣ�ĺ�����
		
		String reg3=".{3,20}";//����Ϊ3-20�������ַ�
		
		String reg4="[a-zA-Z]+";//��26��Ӣ����ĸ��ɵ��ַ���
		
		String reg5="[A-Z]+";//��26����дӢ����ĸ��ɵ��ַ���
		
		String reg6="[a-z]+";//��26��СдӢ����ĸ��ɵ��ַ���
		
		String reg7="[a-zA-Z0-9]+";//�����ֺ�26��Ӣ����ĸ��ɵ��ַ���
		
		String reg8="\\w+";//�����֡�26��Ӣ����ĸ�����»�����ɵ��ַ���
		
		String reg9="([\\u4e00-\\u9fa5]||\\w)+";//���ġ�Ӣ�ġ����ְ����»���
		
		String reg10="([[\\u4e00-\\u9fa5]||\\w&&[^_]])+";//���ġ�Ӣ�ġ����ֵ��������»��ߵȷ���
		
		String reg11="[\\^%&',;=$?\\\\]+";//�������뺬��^%&',;=?$\"���ַ�
		String reg12="[^~]+";//��ֹ���뺬��~���ַ�
		
		String aa="f";
		
		System.out.println(aa.matches(reg12));
	}
	
	
	public void no1()
	{
		
		
		String str="\\d";//����
		
		String str1="\\d{n}";//nλ������
				
		String str2="\\d{n,}";//����nλ������
		
		String str3="\\d{m,n}";//m-nλ������
		
		String str4="^\\d";//��ͷ��㿪ͷ������
		
		String str5="^[1-9]+\\.\\d{1,2}";//���㿪ͷ��������λС��������
		
		String str6="-?(0|\\d+)\\.\\d{1,2}";//��1-2λС������������
		
		String str7="\\+?\\d+";//����
		String str7_1="-\\d+";//����
		String str7_2="(0|[0-9]+)\\.\\d+";//С��
		
		String str8="\\+?(0|[0-9]+)\\.\\d{2}";//����λС������ʵ��
		
		String str9="\\+?(0|[0-9]+)\\\\.\\\\d{1,3}";//��1~3λС������ʵ��
		
		String str10="\\+?[1-9]\\d*";//�����������
		
		String str11="-[1-9]\\d*";//����ĸ�����
		
		String str12="\\+?\\d+";//�Ǹ�����
		
		String str13="-\\d+";//��������
		
		String str14="(0|[1-9]+)\\.\\d*";//�Ǹ�������
		
		String str15="-\\d+\\.\\d*";//����������
		
		String Str16="\\+?(0|[0-9]+)\\.\\d+";//��������
		
		String Str17="-(0|[0-9]+)\\.\\d+";//��������
		
		String Str18="(0|[0-9]+)\\.\\d+";//������		
		
		String aa="120.10";
		System.out.println(aa.matches(str14));
		
	}

}
