/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp1;

import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;

/**
 *
 * @author luclop
 */
public class Etudiant {

    private String id;
    private float[] notes;
    private int taille;
    public String nom, prenom;
    private static final int MAXIMUM = 20;

    public Etudiant()
    {
        id = "0";
        notes = null;
        taille = 0;
        nom = "0";
        prenom = "0";
    }
    
    public Etudiant(float[] tab)
    {
        taille = tab.length;
        setTab(tab);
    }
    
    public float[] getTab()
    {
        return notes;
    }
    
    public void setTab(float[] tableau){
        this.notes = tableau;
    }
    
    public void AfficherNotes(){
        for(int j = 0;j<getTab().length;j++)
        {
            System.out.println(getTab()[j]);
        }   
    }
    
    public void RemplirTab(){   
        Random nbAlea = new Random();
        for(int k = 0;k<getTab().length;k++)
        {
            float nbRandom = nbAlea.nextInt(MAXIMUM);
            notes[k] = nbRandom;
        }
    }
    
    public void TrierTab(float[] tab){
        Arrays.sort(tab);
    }
    
    public void Statistiques(float[] tab){
       float max = 0;
       float min = 15567;
        //int min = Collections.min(Arrays.asList(tab)); Fcontionne uniquement avec les ArrayList
        float moy = 0;
        float cinf8 = 0;
        float cinf12 = 0;
        float csup12 = 0;

        for(int cpt = 0;cpt<getTab().length;cpt++){
             moy = tab[cpt] + moy;
             if(tab[cpt]>max || max == 0)
                 max = tab[cpt];
             if(tab[cpt]<min || min ==15567)
                 min = tab[cpt];
             
        }
        moy = (moy/(tab.length));
        float inf8,sup8,sup12 = 0;
        for(int cpt2 = 0;cpt2<tab.length;cpt2++){
            if(tab[cpt2]<8)
            {
                cinf8++;
            }
            else if(tab[cpt2]<12)
            {
                cinf12++;
            }
            else if(tab[cpt2]>12)
            {
                csup12++;
            }
        }
        inf8 = (cinf8/tab.length)*100;
        sup8 = (cinf12/tab.length)*100;
        sup12 = (csup12/tab.length)*100;
        System.out.println("Le min est : " + min);
        System.out.println("Le max est : " + max);
        System.out.println("La moyenne est : " + moy);
        System.out.println("Le % des notes inférieures à 8 est : " + inf8);
        System.out.println("Le % des notes entre 8 et 12 est : " + sup8);
        System.out.println("Le % des notes supérieures à 12 est : " + sup12);
    }
    
    public boolean ReturnBoolean (float nombre){
        boolean res = false;
        for(int i = 0;i<notes.length;i++)
        {
            if(notes[i]==nombre)
               res = true;
        }
        return res;
    }
    
    @Override 
public String toString()
{
// Une description synthétique de votre objet ou texte pour une sortie console
    String chaine = id + nom + prenom;
    return "Fini";
}

public void AfficherEtudiant(String caracts){
        System.out.println(id + nom + prenom);
}
    
            
    public void modifier (String id, float[] notes, int taille, String nom, String prenom)
    {
        this.id = id;
        this.notes = notes;
        this.taille = taille;
        this.nom = nom;
        this.prenom = prenom;
    }
            
}
