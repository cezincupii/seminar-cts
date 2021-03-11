package ro.ase.cts.program;

import java.io.FileNotFoundException;

import ro.ase.cts.clase.Angajat;
import ro.ase.cts.clase.Aplicant;
import ro.ase.cts.clase.Proiect;
import ro.ase.cts.clase.Student;
import ro.ase.cts.clase.readers.AplicantReader;
import ro.ase.cts.clase.readers.StudentReader;

import java.util.List;

public class Program {

	public static List<Aplicant> citesteAplicanti(AplicantReader aplicantReader)
			throws NumberFormatException, FileNotFoundException {

		return aplicantReader.citesteAplicanti();
	}

	public static void main(String[] args) {

		System.out.println(Student.getSumaFinantare());
		System.out.println(Angajat.getSumaFinantare());
		List<Aplicant> listaAplicanti;
		AplicantReader aplicantReader = new StudentReader("studenti.txt");

		try {
			listaAplicanti = citesteAplicanti(aplicantReader);
			for (Aplicant angajat : listaAplicanti) {
				System.out.println(angajat.toString());
				angajat.afiseazaStatus(new Proiect(80));
				System.out.println(angajat.getSumaFinantata());
			}

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NumberFormatException e) {
			e.printStackTrace();
		}
	}

}
