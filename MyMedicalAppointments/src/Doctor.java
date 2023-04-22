import java.util.ArrayList;
import java.util.Date;

public class Doctor {
     static int id = 0;
     private String name;
     private String email;
     private String speciality;
     private ArrayList<AvailableAppointment> availableAppointments = new ArrayList<>();
     public void addAvailabeAppointment(Date date, String time){
         availableAppointments.add(new AvailableAppointment(date,time));
     }
     public ArrayList<AvailableAppointment> getAvailableAppointments(){
         return availableAppointments;
     }
     Doctor(){
         System.out.println("Construyendo el objeto doctor");
         id++;
     }
     Doctor(String name, String speciality){
         this.name=name;
         this.speciality=speciality;
     }
     //Comportamientos

    public void showName(){
        System.out.println(name);
    }
    public void showId(){
         System.out.println("Id Doctor: " + id);
    }
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
