package spring.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import spring.di.ui.DisplayExam;

public class ProgramMain {

	public static void main(String[] args) {

//		Exam exam = new AiswExam(10, 10, 10);
//
////		DisplayExam displayExam = new InlineDisplayExam();
//		DisplayExam displayExam = new GridDisplay();
//
//		displayExam.setExam(exam);
//		displayExam.display();

		// Spring container

		ApplicationContext context = new ClassPathXmlApplicationContext("spring/di/setting.xml");
		DisplayExam displayExam = context.getBean(DisplayExam.class);

		displayExam.display();

	}

}
