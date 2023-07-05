package spring.di.ui;

import spring.di.entity.Exam;

public class GridDisplay implements DisplayExam {

	private Exam exam;

	@Override
	public void display() {
		System.out.println("-----------------------------------------------------------");
		System.out.printf("total 	 |  %d \n", exam.total());
		System.out.printf("Average  |  %f \n", exam.average());
		System.out.println("-----------------------------------------------------------");
	}

	public void setExam(Exam exam) {
		this.exam = exam;

	}

}
