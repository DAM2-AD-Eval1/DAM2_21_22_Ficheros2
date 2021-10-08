import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.stream.Stream;

public class Principal2 {
	
	static int numeroAlumnos = 0;

	public static void main(String[] args) throws IOException {
		
		//Creamos los Paths
		Path rutaDAM1 = Paths.get("D:\\PRUEBAS\\DAM1.txt");
		Path rutaDAM2 = Paths.get("D:\\PRUEBAS\\DAM2.txt");
		Path rutaTotales = Paths.get("D:\\PRUEBAS\\numeroAlumnos.txt");
		
		//Creamos los buffers
		BufferedReader brDAM1 = Files.newBufferedReader(rutaDAM1);
		BufferedReader brDAM2 = Files.newBufferedReader(rutaDAM2);
		//El Writer se genera con las opción de concatenar
		BufferedWriter bwTotales = Files.newBufferedWriter(rutaTotales, StandardOpenOption.APPEND);
		
		Stream<String> lineasDAM1 = brDAM1.lines();
		lineasDAM1.forEach(l -> {
			numeroAlumnos++;
		});
		
		bwTotales.write("El número de alumnos de DAM1 es: " + numeroAlumnos);
		
		numeroAlumnos = 0;
		Stream<String> lineasDAM2 = brDAM2.lines();
		lineasDAM2.forEach(l -> {
			numeroAlumnos++;
		});
		
		bwTotales.write("El número de alumnos de DAM2 es: " + numeroAlumnos);
		
		
		bwTotales.flush();
		bwTotales.close();
		brDAM1.close();
		brDAM2.close();

	}

}
