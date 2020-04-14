import java.io.IOException;
import java.io.FileReader;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.io.BufferedReader;

public class Testar {
//   public static void main(String[] args) {

//     System.out.println(new Timestamp(System.currentTimeMillis()));
//     ArrayList<List<Integer>> arr = new ArrayList<List<Integer>>();
//     try {
//         File file = new File("caso12.txt");
//         Scanner myReader = new Scanner(file);
//         while (myReader.hasNextLine()) {
//             String data = myReader.nextLine();
//             ArrayList<String> ary = new ArrayList<String>(Arrays.asList(data.split("-")));
//             arr.add(ary.stream().map(Integer::parseInt).collect(Collectors.toList()));
//         }
//        // System.out.println(arr.toString());
//         myReader.close();
//     }
//     catch (IOException e) {
//       System.out.println("An error occurred.");
//       e.printStackTrace();
//     }

//     System.out.println(new Timestamp(System.currentTimeMillis()));

//     System.out.println(arr.size());
//   }


  public static void main(String[] args) {
        
    System.out.println(new Timestamp(System.currentTimeMillis()));
    
    ArrayList<Intervalo> arr = new ArrayList<Intervalo>();
    try {
        // File file = new File("case_0.txt");
        // Scanner myReader = new Scanner(file); //Buffered?
        BufferedReader br = new BufferedReader(new FileReader("case_0.txt"));
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

    // for(Intervalo i : arr){
    //     System.out.println(i);
    // }

  }
}