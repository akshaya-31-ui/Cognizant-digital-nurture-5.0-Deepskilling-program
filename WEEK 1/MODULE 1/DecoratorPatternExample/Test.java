public class Test
{
    public static void main(String[] args) {
        Notifier n=new EmailNotifier();
        n.send("Serer is down!");
        System.out.println();
        Notifier email=new SMSNotifierDecorator(new EmailNotifier());
        email.send("Serveris down!");
        System.out.println("");
        Notifier allChannels=new SlackNotifierDecorator(
                                new SMSNotifierDecorator(
                                new EmailNotifier()));
        allChannels.send("CRITICAL: Database failure!");
    }
}