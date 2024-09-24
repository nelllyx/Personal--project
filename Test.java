public class Test {

    private String account;

    public Test(String acc) {
        this.account = acc;
    }

    public String getAccount() {
        return this.account;
    }

    public static void main(String[] args) {
        Test t = new Test("12345");
        System.out.print(t.getAccount());
    }
}
