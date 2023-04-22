public class Doctor {
     int id;
     String name;
     String speciality;
     Doctor(){
         System.out.println("Construyendo el objeto doctor");
     }
     Doctor(String name){
         System.out.println("El nomre del doctor asirgano es "+name);
     }
     //Comportamientos

    public void showName(){
        System.out.println(name);
    }
}
