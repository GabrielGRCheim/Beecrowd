/*
 * Copyright (C) 2024 Gabriel Gomes Rodrigues Cheim <gabrielgrcheim2@gmail.com>
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package pacotelista1;

/**
 *
 * @author Gabriel Gomes Rodrigues Cheim <gabrielgrcheim2@gmail.com>
 * @date 03/03/2024
 * @brief Class ClasseEx13
 */
import java.util.Scanner;

public class ClasseEx13{

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		
		for (int i = 0; i < N; i++) {
			
			StringBuilder M = new StringBuilder(readLine(sc));
			
			for (int j = 0; j < M.length(); j++) {
				int code = M.charAt(j);
				if ((code >= 65 && code <= 90) || (code >= 97 && code <= 122)) {
					char c = (char) (code + 3);
					M.setCharAt(j, c);
				}
			}
			
			M.reverse();
			
			for (int j = M.length() / 2; j < M.length(); j++) {
				char c = (char) (M.charAt(j) - 1);
				M.setCharAt(j, c);
			}
			
			System.out.println(M.toString());
		}
	}
	
	public static String readLine(Scanner sc) {
		String line = sc.nextLine();
		while (line.isEmpty())
			line = sc.nextLine();
		return line;
	}

}
