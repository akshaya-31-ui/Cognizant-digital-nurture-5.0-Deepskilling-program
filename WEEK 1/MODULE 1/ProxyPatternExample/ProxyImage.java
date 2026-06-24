public class ProxyImage implements Image
{
    private String file;
    private RealImage realimage;
    public ProxyImage(String file)
    {
        this.file=file;
    }
    public void display()
    {
        if(realimage==null)
        {
            realimage=new RealImage(file);
        }
        realimage.display();
    }
}