import java.util.*;

/**
 * @author wgsstart
 * @creat 2021-03-08 21:50
 */
public class TestMain {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("国民女神","高圆圆");
        map.put("国民老公","王思聪");
        map.put("及时雨","宋江");

        System.out.println(map);
       String s =  map.getOrDefault("及时雨2","gaobo");
        System.out.println(s);
        System.out.println(map.containsKey("及时雨2"));
        System.out.println("===========");
      Set< Map.Entry<String,String>> set = map.entrySet();
        for (Map.Entry<String,String> entry:set) {
            System.out.println(entry.getKey() + " =>" + entry.getValue());
        }
    }
    public static void main1(String[] args) {
        Collection<String> collection1 = new ArrayList<>();
        //Collection collection2 = new LinkedList();
        collection1.add("bit");
        collection1.add("java");
        collection1.add("gaobo");
        collection1.add("wnag");
        collection1.add("laozj");
        System.out.println(collection1);
        System.out.println("=============");
        for (String s:collection1) {
            System.out.println(s);
        }
        /*collection1.clear();
        System.out.println(collection1);*/
        System.out.println(collection1.isEmpty());
        collection1.remove("java");
        System.out.println(collection1);
        System.out.println(collection1.size());
       Object[] objects = collection1.toArray();
        System.out.println(Arrays.toString(objects));


    }
}
