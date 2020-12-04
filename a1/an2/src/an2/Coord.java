package an2;

// ex 1
public class Coord {
	private int x;
	private int y;
	
	public Coord(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public int calculateDistance() {
		return this.y - this.x;
	}
}

// ex 2
class Rex {
	public Rex() {
		System.out.println("I am angry");
	}
}

class Max {
	public Max() {
		System.out.println("I am not angry");
	}
}

// ex 3
class Acc {
	public Acc(String f, String l , String s) {
		System.out.println(f + " lives in " + l + " he has " + s + "DH");
	}
}

// ex 5
class Ex5 {
	private String f;
	private String a;
	private double s;
	public String getF() {
		return f;
	}
	public void setF(String f) {
		this.f = f;
	}
	public String getA() {
		return a;
	}
	public void setA(String a) {
		this.a = a;
	}
	public double getS() {
		return s;
	}
	public void setS(double s) {
		this.s = s;
	}
}

// ex7
class Ex7 {
	private String titre;
	private String mention;
	private int anobtenu;
	
	public Ex7(String titre, String mention, int anobtenu) {
		this.titre = titre;
		this.mention = mention;
		this.anobtenu = anobtenu;
	}
	
	public String getTitre() {
		return titre;
	}
	public void setTitre(String titre) {
		this.titre = titre;
	}
	public String getMention() {
		return mention;
	}
	public void setMention(String mention) {
		this.mention = mention;
	}
	public int getAnobtenu() {
		return anobtenu;
	}
	public void setAnobtenu(int anobtenu) {
		this.anobtenu = anobtenu;
	}
}