public class RealImage implements Image
{
    private String file;
    public RealImage(String file)
    {
        this.file=file;
        loadFromServer();
    }
    private void loadFromServer() 
    {
        System.out.println("Loading image from remote server: " + file);
    }
    @Override
    public void display() 
    {
        System.out.println("Displaying: " + file);
    }
}