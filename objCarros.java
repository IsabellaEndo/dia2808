package carros;

public class objCarros {

	public static void main(String[] args) {
		
		carros carro1 = new carros();
		carros carro2 = new carros();
		carros carro3 = new carros();
		carros carro4 = new carros();


		carro1.setCor("AMARELO");
		carro1.setnumPorta(4);
		carro1.setnumRodas(4);
		carro1.settipoCarro("ESPORTIVO");
		carro1.setdireita("sim");
		carro1.setesquerda("sim");
		carro1.setfrente("sim");
		carro1.setré("sim");
		
		carro2.setCor("VERDE");
		carro2.setnumPorta(5);
		carro2.setnumRodas(4);
		carro2.settipoCarro("CAMIONETE");
		carro2.setdireita("sim");
		carro2.setesquerda("sim");
		carro2.setfrente("sim");
		carro2.setré("sim");
		
		carro3.setCor("PRETA");
		carro3.setnumPorta(6);
		carro3.setnumRodas(4);
		carro3.settipoCarro("LIMOSINE");
		carro3.setdireita("sim");
		carro3.setesquerda("sim");
		carro3.setfrente("sim");
		carro3.setré("sim");
		
		carro4.setCor("VERMELHO");
		carro4.setnumPorta(0);
		carro4.setnumRodas(6);
		carro4.settipoCarro("TRATOR");
		carro4.setdireita("sim");
		carro4.setesquerda("sim");
		carro4.setfrente("sim");
		carro4.setré("sim");
		
		System.out.println("-----Carro 1-----");
		System.out.println(carro1.getCor());
		System.out.println(carro1.getnumPorta());
		System.out.println(carro1.getnumRodas());
		System.out.println(carro1.gettipoCarro());
		System.out.println(carro1.getdireita());
		System.out.println(carro1.getesquerda());
		System.out.println(carro1.getfrente());
		System.out.println(carro1.getré());
		
		System.out.println("-----Carro 2-----");
		System.out.println(carro2.getCor());
		System.out.println(carro2.getnumPorta());
		System.out.println(carro2.getnumRodas());
		System.out.println(carro2.gettipoCarro());
		System.out.println(carro2.getdireita());
		System.out.println(carro2.getesquerda());
		System.out.println(carro2.getfrente());
		System.out.println(carro2.getré());
		
		System.out.println("-----Carro 3-----");
		System.out.println(carro3.getCor());
		System.out.println(carro3.getnumPorta());
		System.out.println(carro3.getnumRodas());
		System.out.println(carro3.gettipoCarro());
		System.out.println(carro3.getdireita());
		System.out.println(carro3.getesquerda());
		System.out.println(carro3.getfrente());
		System.out.println(carro3.getré());
		
		System.out.println("-----Carro 4-----");
		System.out.println(carro4.getCor());
		System.out.println(carro4.getnumPorta());
		System.out.println(carro4.getnumRodas());
		System.out.println(carro4.gettipoCarro());
		System.out.println(carro4.getdireita());
		System.out.println(carro4.getesquerda());
		System.out.println(carro4.getfrente());
		System.out.println(carro4.getré());
	

	}

}
