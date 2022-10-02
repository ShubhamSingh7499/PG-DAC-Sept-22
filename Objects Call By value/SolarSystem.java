import java.util.Scanner;
class Object2
{
		static double density(double m,double v)
		{
		double d=m/v;
		return d;
		}
				public static void main(String[] args)
				{
					Scanner sc=new Scanner(System.in);
					System.out.println("_____________Welcome to Solar System_____________");
					System.out.println(" 1. Earth");
					System.out.println(" 2. Mars");
					System.out.println(" 3. Jupiter");
					System.out.println(" 4. Saturn");
					System.out.println(" 5. Neptune");
					System.out.println(" 6. Mercury");
					System.out.println(" 7. Uranus");
					System.out.println(" 8. Venus");
					System.out.println("Enter the number whose details you want to fetch");
					int s=sc.nextInt();
													switch(s)
													{
													case  1 :
																System.out.println("Fetching the details of Earth.....");
																double a= 5.972*Math.pow(10,24);
																System.out.println("Mass of Earth = " +a);
																double b = Math.pow(10,12);
																System.out.println("Volume of Earth= "+b);
																double c=density(5.972*Math.pow(10,24) , Math.pow(10,12));
																System.out.println("Density of Earth = " +c);
																break;
													case  2 :
																System.out.println("Fetching the details of Mars.....");
																double y= 6.39*Math.pow(10,23);
																System.out.println("Mass of Mars = " +y);
																double e = 1.6318*Math.pow(10,11);
																System.out.println("Volume of Mars= "+e);
																double f=density(6.39*Math.pow(10,23) , 1.6318*Math.pow(10,11));
																System.out.println("Density of Mars = " +f);
																break;
													case  3 :
																System.out.println("Fetching the details of Jupiter......");
																double g= 1.89813*Math.pow(10,24);
																System.out.println("Mass of Jupiter = " +g);
																double h = 1.43128*Math.pow(10,15);
																System.out.println("Volume of Jupiter= "+h);
																double i=density(1.89813*Math.pow(10,24) , 1.43128*Math.pow(10,15));
																System.out.println("Density of Jupiter = " +i);
																break;
													case 4 :
																System.out.println("Fetching the details of Saturn.....");
																double j= 5.683*Math.pow(10,26);
																System.out.println("Mass of Saturn = " +j);
																double k = 8.2713*Math.pow(10,14);
																System.out.println("Volume of Saturn= "+k);
																double l=density(5.683*Math.pow(10,26) , 8.2713*Math.pow(10,14));
																System.out.println("Density of Saturn = " +l);
																break;
													case  5 :
																System.out.println("Fetching the details of Neptune.....");
																double m= 1.024*Math.pow(10,26);
																System.out.println("Mass of Neptune = " +m);
																double n = 6.254*Math.pow(10,13);
																System.out.println("Volume of Neptune= "+n);
																double o=density(1.024*Math.pow(10,26) , 6.254*Math.pow(10,13));
																System.out.println("Density of Neptune = " +o);
																break;
													case 6 :
																System.out.println("Fetching the details of Mercury.....");
																double p= 3.285*Math.pow(10,23);
																System.out.println("Mass of Mercury = " +p);
																double q = 6.083*Math.pow(10,10);
																System.out.println("Volume of Mercury= "+q);
																double r=density(3.285*Math.pow(10,23) , 6.083*Math.pow(10,10));
																System.out.println("Density of Mercury = " +r);
																break;
													case  7 :
																System.out.println("Fetching the details of Uranus......");
																double z= 8.681*Math.pow(10,25);
																System.out.println("Mass of Uranus = " +z);
																double t = 6.833*Math.pow(10,13);
																System.out.println("Volume of Uranus= "+t);
																double u=density(8.681*Math.pow(10,25) , 6.833*Math.pow(10,13));
																System.out.println("Density of Uranus = " +u);
																break;
													case  8 :
																System.out.println("Fetching the details of Neptune.....");
																double v= 4.867*Math.pow(10,24);
																System.out.println("Mass of Jupiter = " +v);
																double w = 1.43*Math.pow(10,15);
																System.out.println("Volume of Jupiter= "+w);
																double x=density(4.867*Math.pow(10,24) , 1.43*Math.pow(10,15));
																System.out.println("Density of Jupiter = " +x);
																break;
													default :
																System.out.println("*Does not exist*");
					}
				}
}			