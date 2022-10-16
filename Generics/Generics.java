class Main <T>
{
    private T a;
    
    void setData(T a)
    {
        this.a=a;
    }
    
    T getData()
    {
        return a;
    }
}

class Main1
{
    public static void main(String[] args)
    {
        Main <Integer> m=new Main<Integer>();
        m.setData(5);
        System.out.println(m.getData());
        
        Main<String> m2=new Main<String>();
        m2.setData("Welcome");
        System.out.println(m2.getData());
    }
}


