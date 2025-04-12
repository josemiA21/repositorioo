package Caso3;

public class Contador {
private static int totalObjetos=0;
private String nom;

public Contador(String nom) {
	this.nom = nom;
	totalObjetos++;
}

public int mostrarTotal() {
	return totalObjetos;
}
}
