package model;

import java.util.Date;

public class Patient extends User {
    private Date birthday;
    private double weight;
    private double height;
    private String blood;

    public Patient(String name, String email){
        super(name, email);
    }
    public void setWeight(double weight){
        this.weight = weight;
    }
    public String getWeight(){
        return this.weight + " Kg.";
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getHeight() {
        return height + " Mts.";
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public String getBlood() {
        return blood;
    }

    public void setBlood(String blood) {
        this.blood = blood;
    }

    @Override
    public String toString() {
        return super.toString() + "\nAge: " + birthday + "\nWeight: " + getWeight() + "\nHeight: " + getHeight() + "\nBlood: " + blood;
    }

    @Override
    public void showDataUser() {
        System.out.println("Paciente");
        System.out.println("Historial Clinico");
    }
}
