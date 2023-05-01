import java.util.ArrayList;
import java.util.Date;

public class Doctor extends User {
 //

     private String speciality;

    Doctor(String name,String email){
        super(name, email);
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    private ArrayList<AvailableAppointment> availableAppointments = new ArrayList<>();
     public void addAvailabeAppointment(Date date, String time){
         availableAppointments.add(new AvailableAppointment(date,time));
     }
     public ArrayList<AvailableAppointment> getAvailableAppointments(){

         return availableAppointments;
     }


     //Comportamientos


    public static class AvailableAppointment{
        private int id_availableApointment;
        private Date date;
        private String time;

        public AvailableAppointment(Date date, String time) {
            this.date = date;
            this.time = time;
        }

        public Date getDate() {
            return date;
        }

        public void setDate(Date date) {
            this.date = date;
        }

        public String getTime() {
            return time;
        }

        public void setTime(String time) {
            this.time = time;
        }
    }
}
