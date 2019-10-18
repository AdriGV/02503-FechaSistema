/* 
 * Copyright 2019 AdrianGV  adrian.gimeno.alum@iescamp.es.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.japo.java.main;

import java.util.Calendar;

/**
 *
 * @author AdrianGV adrian.gimeno.alum@iescamp.es
 */
public final class Main {

    public static void main(String[] args) {
        //Variables
        int d;
        int m;
        int a;
        
        //Objeto 
        Calendar cal = Calendar.getInstance();

        //Obtener Valores
        d = cal.get(Calendar.DAY_OF_MONTH);
        //d = cal.get(Calendar.DATE);
        m = cal.get(Calendar.MONTH) + 1; //month sale de 0 a 11, si ponemos el +1 sale enero y diciembre
        a = cal.get(Calendar.YEAR);
        
        //Mensaje
        System.out.printf("Fecha del sistema ...: %02d/%02d/%04d%n", d, m, a);
    }
}
