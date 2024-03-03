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
 * @brief Class ClasseEx2
 */
import java.io.IOException;
import java.util.Scanner;
public class ClasseEx2 {
 
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int A, B, C, D;
        A = sc.nextInt();
        B = sc.nextInt();
        C = sc.nextInt();
        D = sc.nextInt();

        if (B > C && D > A) {

            if (C + D > A + B && A % 2 == 0) {

                if (C > 0 && D > 0) {
                    System.out.println("Valores aceitos");
                } else {
                    System.out.println("Valores nao aceitos");
                }

            } else {
                System.out.println("Valores nao aceitos");
            }

        } else {
            System.out.println("Valores nao aceitos");
        }
        sc.close();    
        
        
        
        
        
    }
}
