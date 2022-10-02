class Patient
	{
		double BMI;
		double BMI(String Name ,double Weight,double Height)
		{
		BMI = ( Weight / ( Height* Height) )*703;
		return BMI;
		}
	}
class Patients
{
	public static void main(String[] args)
	{
		Patient P=new Patient();
		System.out.printf("%.2f",P.BMI("Shubham",70,72));
	}
}
	