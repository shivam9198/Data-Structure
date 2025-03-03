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

    public static int first = -1, last = -1;

    public static void firstAndLastIndex(String s, int index, char e) {
        if (index == s.length()) {
            System.out.println(first + " " + last);
            return;
        }
        if (s.charAt(index) == e) {
            if (first == -1) {
                first = index;
            }
            last = index;
        }
        firstAndLastIndex(s, index + 1, e);
    }

    public static boolean sortedArray(int arr[], int index) {
        if (index == arr.length - 1) {
            return true;
        }

        if (arr[index] < arr[index + 1]) {
            return sortedArray(arr, index + 1);

        } else {
            return false;
        }

    }

    public static void main(String[] args) {
        // int n = 3;
        // towerofHanoi(n, "A", "B", "C");
        String s = "abadafacg";
        int arr[] = { 1, 2, 3, 4, 5,13, 7, 8, 9 };
        // int index = s.length() - 1;
        // for (int i = s.length() - 1; i >= 0; i--) {
        // System.out.println(s.charAt(i));

        // }

        // printReverseString(s, index);
        // firstAndLastIndex(s, 0, 'a');
        System.out.println(sortedArray(arr, 0));
    }
}
