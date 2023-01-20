public class Cat extends Animals{
    private boolean isDomesticated;
    public void setDomesticated(boolean domesticated) {
        isDomesticated = domesticated;
    }
    public boolean getDomesticated(){
        return isDomesticated;
    }
    public Cat(String food, String location, boolean isDomesticated){
        super();
        this.isDomesticated = isDomesticated;

    }
    @Override
    public void eat(){
        System.out.print("Cat is eating meat");
    }
    @Override
    public void makeNoise(){
        System.out.print("miyu-miyu");
    }
}