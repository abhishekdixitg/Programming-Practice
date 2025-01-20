
public class Testfunctional {

	public static void main(String[] args) {
		calculate add = (a, b) -> a + b;
		calculate multi = (a, b) -> a * b;
		calculate sub = (a, b) -> a - b;
		calculate div = (a, b) -> a / b;
		System.out.println(add.calculator(3, 4));
		System.out.println(multi.calculator(3, 4));
		System.out.println(sub.calculator(3, 4));
		System.out.println(div.calculator(4, 2));

		StringProcessor upperCase = i -> System.out.println(i.toUpperCase());

		StringProcessor reverse = i -> System.out.println(new StringBuilder(i).reverse().toString());
		StringProcessor removeVowels = i -> System.out.println(i.replaceAll("[AEIOUaeiou]", ""));

		upperCase.process("abhishek");
		reverse.process("abhishek");
		removeVowels.process("abhishek");

	}

}
