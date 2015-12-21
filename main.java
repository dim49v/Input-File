import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class main {

	public static void main(String[] args) {
		
		String[][] q = new String [1000][2];
		String w;
		int i, u;
		i=-1;
		try {
			File file = new File("C:/dnk.txt");
			Scanner sc = new Scanner(file);
			while (sc.hasNext()) {
			w = sc.next();
			if (w.charAt(0)=='>')
			{
				i++;
				q[i][0] = w;
				q[i][1] = "";
			}
			else
			{
				q[i][1] += w;
			}
			}
			sc.close();
			} catch (FileNotFoundException e){
							
			}
        for(u=0;u<=i;u++)
        {
        	System.out.println(q[u][0]);
        	System.out.println(q[u][1]);
        }
	}

}
