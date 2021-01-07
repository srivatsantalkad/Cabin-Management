// Testing parent class StandardCabin, and child class PremiumCabin
class Main {
  public static void main(String[] args) {
		StandardCabin standardCabin1 = new StandardCabin();
		PremiumCabin premiumCabin1 = new PremiumCabin();

		standardCabin1.cabinCleaning();
		standardCabin1.cabinDeliverFood("Food");
		standardCabin1.cabinDeliverOther("Something");

		premiumCabin1.cabinEntertainment();
		premiumCabin1.cabinCleaning();

		System.out.println("Premium cabin has extra capacity:");
		System.out.println(premiumCabin1.getCabinExtraCapacity());
  }
}