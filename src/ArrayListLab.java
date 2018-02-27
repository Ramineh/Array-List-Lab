import java.util.ArrayList;

public class ArrayListLab {
	private Object[] elementData;
	private int size=0;

public ArrayListLab() {
	elementData = new Object[10];
	this.size=0;
	
}
public void add(Object obj) {
	
	if (elementData.length==size) {
		Object[] newElementData= new Object[size*2];
		newElementData=elementData.clone();
		elementData=newElementData;
	}
	elementData[this.size]=obj;
	this.size++;
	
	
}



public void removeAll(Object obj) {
	for (int i=0;i<=this.size;i++) {
		if (elementData[i]==obj) {
			elementData[i]=elementData[i++];
			this.size--;
		}
		
	}	

}
public void printSize() {
	System.out.println(" The ArrayList size is:" +this.size);
}
}
