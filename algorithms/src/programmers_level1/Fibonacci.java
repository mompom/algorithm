package programmers_level1;

class Fibonacci {
	public long fibonacci(int num) {
		long answer = 0;

		if (num <= 1) {
			return num;
		} else {
			answer = fibonacci(num - 1) + fibonacci(num - 2);
			return answer;
		}
	}

	public static void main(String[] args) {
		Fibonacci c = new Fibonacci();
		int testCase = 3;
		System.out.println(c.fibonacci(testCase));
	}
}
