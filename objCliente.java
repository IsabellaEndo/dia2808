package carros;



public class objCliente {

	public static void main(String[] args) {
		
		classeCliente cliente2 = new classeCliente();
		classeCliente cliente1 = new classeCliente();
		
		cliente1.setNome("FULANA");
		cliente1.setId(60);
		cliente1.settelefone(123456789);
		cliente1.setRG(123456789);
		cliente1.setCPF(123456789);
		cliente1.setencherga("sim");
		cliente1.setanda("sim");
		cliente1.settrabalha("sim");
		cliente1.setfala("sim");
		
		cliente1.setNome("CICLANA");
		cliente1.setId(10);
		cliente1.settelefone(123456789);
		cliente1.setRG(123456789);
		cliente1.setCPF(123456789);
		cliente1.setencherga("sim");
		cliente1.setanda("sim");
		cliente1.settrabalha("NAO");
		cliente1.setfala("sim");
		
		System.out.println("-----PESSOA 1-----");
		System.out.println(cliente1.getNome());
		System.out.println(cliente1.getid());
		System.out.println(cliente1.gettelefone());
		System.out.println(cliente1.getencherga());
		System.out.println(cliente1.getRG());
		System.out.println(cliente1.getCPF());
		System.out.println(cliente1.getanda());
		System.out.println(cliente1.getfala());
		System.out.println(cliente1.gettrabalha());
		
		System.out.println("-----PESSOA 2-----");
		System.out.println(cliente2.getNome());
		System.out.println(cliente2.getid());
		System.out.println(cliente2.gettelefone());
		System.out.println(cliente2.getencherga());
		System.out.println(cliente2.getRG());
		System.out.println(cliente2.getCPF());
		System.out.println(cliente2.getanda());
		System.out.println(cliente2.getfala());
		System.out.println(cliente2.gettrabalha());
		

	}

}
