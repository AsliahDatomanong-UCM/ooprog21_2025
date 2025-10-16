public class Employee {
    private String idNo;
    private String firstName;
    private String middleName;
    private String lastName;
    private String suffix;
    private int age;
    private String phoneNumber;
    private String email;

    public Employee() {
        this.idNo = "";
        this.firstName = "";
        this.middleName = "";
        this.lastName = "";
        this.suffix = "";
        this.age = 0;
        this.phoneNumber = "";
        this.email = "";
    }

    public String getIdNo() { return idNo; }
    public String getFirstName() { return firstName; }
    public String getMiddleName() { return middleName; }
    public String getLastName() { return lastName; }
    public String getSuffix() { return suffix; }
    public int getAge() { return age; }
    public String getPhoneNumber() { return phoneNumber; }
    public String getEmail() { return email; }

    public void setIdNo(String idNo) { this.idNo = idNo; }
    public void setFirstName(String firstName) { this.firstName = firstName; }
    public void setMiddleName(String middleName) { this.middleName = middleName; }
    public void setLastName(String lastName) { this.lastName = lastName; }
    public void setSuffix(String suffix) { this.suffix = suffix; }
    public void setAge(int age) { this.age = age; }
    public void setPhoneNumber(String phoneNumber) { this.phoneNumber = phoneNumber; }
    public void setEmail(String email) { this.email = email; }

    public String displayInfo() {
        return "Employee Record\n\n" +
               "Employee Profile Details:\n" +
               "Employee ID No.: " + idNo + "\n" +
               "First Name: " + firstName + "\n" +
               "Middle Name: " + middleName + "\n" +
               "Last Name: " + lastName + "\n" +
               "Suffix: " + suffix + "\n" +
               "Age: " + age + "\n" +
               "Phone Number: " + phoneNumber + "\n" +
               "Email: " + email + "\n";
    }
}
