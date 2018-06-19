package radis;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test1 {
	String name;
	@Test
	public void f1(){
		String conf="applicationContext.xml";
		ApplicationContext ctx=new ClassPathXmlApplicationContext(conf);
		Test1 test1=ctx.getBean("test1",Test1.class);
		System.out.println(test1.getName());
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
