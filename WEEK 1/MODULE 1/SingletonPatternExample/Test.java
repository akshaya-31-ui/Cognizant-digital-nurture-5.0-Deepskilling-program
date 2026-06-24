class Test
{
    public static void main(String[] args) {
        Logger log1=Logger.getTheInstance();
        Logger log2=Logger.getTheInstance();
        if(log1==log2)
        {
            System.out.println("Only one Object created");
        }
        else
        {
           System.out.println("Not Successfull");
        }
    }
}