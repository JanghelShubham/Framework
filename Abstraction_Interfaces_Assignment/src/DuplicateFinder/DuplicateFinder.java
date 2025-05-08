package DuplicateFinder;

import java.util.HashSet;

import java.util.Scanner;

public class DuplicateFinder {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println(" enter the number :- ");
		int num = sc.nextInt();

		HashSet<Integer> uniqueNo = new HashSet<Integer>();
		HashSet<Integer> duplicate = new HashSet<Integer>();

		System.out.println("Enter the no ");

		for (int i = 0; i < num; i++) {
			int no = sc.nextInt();
			if (!uniqueNo.add(no)) {

				duplicate.add(no);

			}

		}
		if (duplicate.isEmpty()) {
			System.out.println(" No  duplicate no are found ");

		} else {
			System.out.println(" Duplicate no are ");
			for (int duplicates : duplicate) {
				System.out.println(duplicates);

			}

		}
		sc.close();

	}

}
