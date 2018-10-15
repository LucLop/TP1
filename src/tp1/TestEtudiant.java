/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp1;

import java.util.Scanner;

/**
 *
 * @author luclop
 */
public class TestEtudiant {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner keyboard = new Scanner(System.in);
        float[] Tableau,Test;
        Etudiant etu1 = new Etudiant();

        
        
        //Etudiant etu2 = new Etudiant();
        //System.out.println(etu1.id);//On ne peut pas afficher les champs privés en dehors de la classe Etudiant car c'est un private
        //J'ai donc déclarer id de la classe Etudiant comme static comme cela nous pourrons accéder à cette variable, modifier les variables locales sans toucher à celle de la classe
        //System.out.println(etu1.notes);
        int entier = 12;
 
        System.out.println("Saississez un entier POSITIF");
        int clavier = keyboard.nextInt();
        while(clavier<0)
        {
            System.out.println("J'ai dit positif");
            clavier = keyboard.nextInt();
        }
        Tableau = new float[clavier];
        for(int k=0;k<clavier;k++){
            System.out.println("Saississez la valeur de l'élément :" + k);
            int elemTab = keyboard.nextInt();
            Tableau[k] = elemTab;
        }
        etu1.setTab(Tableau);
       Etudiant etu2 = new Etudiant(Tableau);
        //System.out.println("Entrez un id, un nom, un prenom svp");
        //String Nid = keyboard.next();
        //String Nnom = keyboard.next();
       // String Nprenom = keyboard.next();
        //etu1.modifier(Nid,Tableau,entier,Nnom,Nprenom);
        //Pour pouvoir afficher le tableau de notes on peut le passer en static dans la classe étudiant.
        // Mais aussi on peux utiliser des getters et setters
        for(int j = 0;j<Tableau.length;j++){
        //System.out.println((etu1.getTab())[j]); //Affichage de Tab[j] de etu1
        

        
        }
        //etu1.RemplirTab();
        etu1.AfficherNotes();
        etu1.TrierTab(Tableau);
        etu1.AfficherNotes();
        etu1.Statistiques(Tableau);

    }
}
    

