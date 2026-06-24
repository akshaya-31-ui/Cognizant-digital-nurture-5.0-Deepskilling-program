public abstract class NotifierDecorator implements Notifier
{
    protected  Notifier note;
    public NotifierDecorator(Notifier notifier)
    {
        this.note=notifier;
    }
    public void send(String msg)
    {
        note.send(msg);
    }
}