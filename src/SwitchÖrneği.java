
public class SwitchÖrneği {

	public class Main {

		public static void main(String[] args) {
			char sınavNotu = 'C';

			switch (sınavNotu) {
			case 'A':
				System.out.println("AA geçtin");
				break;
			case 'B':
				System.out.println("BB geçtin");
				break;
			case 'C':
				System.out.println("CC geçtin");
				break;
			case 'F':
				System.out.println("KALDIN");
				break;

			default:
				System.out.println("YANLIŞ NOT GİRDİNİZ");

			}

		}

	}
}
