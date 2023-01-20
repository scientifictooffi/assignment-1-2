public class Animals {
    private String food;
    private String location;
    public Animals(){}
    public Animals(String food, String location){
        this.food = food;
        this.location = location;

    }

    public void setFood(String food) {
        this.food = food;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getFood() {
        return food;
    }

    public String getLocation() {
        return location;
    }

    public void food(){
        System.out.print("Animal likes food");
    }
    public void makeNoise(){
        System.out.print("Animals is noisy)");
    }
    public void eat(){
        System.out.print("Animals is eating");
    }
    public void sleep(){
        System.out.print("Animal is sleeping");
    }


}