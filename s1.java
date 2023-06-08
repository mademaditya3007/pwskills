package gitupload;


public class s1 {
    public static void main(String[] args) {
        String name="aditya";
        String s1="aditya";
        String s2=new String("aditya");
        System.out.println(s1.equals(s2));
        // System.out.println(s1.equals(s2));
        System.out.println(s1.equals(name));//only considering the data not refernce
        System.out.println(s2.equals(name));

        System.out.println(s1==s2);//Since in the heap memory
        System.out.println(s1==name);//Since in the String loop
        System.out.println(name);
    }
}
