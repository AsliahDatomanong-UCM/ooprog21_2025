import javax.swing.JOptionPane;

public class ERManagementApp {
    public static void main(String[] args) {
        Employee emp = new Employee();
        Department dept = new Department();
        Team team = new Team();

        int choice;
        do {
            String menu = """
            Employee Record Management App

            --------------------------------------------------
            1. Create Employee Record
            2. Update Employee Record
            3. Update Team and Department
            4. Display Employee Details
            0. Exit
            --------------------------------------------------
            """;

            choice = Integer.parseInt(JOptionPane.showInputDialog(menu));

            switch (choice) {
                case 1 -> createEmployee(emp);
                case 2 -> updateEmployee(emp);
                case 3 -> updateTeamDept(dept, team);
                case 4 -> JOptionPane.showMessageDialog(null,
                        emp.displayInfo() +
                        "\nEmployee Department Details:\nCode: " + dept.getDepartmentCode() +
                        "\nDepartment: " + dept.getDepartmentName() +
                        "\n\nEmployee Team Details:\nCode: " + team.getTeamCode() +
                        "\nTeam: " + team.getTeamName(),
                        "Employee Record", JOptionPane.INFORMATION_MESSAGE);
            }
        } while (choice != 0);
    }

    static void createEmployee(Employee emp) {
        emp.setIdNo(JOptionPane.showInputDialog("Enter Employee ID No.:"));
        emp.setFirstName(JOptionPane.showInputDialog("Enter First Name:"));
        emp.setMiddleName(JOptionPane.showInputDialog("Enter Middle Name:"));
        emp.setLastName(JOptionPane.showInputDialog("Enter Last Name:"));
        emp.setSuffix(JOptionPane.showInputDialog("Enter Suffix (or leave blank):"));
        emp.setAge(Integer.parseInt(JOptionPane.showInputDialog("Enter Age:")));
        emp.setPhoneNumber(JOptionPane.showInputDialog("Enter Phone Number:"));
        emp.setEmail(JOptionPane.showInputDialog("Enter Email:"));
    }

    static void updateEmployee(Employee emp) {
        String updateMenu = """
        Update Employee Record

        --------------------------------------------------
        1. Update First Name
        2. Update Middle Name
        3. Update Last Name
        4. Update Suffix
        5. Update Age
        6. Update Phone Number
        7. Update Email
        0. Return
        --------------------------------------------------
        """;

        int opt;
        do {
            opt = Integer.parseInt(JOptionPane.showInputDialog(updateMenu));
            switch (opt) {
                case 1 -> emp.setFirstName(JOptionPane.showInputDialog("Enter New First Name:"));
                case 2 -> emp.setMiddleName(JOptionPane.showInputDialog("Enter New Middle Name:"));
                case 3 -> emp.setLastName(JOptionPane.showInputDialog("Enter New Last Name:"));
                case 4 -> emp.setSuffix(JOptionPane.showInputDialog("Enter New Suffix:"));
                case 5 -> emp.setAge(Integer.parseInt(JOptionPane.showInputDialog("Enter New Age:")));
                case 6 -> emp.setPhoneNumber(JOptionPane.showInputDialog("Enter New Phone Number:"));
                case 7 -> emp.setEmail(JOptionPane.showInputDialog("Enter New Email:"));
            }
        } while (opt != 0);
    }

    static void updateTeamDept(Department dept, Team team) {
        String deptMenu = """
        Update Employee Department
        --------------------------------------------------
        1. Software Engineer Department
        2. Software Design Department
        3. Customer Experience Department
        4. Software Quality Assurance Department
        --------------------------------------------------
        """;

        String teamMenu = """
        Update Employee Team
        --------------------------------------------------
        1. Boards Team
        2. HR-Policy Team
        3. Administration Team
        4. Android Mobile Team
        --------------------------------------------------
        """;

        int d = Integer.parseInt(JOptionPane.showInputDialog(deptMenu));
        dept.setDepartment(d);

        int t = Integer.parseInt(JOptionPane.showInputDialog(teamMenu));
        team.setTeam(t);
    }
                           }
