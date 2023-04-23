package model;

import java.util.ArrayList;
import java.util.Date;

public class Patient extends User {
    private Date birthday;
    private double weight;
    private double height;
    private String blood;

    private ArrayList<AppointmentDoctor> appointmentDoctors = new ArrayList<>();
    private ArrayList<AppointmenrNurse> appointmenrNurses = new ArrayList<>();

    public ArrayList<AppointmentDoctor> getAppointmentDoctors() {
        return appointmentDoctors;
    }

    public void addAppointmentDoctors(Doctor doctor, Date date, String time) {
        AppointmentDoctor appointmentDoctor = new AppointmentDoctor(this, doctor);
        appointmentDoctor.schedule(date, time);
        appointmentDoctors.add(appointmentDoctor);
    }

    public ArrayList<AppointmenrNurse> getAppointmenrNurses() {
        return appointmenrNurses;
    }

    public void setAppointmenrNurses(ArrayList<AppointmenrNurse> appointmenrNurses) {
        this.appointmenrNurses = appointmenrNurses;
    }

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
