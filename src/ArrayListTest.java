import java.util.ArrayList;

/**
 * Created by aliouswang on 17/2/14.
 */
public class ArrayListTest {

    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList();

        YYArrayList<String> yyArrayList = new YYArrayList<>();
        yyArrayList.add("1");
        yyArrayList.add(0, "2");
        yyArrayList.add(0, "3");
        for (int i = 0; i < yyArrayList.getSize(); i++) {
            System.out.println(yyArrayList.get(i));
        }


//        arrayList.add(10, "1");
    }


}
