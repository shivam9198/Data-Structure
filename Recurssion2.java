public class Recurssion2 {

    public static void towerofHanoi(int n, String src, String help, String dest) {
        if (n == 1) {
            System.out.println("transfer disk 1 from" + src + " to" + dest);
            return;

        }
        towerofHanoi(n - 1, src, dest, help);
        System.out.println("transfer disk " + n + "from" + src + " to" + dest);
        towerofHanoi(n - 1, help, src, dest);
    }

    public static void printReverseString(String s, int index) {
        if (index < 0)
            return;
        System.out.print(s.charAt(index));
        printReverseString(s, index - 1);

    }

    public static void main(String[] args) {
        // int n = 3;
        // towerofHanoi(n, "A", "B", "C");
        String s = "abc";
        int index = s.length() - 1;
        // for (int i = s.length() - 1; i >= 0; i--) {
        // System.out.println(s.charAt(i));

        // }

        printReverseString(s, index);
    }
}
