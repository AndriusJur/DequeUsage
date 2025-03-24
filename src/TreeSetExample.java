import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetExample {
    public static void main (String [] args){
        Set<Integer> treeSet= new TreeSet<>();// more concrete
        treeSet.add(100);
        treeSet.add(35);
        treeSet.add(4);
        treeSet.add(4);// not a unique value, not added
        System.out.println(treeSet);//in asc numerical / alphabetical order order by default

        Set <String> wordSet=new TreeSet<>(Comparator.comparing(String::length));//changes order to ->by length from shortest
        wordSet.add("cat");
        wordSet.add("dog");// not added - equal string length
        wordSet.add("aardvark");
        wordSet.add("zebra");
        System.out.println(wordSet);

    }
}
