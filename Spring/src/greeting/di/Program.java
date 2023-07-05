package greeting.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import greeting.di.ui.Hello;

public class Program {

	public static void main(String[] args) {

		// spring container
		ApplicationContext context = new ClassPathXmlApplicationContext("greeting/di/setting.xml");
		Hello hello = context.getBean(Hello.class);
		// DisplayExam displayExam = (DisplayExam??)context.getBean("displayExam");

		// Exam exam = new AiswExam(10, 10, 10);
		// DisplayExam displayExam = new InlineDisplayExam();
		// DisplayExam displayExam = new GridDisplayExam();
		// displayExam.setExam(exam);
		hello.display();

	}

}
