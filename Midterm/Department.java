public class Department {
    private String name;
    private int code;

    public Department() {
        this.code = 1;
        this.name = "Software Engineer Department";
    }

    public void setDepartment(int code) {
        this.code = code;
        switch (code) {
            case 1 -> this.name = "Software Engineer Department";
            case 2 -> this.name = "Software Design Department";
            case 3 -> this.name = "Customer Experience Department";
            case 4 -> this.name = "Software Quality Assurance Department";
            default -> this.name = "Unknown Department";
        }
    }

    public String getDepartmentName() { return name; }
    public int getDepartmentCode() { return code; }
}
