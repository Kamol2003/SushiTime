public class Manager implements CheckManager{
    private String name;
    private String email;
    private String password;
    private String phoneNumber;
    private String managerKey = "&t%Z{e)V>RXpQ5Y";

    public Manager(String name, String email, String password, String phoneNumber) {
        this.name = name;
        this.email = email;
        this.password = password;
        this.phoneNumber = phoneNumber;
    }

    @Override
    public boolean login(String email, String password) {
        return getEmail().equals(email) && getPassword().equals(password);
    }

    @Override
    public boolean loginManager(String managerKey) {
        return getManagerKey().equals(managerKey);
    }

    public String getManagerKey() {
        return managerKey;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
