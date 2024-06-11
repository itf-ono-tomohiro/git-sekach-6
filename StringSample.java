public class StringSample {
    public static void main(String[] args){
        String s1 = "Java";
        String s2 = new String("Java");
        String s3 = "Java";

        System.out.println("s1.equals(s2):" + s1.equals(s2));
        System.out.println("s1.equals(s3):" + s1.equals(s3));
        System.out.println("s1 == s2:" + (s1 == s2));
        System.out.println("s1 == s3:" + (s1 == s3));

        System.out.println("s1.length():" + s1.length());
        // 1番目から取得
        System.out.println("s1.substring(1):" + s1.substring(1));
        // 1番目から3番目の前まで取得
        System.out.println("s1.substring(1,3):" + s1.substring(1,3));
    }
}
