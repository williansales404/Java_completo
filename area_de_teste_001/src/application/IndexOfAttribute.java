package application;
import java.util.ArrayList;
import java.util.List;

class MyObject {
	private String name;
	private int id;

	public MyObject(String name, int id) {
		this.name = name;
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public int getId() {
		return id;
	}
}

public class IndexOfAttribute {

	public static int findIndexOfAttribute(List<MyObject> list, String attributeName, int targetId) {
		for (int i = 0; i < list.size(); i++) {
			MyObject obj = list.get(i);
			if (obj.getId() == targetId) {
				return i;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		List<MyObject> objects = new ArrayList<>();
		objects.add(new MyObject("Object1", 1));
		objects.add(new MyObject("Object2", 2));
		objects.add(new MyObject("Object3", 3));

		int targetId = 2;
		int index = findIndexOfAttribute(objects, "id", targetId);

		if (index != -1) {
			System.out.println("Índice do objeto com id " + targetId + ": " + index);
		} else {
			System.out.println("Objeto com id " + targetId + " não encontrado.");
		}
	}
}