
public class Stack {
	
	private Element head;
	private Element tail;
	private int size;
	
	public Stack(){
		this.head = null;
		this.tail = null;
		this.size = 0;			
	}
	
	public void push(String s){
		Element ele = new Element(s, tail, null);
		
		if(this.isEmpty()){
			this.head = ele;
			this.tail = ele;
			this.size++;
			return;			
		}
		tail.next = ele;
		tail = ele;
		this.size++;
	}
	
	public String pop(){
		if(this.tail == null){
			return "";
		}
		String value = tail.getValue();
		this.tail.getPrev().steNext(null);
		this.tail = this.tail.getPrev();
		this. size--;
		return value;
	}
	
	public String peek(){
		if(this.tail == null){
			return "";
		}
		return
		String value = tail.getValue();
		this.tail.getPrev().steNext(null);
		this.tail = this.tail.getPrev();
		this. size--;
		return value;
	}
	
	
	private class Element{
		
		private String value;
		private Element prev;
		private Element next;
		
		public Element(String value, Element prev, Element next){
			this.value = value;
			this.prev = prev;
			this.next = next;
		}
		
		public boolean equals(Object obj){
			if(obj == null || this.getClass() == obj.getClass()){
				return false;
			}
			if(this == obj){
				return true;
			}
			Element otherElement = (Element) obj
		}
		
	
	}
	

}
