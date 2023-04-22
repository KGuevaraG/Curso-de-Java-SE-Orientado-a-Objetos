import java.util.Date;

import static UI.UIMenu.*;

public class Main {
    public static void main(String[] args) {
        //showMenu();
        Doctor myDoctor = new Doctor("Juan Vazques","Pediatria");

        Patient patient = new Patient("Alejandra","alejandra@mail.com");

        myDoctor.addAvailabeAppointment(new Date(), "4pm");
        myDoctor.addAvailabeAppointment(new Date(), "10am");
        myDoctor.addAvailabeAppointment(new Date(), "1pm");

        System.out.println(myDoctor.getAvailableAppointments());
        for (Doctor.AvailableAppointment aA:myDoctor.getAvailableAppointments()) {
            System.out.println(aA.getDate() + " "+aA.getTime());
        }
    }
}

