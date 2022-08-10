public class ComparingTwoStrings {
    public static void main(String[] args) {
        String name = "Trevor";
        String name1 = "trevor";
        String name2 = "Fred";
        String name3 = new String("Trevor");
        System.out.println(name +" "+ name1);
        System.out.println(name.toLowerCase().equals(name1.toLowerCase()));
    }
}
