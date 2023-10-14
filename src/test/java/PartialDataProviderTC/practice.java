package PartialDataProviderTC;

public class practice {
public static void main(String[] args) {
	String  fruits[] = {"Banana", "Orange", "Apple", "Mango"};
	int fLen = fruits.length;

	String text = "<ul>";
	for (int i = 0; i < fLen; i++) {
	 System.out.println("<li>" + fruits[i] + "</li>"); 
	}
	text += "</ul>";
}
}
