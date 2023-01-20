package  com.company.professions;

import com.company.details.Engine;

public class Driver extends Person {

    private int experience;
    public Driver(String fullName, int experience, int age) {
        super(fullName, age);
        this.experience = experience;
    }

    @Override
    public void setFullName(String fullName) {
        super.setFullName(fullName);
    }

    @Override
    public String getFullName() {
        return super.getFullName();
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public int getExperience() {
        return experience;
    }
    @Override
    public String toString() {
        return    getFullName() + " " + getAge() +" " + getExperience();
    }
}