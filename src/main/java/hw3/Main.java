package hw3;

import java.util.Collection;
import java.util.InputMismatchException;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by Onur Sezer on 1.3.2016.
 */
public class Main<E> {

    public static  void main(String[] args)
    {

        System.out.println("   # INTEGER TEST #");
        
        SpecList specList = new SpecList<>();
        specList.add(1);
        specList.add(2);
        specList.add(3);
        specList.add(4);

        Collection<Integer> col = new LinkedList<Integer>();
        col.add(8);
        col.add(9);
        col.add(10);
        
        try {
            System.out.println("LinkedList:");
            for (Object o : specList)
                System.out.print(o + " ");
            System.out.println("");
            System.out.println("Collectin:");
            for (Object o : col)
                System.out.print(o + " ");
            System.out.println("");

            System.out.println("============================");
            System.out.println(" addAllAtHead()");
            System.out.println("LinkedListin basina Collection listi eklendi.\n");
            specList.addAllAtHead(col);
            for (Object o : specList)
                System.out.println(o);

            System.out.println("============================");
            System.out.println("    getIntersectList()");
            System.out.println("LinkedList ile Collection unun intersecti bulundu.\n");
            List list = specList.getIntersectList(col);
            for (int i = 0; i < list.size(); i++) {
                System.out.println(list.get(i));
            }
            System.out.println("============================");
            System.out.println("    sortList()");
            System.out.println("LinkedList decreasing olarak siralandi\n");
            list = specList.sortList("decreasing");
            for (int i = 0; i < list.size(); i++)
                System.out.println(list.get(i));

            System.out.println("\nLinkedList increasing olarak siralandi\n");
            list = specList.sortList("increasing");
            for (int i = 0; i < list.size(); i++)
                System.out.println(list.get(i));

            System.out.println("====================================");

            System.out.println("   # CHAR TEST #");

            SpecList specList2 = new SpecList<>();
            specList2.add('A');
            specList2.add('B');
            specList2.add('C');
            specList2.add('D');

            Collection<Character> col2 = new LinkedList<Character>();
            col2.add('Z');
            col2.add('Y');
            col2.add('X');

            System.out.println("LinkedList:");
            for (Object o : specList2)
                System.out.print(o + " ");
            System.out.println("");
            System.out.println("Collectin:");
            for (Object o : col2)
                System.out.print(o + " ");
            System.out.println("");

            System.out.println("============================");
            System.out.println(" addAllAtHead()");
            System.out.println("LinkedListin basina Collection listi eklendi.\n");
            specList2.addAllAtHead(col2);
            for (Object o : specList2)
                System.out.println(o);

            System.out.println("============================");
            System.out.println("    getIntersectList()");
            System.out.println("LinkedList ile Collection unun intersecti bulundu.\n");
            List list2 = specList2.getIntersectList(col2);
            for (int i = 0; i < list2.size(); i++) {
                System.out.println(list2.get(i));
            }
            System.out.println("============================");
            System.out.println("    sortList()");
            System.out.println("LinkedList decreasing olarak siralandi\n");
            list = specList2.sortList("decreasing");
            for (int i = 0; i < list.size(); i++)
                System.out.println(list.get(i));

            System.out.println("\nLinkedList increasing olarak siralandi\n");
            list = specList2.sortList("increasing");
            for (int i = 0; i < list.size(); i++)
                System.out.println(list.get(i));


            System.out.println("====================================");

            System.out.println("   # DOUBLE TEST #");

            SpecList specList3 = new SpecList<>();
            specList3.add(3.2);
            specList3.add(5.9);
            specList3.add(1.2);
            specList3.add(12.003);

            Collection col3 = new LinkedList<>();
            col3.add(0.1);
            col3.add(41.1);
            col3.add(11.34);

            System.out.println("LinkedList:");
            for (Object o : specList3)
                System.out.print(o + " ");
            System.out.println("");
            System.out.println("Collectin:");
            for (Object o : col3)
                System.out.print(o + " ");
            System.out.println("");

            System.out.println("============================");
            System.out.println(" addAllAtHead()");
            System.out.println("LinkedListin basina Collection listi eklendi.\n");
            specList3.addAllAtHead(col3);
            for (Object o : specList3)
                System.out.println(o);

            System.out.println("============================");
            System.out.println("    getIntersectList()");
            System.out.println("LinkedList ile Collection unun intersecti bulundu.\n");
            List list3 = specList3.getIntersectList(col3);
            for (int i = 0; i < list3.size(); i++) {
                System.out.println(list3.get(i));
            }
            System.out.println("============================");
            System.out.println("    sortList()");
            System.out.println("LinkedList decreasing olarak siralandi\n");
            list3 = specList3.sortList("decreasing");
            for (int i = 0; i < list3.size(); i++)
                System.out.println(list3.get(i));

            System.out.println("\nLinkedList increasing olarak siralandi\n");
            list = specList3.sortList("increasing");
            for (int i = 0; i < list.size(); i++)
                System.out.println(list.get(i));

            System.out.println("====================================");

            System.out.println("   # STRİNG TEST #");

            SpecList specList4 = new SpecList<>();
            specList4.add("onur");
            specList4.add("sezer");
            specList4.add("veysel");
            specList4.add("zehra");

            Collection col4 = new LinkedList<>();
            col4.add("sude");
            col4.add("konya");
            col4.add("abdil");

            System.out.println("LinkedList:");
            for (Object o : specList4) {
                System.out.print(o + " ");
            }
            System.out.println("");
            System.out.println("Collectin:");
            for (Object o : col4)
                System.out.print(o + " ");
            System.out.println("");

            System.out.println("============================");
            System.out.println(" addAllAtHead()");
            System.out.println("LinkedListin basina Collection listi eklendi.\n");
            specList4.addAllAtHead(col4);
            for (Object o : specList4)
                System.out.println(o);

            System.out.println("============================");
            System.out.println("    getIntersectList()");
            System.out.println("LinkedList ile Collection unun intersecti bulundu.\n");
            list = specList4.getIntersectList(col4);
            for (int i = 0; i < list.size(); i++) {
                System.out.println(list.get(i));
            }
            System.out.println("============================");
            System.out.println("    sortList()");
            System.out.println("LinkedList decreasing olarak siralandi\n");
            list = specList4.sortList("decreasing");
            for (int i = 0; i < list.size(); i++)
                System.out.println(list.get(i));

            System.out.println("\nLinkedList increasing olarak siralandi\n");
            list = specList4.sortList("increasing");
            for (int i = 0; i < list.size(); i++)
                System.out.println(list.get(i));

        }catch(InputMismatchException e){
            e.printStackTrace();
        }
        
    }
}






























