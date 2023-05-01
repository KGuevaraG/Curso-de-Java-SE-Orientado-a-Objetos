public class Patient extends User {
    //Atributos
    private String birhtday;
    private double weight;
    private double height;
    private String blood;

    Patient(String name, String email){
        super(name, email);
    }

    public void setWeight(double weight){
        this.weight = weight;
    }
    public String getWeight(){
        return this.weight + "Kg.";
    }

    public String getBirhtday() {
        return birhtday;
    }

    public void setBirhtday(String birhtday) {
        this.birhtday = birhtday;
    }

    public String getHeight() {
        return height + "Mts.";
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
}
