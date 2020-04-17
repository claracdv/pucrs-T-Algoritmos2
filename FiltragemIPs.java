import java.io.IOException;
//import java.net.InterfaceAddress;
import java.io.FileReader;
import java.sql.Timestamp;
import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.Collections;
//import java.util.Comparator;
//import java.util.List;
import java.io.BufferedReader;

public class FiltragemIPs {
  protected static ArrayList<Intervalo> arr = new ArrayList<Intervalo>();

  public static void leitura(ArrayList<Intervalo> arr) {
    Timestamp tempo1 = new Timestamp(System.currentTimeMillis());
    
    
    try(BufferedReader br = new BufferedReader(new FileReader("caso12.txt"))) {
        // File file = new File("case_0.txt");
        // Scanner myReader = new Scanner(file); //Buffered?
        
        String leitura;
        while ((leitura = br.readLine()) != null) {
            String[] valores = leitura.split("-");            
            Intervalo inter = new Intervalo(Integer.parseInt(valores[0]), Integer.parseInt(valores[1]));                       
            arr.add(inter);
        }

        // arr.get(i).val1 = 545;
        System.out.println(arr.toString());
        System.out.println(arr.get(0));
        br.close();
    }
    catch (IOException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
	}
	Timestamp tempo2 = new Timestamp(System.currentTimeMillis());
	System.out.println("Tempo inicial: " +tempo1);
	System.out.println("Tempo final: " +tempo2);

    System.out.println(arr.size());
    System.out.println("Arquivo Lido");
    // for(Intervalo i : arr){
    //     System.out.println(i);
    // }

  }

  public static void main(String args[]){
    leitura(arr);
    //quicksort(arr);
    //System.out.println(arr);
  }

  //public static ArrayList <Intervalo> ordenaIPs(ArrayList <Intervalo> ip){
	


  //}
  //Collections.sort(ip, new Comparator<Intervalo>() {
	//@Override
	//public int compare(Intervalo minIP, Intervalo maxIP) {
	  //return minIP.getCreatedOn().compareTo(maxIP.getCreatedOn());
	//}
//  };
  

  //public ArrayList<Intervalo> listinha(ArrayList<Intervalo> arrayList){
    
  //}

}