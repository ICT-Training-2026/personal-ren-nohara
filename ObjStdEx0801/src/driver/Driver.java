package driver;

import store.AbsProduct;
import store.Deliverable;
import store.LimitedProduct;
import store.NormalProduct;
import store.SpecialProduct;

public class Driver {

	public static void main(String[] args) {
		AbsProduct[] emp = makeProductList();
		
		displayProductList(emp);
		
		Deliverable[] delivemp = getDeliverable(emp);
		
		displayDelivList(delivemp);
	}
	static AbsProduct[] makeProductList() {
		AbsProduct[] emp = {
				new LimitedProduct("マウス", 2000,10),
				new SpecialProduct("特価キーボード",3600,4500),
				new LimitedProduct("Webカメラ",3900,7),
				new NormalProduct("マイク",2800),
				new SpecialProduct("ディスプレイ",15000,20000),
				new NormalProduct("LED照明",4200),
		};
		
			return emp;
	}
	
	static void displayProductList(AbsProduct[] absProd) {
		for(int i = 0; i < absProd.length; i++) {
			absProd[i].display();
		}
	}
	
	static Deliverable[] getDeliverable(AbsProduct[] prod) {
		Deliverable[] deliEmp = new Deliverable[prod.length];
		int dCnt = 0;
		for(int i = 0; i < deliEmp.length; i++ ) {
			if(prod[i] instanceof Deliverable) {
				deliEmp[dCnt] = (Deliverable)prod[i];
				dCnt++;
			}
		}
		return deliEmp;
		
	}
	
	static void displayDelivList(Deliverable[] deliv) {
		for(int i = 0; i < deliv.length; i++) {
			if(deliv[i] == null) {
				break;
			}
			deliv[i].displayDeliv();
		}
	}

}
