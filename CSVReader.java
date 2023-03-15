import java.io. * ;
import java.util.Scanner;

public class CSVReader {


    public static void main(String[] args) throws Exception {

        Scanner fileReader = new Scanner(new File("/Users/williammarks/Desktop/UserInfo.csv"));
        fileReader.useDelimiter("," + " ");
        while (fileReader.hasNext()){
            System.out.println(fileReader.next());
        }
        fileReader.close();

    }
}
