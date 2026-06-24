public class Test
{
   public static void main(String[] args) {
       Computer c1=new Computer.Builder()
                .setCpu("Intel 17")
                .setStorage("1TB")
                .setRAM("16GB")
                .build();
       c1.display();
   }
}