package projRelogio;

public class App {
	public static void main(String[] args) {
		Relogio relogio1 = new Relogio(2, 12, 30);
		
		relogio1.setHora(3);
		relogio1.setMinuto(200);
		System.out.println(relogio1.getHoraAtual());
	}
}
