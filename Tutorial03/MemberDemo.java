public class MemberDemo {
    public static void main(String[] args) {
        Member m = new Member("Mariyam");
        for (int i = 0; i < 4; i++) {
            m.borrowOne();
        }
        System.out.println(m.getName() + " has " + m.getBorrowed() + " loans");

        Member g = new Member();
        System.out.println(g.getName() + " has " + g.getBorrowed() + " loans");

        Member a = new Member("Ali", 2);
        System.out.println(a.getName() + " has " + a.getBorrowed() + " loans");

        Member b = new Member("Sara", 5);
        System.out.println(b.getName() + " has " + b.getBorrowed() + " loans");
    }
}
