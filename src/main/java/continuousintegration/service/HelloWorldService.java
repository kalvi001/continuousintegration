package continuousintegration.service;

import continuousintegration.DAL.HelloWordServiceDal;

public class HelloWorldService {
	public boolean equalityCheck(int a , int b)
	{
		HelloWordServiceDal hdal =  new HelloWordServiceDal();
		return hdal.equalityCheck(a,b);
	}

}
