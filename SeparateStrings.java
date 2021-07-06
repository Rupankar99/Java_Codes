public class SeparateStrings {
    public static void main(String[] args) {
        String s = "11111111111111111111111111111111";
        long l = s.length();
        int flag = 0;
        for (int i = 1; i < l; i++) {
            long fn = Long.parseLong(s.substring(0, i));
            System.out.println(fn);
            long tmp = fn;
            String hyp = "";
            hyp = hyp + fn;
            while (hyp.length() < l) {
                fn++;
                hyp = hyp + fn;
                if (hyp.equals(s)) {
                    System.out.println("YES " + tmp);
                    flag = 1;
                    return;
                }
            }
        }
        if (flag == 0)
            System.out.println("NO");
    }
}
