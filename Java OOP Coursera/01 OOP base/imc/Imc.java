package imc;

class Imc {

	public static void main(String[] args) {

        Patient quidam = new Patient();
        quidam.init(74.5, 1.75);
        quidam.afficher();
        System.out.println("IMC : " + quidam.imc());
        quidam.init( -2.0, 4.5);
        quidam.afficher();
    }

}
