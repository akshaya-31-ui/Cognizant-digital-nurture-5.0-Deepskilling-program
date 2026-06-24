class Logger
{
    private static Logger instance;
    private Logger()
    {
        System.out.println("Logger object created");
    }
    public static Logger getTheInstance()
    {
        if(instance==null)
        {
            instance=new Logger();
        }
        return instance;
    }
}
