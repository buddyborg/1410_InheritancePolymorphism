package phones;

import java.util.Random;
/**
 * @author Paulina Cruz
 */
public class TestClient {

	public static void main(String[] args) {
		
		RotaryPhone rotaryPhone = new RotaryPhone("Model 500",new Dimension(143.0,208.0,119.0),Voltage.V110);
		PushButtonPhone pushButtonPhone = new PushButtonPhone("Cortelco 2500", new Dimension(178.0,208.0,119.0),Voltage.DUAL);
		SmartPhone smartphone1 = new SmartPhone("Pixel3", new Dimension(145.6,68.2,7.9), 128);
		SmartPhone smartphone2 = new SmartPhone("iPhone8", new Dimension(138.4,67.3,7.3), 64);
		
		System.out.println("Various Phones:");
		System.out.println(rotaryPhone.toString());
		System.out.println(pushButtonPhone.toString());
		System.out.println(smartphone1.toString());
		System.out.println(smartphone2.toString());
		System.out.println();
		
		rotaryPhone.plugIn();
		pushButtonPhone.plugIn();
		
		Random random = new Random();
		float num = random.nextFloat();
		
		if(num > .5) {
			rotaryPhone.unplug();
		}
		else {
			pushButtonPhone.unplug();
		}
		
		var phones = new Phone[] {
				rotaryPhone,
				pushButtonPhone,
				smartphone1,
				smartphone2
		};
		
		System.out.println("Array Elements:");
		
		for(Phone p: phones) {
			System.out.println(p.toString());
			System.out.println(p.call(8019574111L));
			
			if(p instanceof SmartPhone sp) {
				System.out.println(sp.browse());
				System.out.println(sp.takePicture());
			}
			
			System.out.println();	
		}
	}
}
