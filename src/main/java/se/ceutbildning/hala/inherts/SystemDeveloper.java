package se.ceutbildning.hala.inherts;

public class SystemDeveloper extends Employee {
    private String[] certificate;
    private String[] language;

    public SystemDeveloper(int id, String name, String salary, String[] certificate, String[] language) {
        super(id, name, salary);
        this.certificate = certificate;
        this.language = language;
    }

    public String[] getCertificate() {
        return certificate;
    }

    public void setCertificate(String[] certificate) {
        this.certificate = certificate;
    }

    public String[] getLanguage() {
        return language;
    }

    public void setLanguage(String[] language) {
        this.language = language;
    }

    @Override
    public void calculateSalary() {

    }
}
