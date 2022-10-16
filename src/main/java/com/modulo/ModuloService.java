package com.modulo;
import org.springframework.stereotype.Service;
@Service
public class ModuloService implements IModuloService  
{

	@Override
	public String calculateFizzOrBuzz(Integer number) {
		String str = "";
		if(number%3==0 && number%5==0)
		{
			str = "Fizz Buzz";
		}
		else if (number%3==0) {
			str = "Fizz";
		}
		
		else if (number%5==0) {
			str = "Buzz";
		}
		else
		{
			str = "Not Fizz Nor Buzz";
		}
		return str;
	}

}
