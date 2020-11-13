import java.util.ArrayList;
class Sort {
    ArrayList<Number> list = new ArrayList<Number>();
    public Sort(){}
    public Sort(ArrayList<Number> List){
        this.list = list;
    }
    public static void sort(ArrayList<Number> list){
        if (list.size() == 0 || list == null)
            return;
        for (int i = list.size()-1; i >= 0; i--)
            for (int j = 0; j < i; j++){
                if (list.get(j).doubleValue() > list.get(j+1).doubleValue()){
                    int index = j;
                    Number m = list.get(j);
                    list.set(index, list.get(j+1));
                    list.set(j+1,m);
                }
            }
    }
}
public class code_13_3 {
    public static void main(String[] args){
        Sort s = new Sort();
        s.list.add(99);
        s.list.add(88);
        s.list.add(100);
        s.list.add(166);
        s.list.add(66.6);
        s.list.add(9.9);
        s.list.add(5.20);
        s.list.add(1314);
        s.sort(s.list);
        Sort.sort(s.list);
        for (Number tem: s.list){
            System.out.println(tem);
        }
    }
    
}