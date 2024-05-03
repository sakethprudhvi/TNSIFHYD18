
import Branch.*;

public class Student {	
	public static void main(String[] args) {
		Cse s1 = new Cse();
		Cse s2 = new Cse();
		Ece s3 = new Ece();
		s1.id="cse1";
		s1.name="Yoru";
		s1.m1=92;
		s1.m2=98;
		s1.m3=88;
		s1.m4=72;
		s1.m5=94;
		s1.m6=69;
		
		s2.id="cse2";
		s2.name="Gekko";
		s2.m1=96;
		s2.m2=98;
		s2.m3=96;
		s2.m4=82;
		s2.m5=89;
		s2.m6=97;
		
		s3.id="ece1";
		s3.name="Sage";
		s3.m1=96;
		s3.m2=74;
		s3.m3=98;
		s3.m4=90;
		s3.m5=78;
		s3.m6=93;
		
		s1.displayinfo();
		s2.displayinfo();
		s3.displayinfo();
	}

}
