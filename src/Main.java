import model.Doctor;
import model.ISchedulable;
import model.Patient;
import model.User;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Doctor myDoctor = new Doctor("model.Doctor Prueba", "docprueba@prueba.com");
        myDoctor.addAvailableAppointment(new Date(), "4pm");
        myDoctor.addAvailableAppointment(new Date(), "7pm");
        myDoctor.addAvailableAppointment(new Date(), "5pm");

        System.out.println(myDoctor);
        /*
        for (model.Doctor.AvailableAppointment aA: myDoctor.getAvailableAppointments()
             ) {
            System.out.println(aA.getDate() + " " + aA.getTime());
        }

         */

        Doctor myDoctor2 = new Doctor("prueba2", "pediatra");

        //showMenu();

        Patient patient = new Patient("Prueba Paciente", "prueba@prueba.com");
        patient.setWeight(56.5);
        System.out.println(patient);

        User user = new Doctor("Jeremias Gunsett", "jeremias.gunsett@gmail.com");
        user.showDataUser();

        //Clases Anonimas
        User userPa = new User("Paciente Prueba", "prueba@paciente.com") {
            @Override
            public void showDataUser() {
                System.out.println("Paciente\n");
                System.out.println("Hospital Privado");
            }
        };
        userPa.showDataUser();

        ISchedulable iSchedulable = new ISchedulable() {
            @Override
            public void schedule(Date date, String time) {

            }
        };

    }
}

