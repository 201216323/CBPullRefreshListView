package com.zhl.CBPullRefresh.utils;

public enum TimeType {
	/**
	 * ��ͨ���ַ�����ʽ��yyyy-MM-dd hh:mm:ss��
	 */
	DEFAULT,
	
	/**
	 * ��ͨ���ַ���������ʽ��yyyy��MM��dd�� hhʱmm��ss�룩
	 */
	DEFAULT_CHINESS,
	
	/**
	 * ��ͨʱ��Ķ���ʽ��MM-dd HH:mm��
	 */
	DEFAULT_SHORT,
	
	/**
	 * ʱ���������ʽ��MM��dd�� hhʱmm�֣�
	 */
	DEFAULT_CHINESS_SHORT,
	
	/**
	 * ���������ѹ���ã����磺1����֮ǰ��1Сʱ֮ǰ��1��֮ǰ��
	 */
	FROMNOW,
	
	/**
	 * ʱ��������� ��yyyy-MM-dd��
	 */
	DEFAULT_YEAR;
}