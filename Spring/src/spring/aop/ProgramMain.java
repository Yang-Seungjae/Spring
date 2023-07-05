package spring.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import spring.di.entity.Exam;

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

		ApplicationContext context = new ClassPathXmlApplicationContext("spring/aop/setting.xml");

		Exam exam = context.getBean("exam", Exam.class);
		System.out.printf("total : %d\n", exam.total());
		System.out.printf("average : %f\n", exam.average());

	}

}
