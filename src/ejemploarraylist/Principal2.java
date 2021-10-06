package ejemploarraylist;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Principal2 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader brDAM1 = new BufferedReader(new FileReader("D:\\PRUEBAS\\DAM1.txt"));
		BufferedReader brDAM2 = new BufferedReader(new FileReader("D:\\PRUEBAS\\DAM2.txt"));
		
		BufferedWriter bwTotales = new BufferedWriter(new FileWriter("D:\\PRUEBAS\\numeroAlumnos.txt"));
		
		String linea;
		ArrayList<Alumno> alumnosDAM1 = new ArrayList<Alumno>();
		ArrayList<Alumno> alumnosDAM2 = new ArrayList<Alumno>();
	
		String[] valoresAlumno;
		Alumno alumno = null;
		while((linea = brDAM1.readLine()) != null) {
			//linea = Pepito 981111111
			valoresAlumno = linea.split(" ");
		    //valoresAlumno[0] = Pepito; valoresAlumno[1]=981111111
		    alumno = new Alumno(valoresAlumno[0], valoresAlumno[1]);
		    alumnosDAM1.add(alumno);
		}
		
		while((linea = brDAM2.readLine()) != null) {
			valoresAlumno = linea.split(" ");
		    alumno = new Alumno(valoresAlumno[0], valoresAlumno[1]);
		    alumnosDAM2.add(alumno);
		}	
		
		bwTotales.write("El número de alumnos DAM1 es: " + alumnosDAM1.size() + "\rEl número de alumnos DAM2 es: " 
				                                                                      + alumnosDAM2.size());
		
		bwTotales.flush();
		bwTotales.close();
		brDAM1.close();
		brDAM2.close();

	}

}
