import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Principal {

	public static void main(String[] args) throws IOException {
		
		BufferedReader brDAM1 = new BufferedReader(new FileReader("D:\\PRUEBAS\\DAM1.txt"));
		BufferedReader brDAM2 = new BufferedReader(new FileReader("D:\\PRUEBAS\\DAM2.txt"));
		
		BufferedWriter bwTotales = new BufferedWriter(new FileWriter("D:\\PRUEBAS\\numeroAlumnos.txt"));
		
		String linea;
		int numeroDAM1 = 0;
		while((linea = brDAM1.readLine()) != null) 
			numeroDAM1++;
		
		int numeroDAM2 = 0;
		while((linea = brDAM2.readLine()) != null) 
			numeroDAM2++;
		
		bwTotales.write("El número de alumnos DAM1 es: " + numeroDAM1 + "\rEl número de alumnos DAM2 es: " 
				                                                                      + numeroDAM2);
		
		bwTotales.flush();
		bwTotales.close();
		brDAM1.close();
		brDAM2.close();

	}

}
