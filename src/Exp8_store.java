
public class Exp8_store {

	public static void main(String[] args) {
		Exp8_food plane = new Exp8_food(); 
		
		plane.name = "ハンバーガー";
		plane.value = 190;
		plane.calorie = 259;
		
		System.out.println("品名："+plane.name+"値段："+plane.value+"カロリー："+plane.calorie);
	    
		Exp8_food tsukimi = new Exp8_food();
	      tsukimi.name = "月見バーガー";
	      tsukimi.value = 440;
	      tsukimi.calorie = 401;
	      
	      System.out.println("品名："+tsukimi.name+"値段："+tsukimi.value+"カロリー："+tsukimi.calorie);
	      Exp8_food newProduct = new Exp8_food();
	}

}
