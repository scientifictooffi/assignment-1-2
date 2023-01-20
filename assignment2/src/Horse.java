public class Horse extends Animals{
    private boolean isDomesticated;
    public void setDomesticated(boolean domesticated) {
        isDomesticated = domesticated;
    }
    public boolean getDomesticated(){
        return isDomesticated;
    }
    public Horse(String food, String location, boolean isDomesticated){
        super();
        this.isDomesticated = isDomesticated;

    }
    @Override
    public void eat(){
        System.out.print("Horse is eating apples");
    }
    @Override
    public void makeNoise(){
        System.out.print("shouting...");
    }
}