package com.gmail.bezkrovna1998;

public class BlackList {
	private Class<?>[] blackList = new Class<?>[10];
	private int quantity = 0;

	public BlackList() {
		super();
		// TODO Auto-generated constructor stub
	}

	public void addClass(Class<?> cl1) throws NullPointerException {
		if (cl1 == null) {
			throw new NullPointerException();
		}
		if (quantity == 10) {
			System.out.println("BlackList is full");
			return;
		}
		if(isClass(cl1)) {
			return;
		}
		blackList[quantity] = cl1;
		quantity++;
	}

	public boolean isClass(Class<?> cl1) throws NullPointerException {
		if (cl1 == null) {
			throw new NullPointerException();
		}
		if (quantity == 0) {
			return false;
		}
		for (Class<?> class1 : blackList) {
			if (class1 == cl1 && class1 != null) {
				return true;
			}
		}
		return false;

	}
	
	public boolean checkObject(Object obj){
		return isClass(obj.getClass());
	}

}
