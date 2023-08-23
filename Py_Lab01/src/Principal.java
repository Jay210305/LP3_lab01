import java.util.Scanner;

public class Principal {

	public Principal() {
	}

	public static void main(String[] args) {

		int vida = 0,rp = 0;
		boolean fl = false;
		Scanner sc = new Scanner(System.in);
		do {
			vida++;
			System.out.println("Vida"+vida+"\tCual es el numero secreto?");
			rp = sc.nextInt();
			if (rp == 1234)
				fl = true;
		}while (vida<3 && !fl);
		if (fl = true)
			System.out.println("Adivinaste!!\tHa ganad $1000 como premio");
		else
			System.out.println("ups, perdiste ... :(");

	}

}
