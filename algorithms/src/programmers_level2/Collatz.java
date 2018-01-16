package programmers_level2;

class Collatz {
	public int collatz(int num) {
		int answer = 0;

		while (num > 1) {

			if (num % 2 == 0) {
				num = num / 2;
			} else {
				if (num * 3 + 1 < 0) return -1;
				num = num * 3 + 1;
			}
			answer++;
			if (answer == 500) {
				answer = -1;
				break;
			}
		}

		return answer;
	}

	// 아래는 테스트로 출력해 보기 위한 코드입니다.
	public static void main(String[] args) {
		Collatz c = new Collatz();
		int ex = 6;
		System.out.println(c.collatz(ex));
	}
}