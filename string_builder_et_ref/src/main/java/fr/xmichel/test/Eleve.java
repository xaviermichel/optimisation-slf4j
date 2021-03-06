package fr.xmichel.test;

import java.util.Arrays;

/**
 * Un simple POJO d'exemple
 * @author xavier
 *
 */
public class Eleve {

	private Integer id;
	
	private String civilite;

	private String nom;
	
	private String prenom;

	private int age;
	
	private double taille;
	
	private double poids;
	
	private int[] notes;

	public Eleve(String civilite, String nom, String prenom, int age,
			double taille, double poids, int[] notes) {
		super();
		this.civilite = civilite;
		this.nom = nom;
		this.prenom = prenom;
		this.age = age;
		this.taille = taille;
		this.poids = poids;
		this.notes = notes;
	}
	

	/**
	 * Ajoute une note à l'éleve
	 * 
	 * Cette version n'est pas optimisée du tout par rapport à une ArrayList ou LinkedList
	 */
	public void addNote(int note) {
		notes = Arrays.copyOf(notes, notes.length + 1);
		notes[notes.length-1] = note;
	}
	
	/**
	 * La seul méthode qui a un vrai traitement
	 */
	public double getMoyenne() {
		int total = 0;
		for (int note : notes) {
			total += note;
		}
		
		return ((double)total)/notes.length;
	}
	
	
	
	@Override
	public String toString() {
		StringBuilder out = new StringBuilder();
		
		out.append("Eleve");
		
		out.append("{ id= ");
		out.append(id);
		out.append(", ");
		
		out.append("civ= ");
		out.append(civilite);
		out.append(", ");
		
		out.append("nom= ");
		out.append(nom);
		out.append(", ");
		
		out.append("prenom= ");
		out.append(prenom);
		out.append(", ");
		
		out.append("age= ");
		out.append(age);
		out.append(", ");
		
		out.append("taille= ");
		out.append(taille);
		out.append(", ");

		out.append("poids= ");
		out.append(poids);
		out.append(", ");
		
		out.append("notes=[");
		for (int note : notes) {
			out.append(note);
			out.append(", ");
		}
		out.append("],");
		
		out.append("moyenne=");
		out.append(getMoyenne());
		out.append(" }");
		
		return out.toString();			
	}

	
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCivilite() {
		return civilite;
	}

	public void setCivilite(String civilite) {
		this.civilite = civilite;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getTaille() {
		return taille;
	}

	public void setTaille(double taille) {
		this.taille = taille;
	}

	public double getPoids() {
		return poids;
	}

	public void setPoids(double poids) {
		this.poids = poids;
	}

	public int[] getNotes() {
		return notes;
	}

	public void setNotes(int[] notes) {
		this.notes = notes;
	}
}
