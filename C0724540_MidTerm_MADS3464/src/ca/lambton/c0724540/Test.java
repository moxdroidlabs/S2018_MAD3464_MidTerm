package ca.lambton.c0724540;

public class Test {

    public static void main(String[] args) {

        // reverse(String s) : String
        System.out.println("#### reverse ####");
        System.out.println(LambtonStringTools.reverse("Lambton"));

        // binaryToDecimal(String s)
        System.out.println();
        System.out.println("#### binaryToDecimal ####");
        System.out.println(LambtonStringTools.binaryToDecimal("1000"));
        System.out.println(LambtonStringTools.binaryToDecimal("10001"));
        System.out.println(LambtonStringTools.binaryToDecimal("111111"));

        // initials(String s)
        System.out.println();
        System.out.println("#### initials ####");
        System.out.println(LambtonStringTools.initials("James tiBeriUs kiRK"));
        System.out.println(LambtonStringTools.initials("jean luc picard"));
        System.out.println(LambtonStringTools.initials("AaroN LANGille"));

        // mostFrequent(String s)
        System.out.println();
        System.out.println("#### mostFrequent ####");
        System.out.println(LambtonStringTools.mostFrequent("ddddffffer"));


        // replaceSubString(String s1, String s2, String s3)
        System.out.println();
        System.out.println("#### replaceSubString ####");
        System.out.println(LambtonStringTools.replaceSubString("the dog jumped over the fence", "the", "that"));
    }
}
