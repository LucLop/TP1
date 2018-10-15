/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
    goo.gl/R6hq9E
    Donner le lien du github 
 */
package tp1;

/**
 *
 * @author luclop
 */
public class 
TP1
{
public static void main(String args[]) {
/* 
Identifiez l’erreur 1
et corrigez
    I EST DEFINI DEUX FOIS
*/
for (int i = 0; i < 5; i++)
System.out.print(i + ", ");
System.out.print("\n");  //Peut être remplacé par System.out.println();
/*
Identifiez l’erreur 2 et corrigez 
CALCUL AVEC FLOAT ET DOUBLES
*/
double a = 3.0;
double b = 4;
double c;
c = Math.sqrt(a * a + b * b);
System.out.println("c = " + c);
/*
Identifiez l’erreur 3 et corrigez 
CALCUL AVEC TYPES DIFFéRENTS
*/
byte bb = 42;
char cc = 'a'; 
short s = 1024; 
int i = 50000;   
float f = 5.67f;
double d = .1234;
double resultat = (f * bb) + (i / cc) 
-
(d * s);
System.out.print((f * bb) + " + " + (i / cc) + " -" + (d * s));
System.out.println(" = " + resultat); 
byte b2 = 10;
byte b3 = (byte) (b2 * bb); //Ajouter (byte) pour dire au compilateur qu'il faut faire une opération binaire.
System.out.println("b3 = " + b3);
}
}
