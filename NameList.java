import java.util.ArrayList;

public class NameList{
  public static void main(String[] args){
    ArrayList<String> names = new ArrayList<String>();
    names.add("桜井");
    names.add("田原");
    names.add("鈴木");
    names.add("中川");
    String search = args[0];
    int i;

    for(i = 0; i < names.size(); i++){
      if(search.equals(names.get(i))){
        break;
      }
    }
    if(i < names.size()){
      System.out.println(search + "さんは含まれています");
    } else {
      System.out.println(search + "さんは含まれていません");
    }
  }
}
