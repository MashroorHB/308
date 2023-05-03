public interface Participant {
    public String getName();
    public String getRole();
    public void add(Employee e);
    public void remove();
    public void printHierarchy(int t);
    public void printComponentDetails();
    public void prompt();
}
