public class Member {
    private String name;
    private int borrowed;
    public Member() {
        this("Guest");
    }
    public Member(String name) {
        this.name = name;
        this.borrowed = 0;
    }
    public Member(String name, int borrowed) {
        this.name = name;
        if (borrowed >= 0 && borrowed <= 3) {
            this.borrowed = borrowed;
        }
    }
    public String getName() { return name; }
    public int getBorrowed() { return borrowed; }
    public void borrowOne() {
        if (borrowed < 3) {
            borrowed++;
        }
    }
}
