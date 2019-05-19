package com.taotao.activemq;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 
* @ClassName: TestSpringActiveMq 
* @Description: 消费者测试 
* @author xhj
* @date 2019-05-19 13:27
*
 */
public class TestSpringActiveMq {

	@Test
	public void testSpringActiveMq() throws Exception {
		//初始化spring容器
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:spring/applicationContext-activemq.xml");
		//等待
		System.in.read();
	}
}
