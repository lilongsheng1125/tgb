package com.ucredit.infra.agent.test;

import org.apache.commons.lang3.StringUtils;

/**
 * 重试机制代码
 * @author longsheng li
 *
 */
public class TestRetry {

	public final static  int RETRY_TIMES=5;

	public static void main(String[] args) {
		
		int retryTimes=RETRY_TIMES;
		
		while (retryTimes>0) {
			
			String result= doBuiness("lilongsheng");
			
			if (StringUtils.isBlank(result)) {
				System.out.println("重试次数:"+retryTimes);
				retryTimes--;
			}
			
		}
		
	}
	
	public static String doBuiness(String value)
	{
		return "";
	}
}
