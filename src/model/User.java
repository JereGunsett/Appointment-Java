package model;

public abstract class User {
    private int id;
    private String name;
    private String email;
    private String address;
    private String phoneNumbers;

    public User(String name, String email){
        this.name = name;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumbers() {
        return phoneNumbers;
    }

    public void setPhoneNumbers(String phoneNumbers) {
        if (phoneNumbers.length()>8){
            System.out.println("El numero telefonico debe ser de 8 digitos maximo");
        } else if (phoneNumbers.length() == 8) {
            this.phoneNumbers = phoneNumbers;
        }
    }

    @Override
    public String toString() {
        return "model.User: " + name + ", Email: " + email + "\nAddress: " + address + ". Phone: " + phoneNumbers;

    }

    public abstract void showDataUser();
}
