public class Airport {
	void allowplane(Plane ref) {
		ref.takeoff();
		ref.fly();
		ref.land();
		if(ref instanceof PassengerPlane) {
			
		}
	}


}
