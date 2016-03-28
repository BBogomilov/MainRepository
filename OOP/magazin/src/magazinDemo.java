package magazin;

public class magazinDemo {

	public static void main(String[] args) {
		
		Magazin mincho = new Magazin("При Минчо", "с. Куртово Конаре" , 50);
		
		Beer biraShumensko = new Beer("Шуменско", "Beer" , 1.19);
		Meat meso = new Meat("Говеждо" , "Meat" , 6.50);
		Fish riba = new Fish("Октопод" , "Fish" , 10.99);
		
		mincho.addProduct(biraShumensko);
		((CountableProduct)mincho.getProducts()[0]).addQuantity(20);
		
		mincho.addProduct(meso);
		((WeightProduct)mincho.getProducts()[1]).addWeight(30);
		
		mincho.addProduct(riba);
		((WeightProduct)mincho.getProducts()[2]).addWeight(10);
		
		Shopper misho = new Shopper("Мишака" , mincho , 50.87 , 5);
		
		misho.addCountableProduct(biraShumensko, 2);  //ако закоментираш 24 и 25 ред гърми
		misho.addWeightMeasurableProduct(meso, 3.500);
		misho.addWeightMeasurableProduct(riba, 8);
		misho.removeWeightMeasurableProduct(riba);
		
		System.out.println("\nAnd now the payment!!!!!!!!");
		misho.pay();
	}
}
