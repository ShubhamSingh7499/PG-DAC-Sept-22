import java.util.Scanner;;
class P7 
{   
    public static void main(String[] args)
    {
      P8.display();
        
    }
}

    class P8
    {
       static void display()
       {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the marks");
        int n=sc.nextInt();
        if(n>=75 && n<=100)
        System.out.println("Distinction");
        else
        if(n>=60 && n<=75)
        System.out.println("First Class");
        else
        if(n>=40 && n<60)
        System.out.println("Second Class");
        else
        System.out.println("Fail");
       }


    }
    
