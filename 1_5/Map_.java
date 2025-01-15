import java.util.*;

public class Map_{

    public static void main(String[] args){
        Map<String, Integer> mp = new HashMap<>();

        mp.put("a", 1);
        mp.put("b", 2);

        System.out.println(mp.get("a"));

        Map<String, Integer> nmp = new TreeMap<>();
        nmp.put("asf",1);
        nmp.put("aasf",2);
        nmp.put("xsf",3);
        nmp.put("gsf",4);

        for(Map.Entry<String,Integer> e: nmp.entrySet()){
            System.out.format("%d %s\n",e.getValue(), e.getKey());
        }
    }
}

/*
    hashmap: no order guaranteed
    linked-hashmap: insertion order
    TreeMap: sorted by key

* */