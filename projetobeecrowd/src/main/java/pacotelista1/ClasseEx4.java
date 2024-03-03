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
 * @brief Class ClasseEx4
 */
import java.io.IOException;
import java.util.Scanner;
public class ClasseEx4{
 
    public static void main(String[] args) throws IOException {
         Scanner sc = new Scanner(System.in);

        double N = sc.nextDouble();

        if (N >= 0 && N <= 25) {
            System.out.println("Intervalo [0,25]");
        } else if (N > 25 && N <= 50) {
            System.out.println("Intervalo (25,50]");
        } else if (N > 50 && N <= 75) {
            System.out.println("Intervalo (50,75]");
        } else if (N > 75 && N <= 100) {
            System.out.println("Intervalo (75,100]");
        } else {
            System.out.println("Fora de intervalo");
        }
        sc.close();
    }
 
}
