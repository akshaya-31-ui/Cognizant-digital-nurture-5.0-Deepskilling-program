public class Main 
{
    public static void main(String[] args) 
    {
        Light bedroomLight=new Light("Bedroom");
        Light kitchenLight=new Light("Kitchen");
        Command bedroomOn=new LightOnCommand(bedroomLight);
        Command bedroomOff=new LightOffCommand(bedroomLight);
        Command kitchenOn=new LightOnCommand(kitchenLight);
        RemoteControl remote=new RemoteControl();
        remote.setCommand(bedroomOn);
        remote.pressButton();
        remote.setCommand(kitchenOn);
        remote.pressButton();
        remote.setCommand(bedroomOff);
        remote.pressButton();
    }
}