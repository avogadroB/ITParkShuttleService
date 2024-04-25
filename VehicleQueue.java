package DSLMiniProj;

public class VehicleQueue {
	Vehicle front, rear;
	final float minimumMileage = 0;

	VehicleQueue() {
		front = null;
		rear = null;
	}

	boolean isempty() {
		if (rear == null && front == null)
			return true;
		return false;
	}

	// Enqueue a Single Vehicle in the Queue
	void enqueue(Vehicle incomingVehicle) {//accept node for enque
		// Assign the Values to the node of Vehicles: incomingVehicle
		if (isempty()) {
			front = incomingVehicle;
			rear = incomingVehicle;
		} else {
			rear.next = incomingVehicle;
			rear = rear.next;
		}
	}

	Vehicle dequeue() {
		if (isempty()) {
			// Returning null to Show that there is no Vehicle to Dispatch
			return null;
		}
		// Using A incomingVehicle to Access the vehicle being Dispatched
		Vehicle dispatchedVehicle = front;
		front = front.next;
		if (front == null) {
			rear = null;
		}
		// Thus Dispatched Vehicle is Accessible to the User
		return dispatchedVehicle;
	}
}

class Seater4 extends VehicleQueue {
	// model
	// numberPlate
	// Mileage
	void enqueue(Vehicle incomingVehicle) {
		
		// Assign the Values to the node of Vehicles: incomingVehicle
		if (isempty()) {
			front = incomingVehicle;
			rear = incomingVehicle;
		} else {
			rear.next = incomingVehicle;
			rear = rear.next;
		}
	}
}

class Seater2 extends VehicleQueue 
{
	void enqueue(Vehicle incomingVehicle) {
	
		// Assign the Values to the node of Vehicles: incomingVehicle
		if (isempty()) {
			front = incomingVehicle;
			rear = incomingVehicle;
		} else {
			rear.next = incomingVehicle;
			rear = rear.next;
		}
	}
	// Manually Assign
	// model
	// numberPlate
	// Mileage
}

class Seater6 extends VehicleQueue {
	void enqueue(Vehicle incomingVehicle) {
		
		// Assign the Values to the node of Vehicles: incomingVehicle
		if (isempty()) {
			front = incomingVehicle;
			rear = incomingVehicle;
		} else {
			rear.next = incomingVehicle;
			rear = rear.next;
		}
	}
}
