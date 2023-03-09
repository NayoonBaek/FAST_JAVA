package ch15;

public class BookShelf extends Shelf implements Queue{

	@Override
	public void enQueue(String title) {

		shelf.add(title);//Shelf클래스에서 protected로 선언한 arrayList
	}

	@Override
	public String deQueue() {
		return shelf.remove(0);
	}

	@Override
	public int getSize() {
		return getCount();
	}

}
