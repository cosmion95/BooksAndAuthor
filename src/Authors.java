public class Authors {
    private String name;
    private String email;
    private char gender;

    public Authors(String name, String email, char gender) {
        this.name = name;
        this.email = email;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public char getGender() {
        return gender;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Name: " + getName() +", Email: " + getEmail() +", Gender: " + getGender();
    }



}
