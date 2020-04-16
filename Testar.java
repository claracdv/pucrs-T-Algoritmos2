import java.io.IOException;
//import java.net.InterfaceAddress;
import java.io.FileReader;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;
import java.io.BufferedReader;

public class Testar {
  protected static ArrayList<Intervalo> arr = new ArrayList<Intervalo>();

  public static void leitura(ArrayList<Intervalo> arr) {
        
    System.out.println(new Timestamp(System.currentTimeMillis()));
    
    
    try {
        // File file = new File("case_0.txt");
        // Scanner myReader = new Scanner(file); //Buffered?
        BufferedReader br = new BufferedReader(new FileReader("test.txt"));
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
    System.out.println(new Timestamp(System.currentTimeMillis()));

    System.out.println(arr.size());
    System.out.println("Arquivo Lido");
    // for(Intervalo i : arr){
    //     System.out.println(i);
    // }

  }

  public static void main(String args[]){
    leitura(arr);
    quicksort(arr);
    System.out.println(arr);
  }

  public static List<Intervalo> quicksort(List<Intervalo> input){
		
		if(input.size() <= 1){
			return input;
		}
		
		int middle = (int) Math.ceil((double)input.size() / 2);
		int pivot = input.get(middle).val1;

		List<Intervalo> less = new ArrayList<Intervalo>();
		List<Intervalo> greater = new ArrayList<Intervalo>();
		
		for (int i = 0; i < input.size()-1; i++) {
			if(input.get(i).val1 <= pivot){
				if(i == middle){
					continue;
				}
				less.add(input.get(i));
			}
			else{
				greater.add(input.get(i));
			}
		}
		
		return concatenate(less, input.get(middle), greater);
	}
	
	/**
	 * Join the less array, pivot integer, and greater array
	 * to single array.
	 * @param less integer ArrayList with values less than pivot.
	 * @param pivot the pivot integer.
	 * @param greater integer ArrayList with values greater than pivot.
	 * @return the integer ArrayList after join.
	 */
	public static List<Intervalo> concatenate(List<Intervalo> less, Intervalo pivot, List<Intervalo> greater){
		
		List<Intervalo> list = new ArrayList<Intervalo>();
		
		for (int i = 0; i < less.size(); i++) {
			list.add(less.get(i));
		}
		
		list.add(pivot);
		
		for (int i = 0; i < greater.size(); i++) {
			list.add(greater.get(i));
		}
		
		return list;
	}

  //public ArrayList<Intervalo> listinha(ArrayList<Intervalo> arrayList){
    
  //}

}