public class Human {
    private int yearOfBirth;
    private String name;
    private String town;

    private String jobTitle;

    public Human(int yearOfBirth, String name, String town) {
        if (yearOfBirth >= 0){
        this.yearOfBirth = yearOfBirth;}
        else {this.yearOfBirth = 0;}
        if (name != null || name != ""){
        this.name = name;}
        else{
            System.out.println("Информация не указана");
        }
        if (town != null || town != ""){
        this.town = town;}
        else{
            System.out.println("Информация не указана");
        }
    }

    public Human(int yearOfBirth, String name, String town, String jobTitle) {
        if (yearOfBirth >= 0){
            this.yearOfBirth = yearOfBirth;}
        else {this.yearOfBirth = 0;}
        if (name != null || name != ""){
            this.name = name;}
        else{
            System.out.println("Информация не указана");
        }
        if (town != null || town != ""){
            this.town = town;}
        else{
            System.out.println("Информация не указана");
        }
        if (jobTitle != null || jobTitle != ""){
        this.jobTitle = jobTitle;}
        else{
            System.out.println("Информация не указана");
        }
    }

    public int getYearOfBirth() {
        return this.yearOfBirth;
    }

    public String getName() {
        return this.name;
    }

    public String getTown() {
        return this.town;
    }

    public String getJobTitle() {
        return this.jobTitle;
    }

    public void printHello(){
        System.out.println("Привет! Меня зовут " + getName() + ". Я из города "
        + getTown() + ". Я родился в " + getYearOfBirth() + " году. Будем знакомы!");
    }

    public void printHelloAndJobTitle(){
        System.out.println("Привет! Меня зовут " + getName() + ". Я из города "
                + getTown() + ". Я родился в " + getYearOfBirth() + " году. Я работаю на должности " + getJobTitle() + ". Будем знакомы!");
    }


}
