package spring.aop.entity;

public class AiswExam implements Exam {

	private int kor;
	private int eng;
	private int math;

	public AiswExam(int kor, int eng, int math) {
		super();
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}

	public AiswExam() {
		super();
	}

	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		this.math = math;
	}

	@Override
	public int total() {
		// 부가업무 생성 ( 시간 측정)

		long start = System.currentTimeMillis();
		int result = kor + eng + math;
		long end = System.currentTimeMillis();

		long duration = end - start;

		System.out.println(duration);

		return result;
	}

	@Override
	public float average() {
		float avg = (kor + eng + math) / 3;
		return avg;
	}

}
