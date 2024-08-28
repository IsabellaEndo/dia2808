package carros;

public class objAviao {

	public static void main(String[] args) {
		
		aviao aviao1 = new aviao();
		aviao aviao2 = new aviao();
		aviao aviao3 = new aviao();
		aviao aviao4 = new aviao();
		
		aviao1.setCor("ROSA");
		aviao1.setnumJanelas(100);
		aviao1.setnumAsa(2);
		aviao1.settipoAviao("JATO");
		aviao1.setnumTurbinas(9);
		
		aviao2.setCor("BRANCO");
		aviao2.setnumJanelas(80);
		aviao2.setnumAsa(2);
		aviao2.settipoAviao("AEROSTATO");
		aviao2.setnumTurbinas(5);
		
		aviao3.setCor("VERDE");
		aviao3.setnumJanelas(200);
		aviao3.setnumAsa(2);
		aviao3.settipoAviao("TURBOELICE");
		aviao3.setnumTurbinas(9);
		
		aviao4.setCor("AMARELO");
		aviao4.setnumJanelas(20);
		aviao4.setnumAsa(2);
		aviao4.settipoAviao("JATINHO PARTICULAR");
		aviao4.setnumTurbinas(4);
		
		System.out.println("-----aviao 1-----");
		System.out.println(aviao1.getCor());
		System.out.println(aviao1.getnumJanelas());
		System.out.println(aviao1.getnumAsa());
		System.out.println(aviao1.gettipoAviao());
		System.out.println(aviao1.getnumTurbinas());
		
		System.out.println("-----aviao 2-----");
		System.out.println(aviao2.getCor());
		System.out.println(aviao2.getnumJanelas());
		System.out.println(aviao2.getnumAsa());
		System.out.println(aviao2.gettipoAviao());
		System.out.println(aviao2.getnumTurbinas());
		
		System.out.println("-----aviao 3-----");
		System.out.println(aviao3.getCor());
		System.out.println(aviao3.getnumJanelas());
		System.out.println(aviao3.getnumAsa());
		System.out.println(aviao3.gettipoAviao());
		System.out.println(aviao3.getnumTurbinas());
		
		System.out.println("-----aviao4 -----");
		System.out.println(aviao4.getCor());
		System.out.println(aviao4.getnumJanelas());
		System.out.println(aviao4.getnumAsa());
		System.out.println(aviao4.gettipoAviao());
		System.out.println(aviao4.getnumTurbinas());

	}

}
