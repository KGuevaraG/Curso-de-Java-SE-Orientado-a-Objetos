public class Doctor {
     static int id = 0;
     String name;
     String speciality;
     Doctor(){
         System.out.println("Construyendo el objeto doctor");
         id++;
     }
     Doctor(String name){
         System.out.println("El nomre del doctor asirgano es "+name);
     }
     //Comportamientos

    public void showName(){
        System.out.println(name);
    }
    public void showId(){
         System.out.println("Id Doctor: " + id);
    }
}
