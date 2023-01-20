public class Dog extends Animals{
    private boolean isDomesticated;

    public void setDomesticated(boolean domesticated) {
        isDomesticated = domesticated;
    }
    public boolean getDomesticated(){
        return isDomesticated;
    }
    public Dog(String food, String location, boolean isDomesticated){
        super();
        this.isDomesticated = isDomesticated;

    }
    @Override
    public void eat(){
        System.out.print("Dog is eating meat");
    }
    @Override
    public void makeNoise() {
        System.out.print("gav-gav");
    }
}