import static UI.UIMenu.*;

public class Main {
    public static void main(String[] args) {
        Doctor myDoctor = new Doctor();
        myDoctor.name="Alejandro Rodriguez";
        myDoctor.showName();
        myDoctor.showId();
        Doctor myDoctorK = new Doctor();
        System.out.println(myDoctorK.id);
        showMenu();
    }
}

