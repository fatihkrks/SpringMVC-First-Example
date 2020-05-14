package service;

import org.springframework.stereotype.Service;

@Service
public class MyServiceImpl implements MyService {

	@Override
	public String Message() {
		
		return "interface message";
	}

}
