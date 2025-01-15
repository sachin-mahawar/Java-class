import java.util.*;

public class Set_ {

    public static void main(String[] args){

        Set<String> asia = new HashSet<>();
        Set<String> europe = new HashSet<>();

        asia.add("Japan");
        asia.add("Turkey");
        asia.add("Russia");
        europe.add("Turkey");
        europe.add("Russia");
        europe.add("Germany");

        System.out.println(asia);
        System.out.println(europe);

        // intersection
        Set<String> its = new HashSet<>(asia);
        its.retainAll(europe);
        System.out.println(its);

        // union
        Set<String> uni = new HashSet<>(asia);
        uni.addAll(europe);
        System.out.println(uni);

        uni.remove("Russia");
        System.out.println(uni);
    }
}

/*
* Hashset: no order fix
* Treeset: sorted alphabetically
*
*
* */