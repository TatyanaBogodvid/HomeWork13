public class Human {
    private int yearOfBirth;
    private String name;
    private String town;

    private String jobTitle;

    public Human(int yearOfBirth, String name, String town) {
        if (yearOfBirth >= 0){
        this.yearOfBirth = yearOfBirth;}
        else {this.yearOfBirth = 0;}
        if (name == null || name.isEmpty()){
            this.name = "Информация не указана";
        }
        else{
            this.name = name;
        }
        if (town == null || town.isEmpty()){
        this.town = "Информация не указана";}
        else{
            this.town = town;
        }
    }

    public Human(int yearOfBirth, String name, String town, String jobTitle) {
        if (yearOfBirth >= 0){
            this.yearOfBirth = yearOfBirth;}
        else {this.yearOfBirth = 0;}
        if (name == null || name.isEmpty()){
            this.name = "Информация не указана";}
        else{
            this.name = name;
        }
        if (town == null || town.isEmpty()){
            this.town = "Информация не указана";}
        else{
            this.town = town;
        }
        if (jobTitle == null || jobTitle.isEmpty()){
        this.jobTitle = "Информация не указана";}
        else{
            this.jobTitle = jobTitle;
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

    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setTown(String town) {
        this.town = town;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
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
