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
 * @brief Class ClasseEx6
 */
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ClasseEx6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();

        List<Integer> numeros = new ArrayList<>();

        numeros.add(A);
        numeros.add(B);
        numeros.add(C);

        Collections.sort(numeros);

        for (Integer numero : numeros) {
            System.out.println(numero);
        }

        System.out.println();

        System.out.println(A);
        System.out.println(B);
        System.out.println(C);


        sc.close();
    }
}
