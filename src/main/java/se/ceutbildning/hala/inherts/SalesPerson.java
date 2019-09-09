package se.ceutbildning.hala.inherts;

public class SalesPerson extends Employee {
    private String[] clients;
    private int aquiredClients;

    public SalesPerson(int id, String name, String salary, String[] clients, int aquiredClients) {
        super(id, name, salary);
        this.clients = clients;
        this.aquiredClients = aquiredClients;
    }

    public String[] getClients() {
        return clients;
    }

    public void setClients(String[] clients) {
        this.clients = clients;
    }

    public int getAquiredClients() {
        return aquiredClients;
    }

    public void setAquiredClients(int aquiredClients) {
        this.aquiredClients = aquiredClients;
    }

    @Override
    public void calculateSalary() {

    }
}
