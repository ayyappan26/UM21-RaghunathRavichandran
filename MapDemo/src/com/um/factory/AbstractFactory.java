package com.um.factory;

import com.um.dao.IDao;

public abstract class AbstractFactory {
	public abstract IDao getDao();
	public static AbstractFactory getFactory(int choice){
		AbstractFactory factory = null;
		if(choice ==1 ){
			factory = new OracleFactory();
		}else if(choice ==2){
			factory = new FileSystemFactory();
		}
		return factory;
	}
}
