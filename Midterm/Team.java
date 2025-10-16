public class Team {
    private String name;
    private int code;

    public Team() {
        this.code = 1;
        this.name = "Boards Team";
    }

    public void setTeam(int code) {
        this.code = code;
        switch (code) {
            case 1 -> this.name = "Boards Team";
            case 2 -> this.name = "HR-Policy Team";
            case 3 -> this.name = "Administration Team";
            case 4 -> this.name = "Android Mobile Team";
            default -> this.name = "Unknown Team";
        }
    }

    public String getTeamName() { return name; }
    public int getTeamCode() { return code; }
}
