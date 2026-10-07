public class TypeCasting{
	public static void main(String[] args){
		double price = 765;
		System.out.printf("the price of fuel is %f%n",price);
		double quantity = 632.50;
		int convertedQuantity = (int)quantity;
		System.out.printf("i ordered %d loaves of bread yesterday%n",convertedQuantity);
	}
}
