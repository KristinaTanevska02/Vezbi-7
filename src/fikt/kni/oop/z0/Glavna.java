package fikt.kni.oop.z0;
import java.util.ArrayList;
import java.util.List;

public class Glavna {
	
	 public static void main(String[] args) {
	        MetodiZaListaNiza object =  new MetodiZaListaNiza();

	        List<String> lista1 = new ArrayList<String>();
	        lista1.add("Prv Elememt");
	        lista1.add("Vtor element");
	        object.listToArray(lista1);

	        String[] niza = {"Eden", "Dva", "Tri"};
	        object.arrayToList(niza);

}
}
