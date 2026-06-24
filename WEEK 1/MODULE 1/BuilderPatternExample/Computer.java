class Computer
{
    private String cpu;
    private String RAM;
    private String Storage;
    private Computer(Builder builder)
    {
        this.cpu=builder.cpu;
        this.RAM=builder.RAM;
        this.Storage=builder.Storage;
    }
    public void display()
    {
        System.out.println("CPU: " + cpu);
        System.out.println("RAM: " + RAM);
        System.out.println("Storage: " + Storage);
    }
    static class Builder
    {
        private String cpu;
        private String RAM;
        private String Storage;
        public Builder setCpu(String cpu)
        {
            this.cpu=cpu;
            return this;
        }
        public Builder setRAM(String ram)
        {
            this.RAM=ram;
            return this;
        }
        public Builder setStorage(String storage)
        {
            this.Storage=storage;
            return this;
        }
        public Computer build()
        {
            return new Computer(this);
        }
    }
}