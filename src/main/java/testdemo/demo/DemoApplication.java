package testdemo.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import testdemo.demo.model.Employee;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

@SpringBootApplication
public class DemoApplication {
	static int charry=0;
	public static void main(String[] args) {

		SpringApplication.run(DemoApplication.class, args);





//Write a program to find largest even word in a given string
//Input: "This string contains special characters."
//Output: characters
//Input:"Java is a programming language; programming is fun!"
//Output:language



//For example, given the input string "abbcdbefghhii",
// the program should output the subarrays [ab, bcd, befgh, hi, i].
//Input:"abbcdbefghhii"
//output: sub array:ab,bcd,befgh,hi,i
//
//has context menu
//Compose


		//Write a program to find largest even word in a given string
		String input= "This string contains special characters.";
		//Output: characters
		//Input:"Java is a programming language; programming is fun!"
		//Output:language


		input =  input.replaceAll("[^a-zA-Z0-9 ]","");
		String[] stringList =  input.split(" ");

		String maxStr = "";
		for(int i= 0; i < stringList.length; i++){
			if(stringList[i].length() % 2 == 0){
				maxStr= stringList[i];
			}
		}
		System.out.println(maxStr);





		}

}
