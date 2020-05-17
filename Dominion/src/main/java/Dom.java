
import javax.swing.JOptionPane;
import java.util.Random;


/**
 *
 * @author mateus
 */
public class Dom {
    
    public static void main(String[] args) {
        
        String var;
        int jogo;
        Random r = new Random();
        int arr[] = new int[10];
        
        var = JOptionPane.showInputDialog("Qual Jogo?\n1 - Dominion\n2 - Dominion Terramar\n3 - Ambos");
        jogo = Integer.parseInt(var);
        
        switch(jogo){
        
            case 1:
                
                for(int x = 0; x<10; x++){
                arr[x] = r.nextInt(10) + 1;
                }
                for(int x = 0; x < 10; x++){
    		   System.out.print(arr[x] + " ");
                }  

            case 2:
                for(int x = 0; x<10; x++){
                arr[x] = r.nextInt(26) + 1;
                }
                for(int x = 0; x < 10; x++){
    		   System.out.print(arr[x] + " ");
    		}
       
            case 3:
                for(int x = 0; x<10; x++){
                arr[x] = r.nextInt(51) + 1;
                }
                for(int x = 0; x < 10; x++){
    		   System.out.print(arr[x] + " ");
    		}
                }
    }
}

String[] cartasD = {"Foso", "Capilla", "Sótano", "Aldea", "Leñadores",
"Canciller", "Taller", "Burócrata", "Ladrón", "Banquete", "Prestamista",
"Milicia", "Herrería", "Espía", "Salón del trono", "Remodelar",
"Biblioteca", "Bruja", "Festival", "Laboratorio", "Mercado", "Mina",
"Sala del consejo", "Aventurero", "Jardines"};
/*
DOMINION
1 - Foso
2 - Capilla
3 - Sótano
4 - Aldea
5 - Leñadores
6 - Canciller
7 - Taller
8 - Burócrata
9 - Ladrón
10 - Banquete
11 - Prestamista
12 - Milicia
13 - Herrería
14 - Espía
15 - Salón del trono
16 - Remodelar
17 - Biblioteca
18 - Bruja
19 - Festival
20 - Laboratorio 
21 - Mercado
22 - Mina
23 - Sala del consejo
24 - Aventurero
25 - Jardines

String[] cartasT = {"Embajador", "Bazar", "Caravana", "Ratero",
"Embargo", "Explorador", "Pueblo de pescadores","Barco fantasma", 
"Puerto", "Isla", "Faro", "Vigía", "Barco mercante", "Poblado indígena", 
"Navegante", "Puesto avanzado", "Pescador de perlas", "Barco pirata",  
"Rescatador", "Bruja del mar", "Contrabandistas", "Estratega", 
"Mapa del tesoro", "Tesorería", "Almacén", "Muelle"}
DOMINION TERRAMAR
26 - Embajador
27 - Bazar
28 - Caravana
29 - Ratero
30 - Embargo
31 - Explorador
32 - Pueblo de pescadores
33 - Barco fantasma
34 - Puerto
35 - Isla
36 - Faro
37 - Vigía
38 - Barco mercante
39 - Poblado indígena
40 - Navegante
41 - Puesto avanzado
42 - Pescador de perlas
43 - Barco pirata
44 - Rescatador
45 - Bruja del mar
46 - Contrabandistas
47 - Estratega
48 - Mapa del tesoro
49 - Tesorería
50 - Almacén
51 - Muelle
*/
        
                
                
                
              
                    
    
        
        
   
    

