package models;



public class UserInfo {
    private String name;
    private String serName;
    private String patrols;
    private int age;
    private String phone;
    private boolean gender;
    private User user ;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSerName() {
        return serName;
    }

    public void setSerName(String serName) {
        this.serName = serName;
    }

    public String getPatrols() {
        return patrols;
    }

    public void setPatrols(String patrols) {
        this.patrols = patrols;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String prin (){
        String print = String.format("Имя пользователя: %s \n" +
                "Фамилия: %s \n" +
                "Отчество: %s \n" +
                "Возраст: %s \n" +
                "НОмер телефона: %s \n" +
                "Данные пользователя: %s ",
                getName(), getSerName(), getPatrols(), getAge(), getPhone(), user.getUser());

        return print;
    }
}
