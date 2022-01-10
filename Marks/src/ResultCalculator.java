
public class ResultCalculator {
	public Result calculateResult(Student student){
		int total=student.getMark1()+student.getMark2()+student.getMark3();
		int average=total/3;
		Result result=new Result();
		result.setRollNo(student.getRollNo());
		if(average>40){
			result.setGrade("Pass");
		}else{
			result.setGrade("Fail");
		}
		return result;
	}
}
	