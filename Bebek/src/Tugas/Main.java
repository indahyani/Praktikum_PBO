
package Tugas;

import Bertahan.*;
import Menyerang.*;
import Terbang.*;
import suaraBebek.*;



public class Main {
    public static void main(String[] args) {
        
        
        Duck superbebek = new Duck(new RocketFly(), new ToaSound(), new Panah(), new ShiledBertahan());
        System.out.println("Super duck Behaviour  : ");
        superbebek.getFly();
        superbebek.getSound();
        superbebek.getAttack();
        superbebek.getBertahan();
        
        Duck noob=new Duck(new WingsFly(), new NormalSound(), new Pedang(), new ArmorDefend());
        System.out.println("\n noob duck behaviour : ");
        noob.getFly();
        noob.getSound();
        noob.getAttack();
        noob.getBertahan();
        
        Duck change = new Duck(new PlanetFly(), new ToaSound(), new Panah(), new ShiledBertahan());
        System.out.println("\nSuper Change Duck Behaviour : ");
        change.getFly();
        change.getSound();
        change.getAttack();
        change.getBertahan();
    }
    
    
}
