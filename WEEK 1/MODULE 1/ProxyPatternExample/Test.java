public class Test
{
    public static void main(String[] args) {
        Image image = new ProxyImage("vacation_photo.jpg");
        System.out.println("First call: ");
        image.display(); 
        System.out.println("Second call: ");
        image.display(); 
    }
}