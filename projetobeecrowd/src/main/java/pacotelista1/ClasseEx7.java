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
 * @brief Class ClasseEx7
 */
import java.util.Scanner;

public class ClasseEx7 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int X = 1;
        int Y = 1;

        while (X != 0 || Y != 0) {
            X = sc.nextInt();
            Y = sc.nextInt();

            if (X > 0 && Y > 0) {
                System.out.println("primeiro");
            } else if (X < 0 && Y > 0) {
                System.out.println("segundo");
            } else if (X < 0 && Y < 0) {
                System.out.println("terceiro");
            } else if (X > 0 && Y < 0) {
                System.out.println("quarto");
            } else {
                break;
            }
        }

        sc.close();
    }
}
