package com.gmail.bezkrovna1998;

public class Stack {
	private Object[] stackArr=new Object[10];
	private int top=0;
	private BlackList bl;

	public Stack() {
		super();
		// TODO Auto-generated constructor stub
	}
	 
	public Stack(BlackList bl) {
		super();
		this.bl = bl;
	}

	public BlackList getBl() {
		return bl;
	}

	public void setBl(BlackList bl) {
		this.bl = bl;
	}

	public void addObject(Object obj) throws NullPointerException{
		if(obj==null) {
			throw new NullPointerException();
		}
		if (top==stackArr.length) {
			System.out.println("Stack is full");
			return;
		}
		if(bl!=null && bl.checkObject(obj)) {
			System.out.println("Opps. "+ obj.getClass()+" is in Black List");
			return;
		}
		stackArr[top]=obj;
		top++;
	}

	public Object getDelete() {
		if(top==0) {
			return null;
		}
		Object obj=stackArr[--top];
		stackArr[top]=null;
		return obj;
	}
	
	public Object getObject() {
		return stackArr[top-1];
	}
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < top; i++) {
			if (stackArr[i] == null) {
				continue;
			}
			sb.append(stackArr[i].getClass() + "   ").append(stackArr[i]);
			sb.append(System.lineSeparator());
		}
		return sb.toString();
	}
}
